package com.wooCommerce.forJ.client;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 * 
 */
public class WooCommerceClientHelper {

	public enum ApiVersion {
		v1, v2
	}

	public enum ApiElements {
		orders, products, coupons, customers, reports
	}

	private static final String ENC = "HMAC-SHA256";
	private static final String API_URL = "/wc-api/";
	private static final String HASH_ALGORITHM = "HmacSHA256";
	private static Base64 base64 = new Base64();
	private static WooCommerceClientHelper instance;

	private String secret;
	private String key;
	private String url;
	private String version;

	protected WooCommerceClientHelper() {

	}

	public static WooCommerceClientHelper getInstance() {
		if (instance == null) {
			instance = new WooCommerceClientHelper();
		}
		return instance;
	}

	public static WooCommerceClientHelper getInstance(String secret, String key, String url, ApiVersion api) {
		instance = getInstance();
		instance.version = api.toString() + "/";
		instance.key = key;
		instance.secret = secret;
		instance.url = url;
		return instance;
	}

	public String _make_api_call(String endpoint, List<NameValuePair> params, String method)
			throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {
		if (params == null) {
			params = new ArrayList<NameValuePair>();
		} else {
			NameValuePair id = null;
			for (NameValuePair nameValuePair : params) {
				if (nameValuePair.getName().equals("id")) {
					id = nameValuePair;
				}
			}
			if (id != null) {
				params.remove(id);
				endpoint = endpoint + "/" + id.getValue();
			}
		}

		if (method == null) {
			method = "GET";
		}

		params.add(new NameValuePair("oauth_consumer_key", key));
		params.add(new NameValuePair("oauth_timestamp", time()));

		params.add(new NameValuePair("oauth_nonce", sha1(microtime())));

		params.add(new NameValuePair("oauth_signature_method", ENC));

		params.add(new NameValuePair("oauth_signature", generate_oauth_signature(params, method, endpoint)));

		String parametersQuery = "?" + UrlBuilder.httpBuildQuery(parameterListToMap(params), ENC);

		HttpClient client = new HttpClient();

		client.getParams().setParameter(HttpMethodParams.USER_AGENT,
				"Mozilla/5.0 (Windows; U; Windows NT 6.1; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");

		HttpMethod meth = null;
		if (method.equalsIgnoreCase("POST") || method.equalsIgnoreCase("PUT")) {
			PostMethod trans = new PostMethod(url + API_URL + version + endpoint+parametersQuery) {
				@Override
				public boolean getFollowRedirects() {
					return true;
				}
			};
			for (NameValuePair nameValuePair : params) {				
				trans.addParameter(nameValuePair);
			}
			meth = trans;

		} else {

			meth = new GetMethod(url + API_URL + version + endpoint + parametersQuery) {
				@Override
				public boolean getFollowRedirects() {
					return true;
				}

			};
		}

		String body = null;
		try {
			client.executeMethod(meth);

			body = meth.getResponseBodyAsString();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// release any connection resources used by the method
			meth.releaseConnection();
		}

		return body;

	}

	private String microtime() {
		long mstime = System.currentTimeMillis();
		long seconds = mstime / 1000;
		double decimal = (mstime - (seconds * 1000)) / 1000d;
		return String.valueOf(decimal);
	}

	private String time() {
		return String.valueOf(new Date().getTime()).substring(0, 10);
	}

	private String generate_oauth_signature(List<NameValuePair> params, String httpmethod, String endpoint)
			throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {
		String base_request_uri = URLEncoder.encode(url + API_URL + version + endpoint, "UTF-8");
		params = normalize_parameters(params);

		uksort(params);

		List<String> queryParams = new ArrayList<String>();
		for (NameValuePair param : params) {
			queryParams.add(param.getName() + "%3D" + param.getValue());
		}

		String queryString = implode("%26", queryParams);

		return getSignature(base_request_uri, queryString, httpmethod);

	}

	private static void uksort(List<NameValuePair> array) {
		Collections.sort(array, new Comparator<NameValuePair>() {
			public int compare(NameValuePair o1, NameValuePair o2) {
				return o1.getName().compareTo(o2.getName());
			};
		});
	}

	private static List<NameValuePair> normalize_parameters(List<NameValuePair> parameters)
			throws UnsupportedEncodingException {

		List<NameValuePair> normalized = new ArrayList<NameValuePair>();
		for (NameValuePair parameter : parameters) {
			String key = rawurlencode(parameter.getName()).replace("%", "%25");
			String value = rawurlencode(parameter.getValue()).replace("%", "%25");
			normalized.add(new NameValuePair(key, value));
		}

		return normalized;
	}

	private static String rawurlencode(String string) throws UnsupportedEncodingException {
		return URLEncoder.encode(string, "UTF-8");
	}

	private static String implode(String separator, List<String> elems) {
		return StringUtils.join(elems, separator);
	}

	private static Map<String, Object> parameterListToMap(List<NameValuePair> params) {
		Map<String, Object> map = new HashMap<String, Object>();
		for (NameValuePair parameter : params) {
			map.put(parameter.getName(), parameter.getValue());
		}
		return map;
	}

	private String getSignature(String url, String params, String method) throws UnsupportedEncodingException,
			NoSuchAlgorithmException, InvalidKeyException {
		/**
		 * base has three parts, they are connected by "&": 1) protocol 2) URL
		 * (need to be URLEncoded) 3) Parameter List (need to be URLEncoded).
		 */
		StringBuilder base = new StringBuilder();
		base.append(method.toUpperCase() + "&");
		base.append(url);
		base.append("&");
		base.append(params);

		byte[] keyBytes = (secret).getBytes();

		SecretKey key = new SecretKeySpec(keyBytes, HASH_ALGORITHM);

		Mac mac = Mac.getInstance(HASH_ALGORITHM);
		mac.init(key);

		String signa = new String(base64.encode(mac.doFinal(base.toString().getBytes("UTF-8"))), "UTF-8").trim();

		return signa;
	}

	private static String sha1(String password) {
		String sha1 = "";
		try {
			MessageDigest crypt = MessageDigest.getInstance("SHA-1");
			crypt.reset();
			crypt.update(password.getBytes());
			sha1 = byteToHex(crypt.digest());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return sha1;
	}

	private static String byteToHex(final byte[] hash) {
		Formatter formatter = new Formatter();
		for (byte b : hash) {
			formatter.format("%02x", b);
		}
		String result = formatter.toString();
		formatter.close();
		return result;
	}
	
	

}
