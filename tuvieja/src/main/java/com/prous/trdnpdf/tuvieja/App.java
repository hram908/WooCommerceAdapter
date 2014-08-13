package com.prous.trdnpdf.tuvieja;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 * 
 */
public class App {

	private static final String API_URL = "http://joybug.net/wc-api/v1/";
	private static final String HASH_ALGORITHM = "SHA1";

	public static void main(String[] args) {

		// $params['oauth_consumer_key'] = $this->_consumer_key;
		// $params['oauth_timestamp'] = time();
		// $params['oauth_nonce'] = sha1( microtime() );
		// $params['oauth_signature_method'] = 'HMAC-' . self::HASH_ALGORITHM;
		// $params['oauth_signature'] = $this->generate_oauth_signature(
		// $params, $method, $endpoint );

		System.out.println("Hello World!");

	}

	public static void _make_api_call(String endpoint, List<Parameter> params, String method) {
		if (params == null) {
			params = new ArrayList<Parameter>();
		}

		if (method == null) {
			method = "GET";
		}
		params.add(new Parameter("oauth_consumer_key", "ck_db853a745d378b0944342c0ecc96535a"));
		params.add(new Parameter("oauth_timestamp", time()));
		params.add(new Parameter("oauth_nonce", microtime()));
		params.add(new Parameter("oauth_signature_method", "HMAC-SHA1"));
	}

	public static String microtime() {
		long mstime = System.currentTimeMillis();
		long seconds = mstime / 1000;
		double decimal = (mstime - (seconds * 1000)) / 1000d;
		return String.valueOf(decimal);
	}

	public static String time() {
		return String.valueOf(new Date().getTime());
	}

	public static void generate_oauth_signature(List<Parameter> params, String httpmethod, String endpoint)
			throws UnsupportedEncodingException {
		String base_request_uri = URLEncoder.encode(API_URL + endpoint, "UTF-8");
		params = normalize_parameters(params);
		
		uksort(params);
		
		List<String> queryParams = new ArrayList<String>();
		for (Parameter param : params) {
			queryParams.add(param.getName()+"%3D"+param.getValue());
		}
		
		String queryString = implode("%26", queryParams);
		String string_to_sign=httpmethod+"&"+base_request_uri+"&"+queryString;
		
		byte[] encodedBytes = Base64.encodeBase64("Test".getBytes());
		// public function generate_oauth_signature( $params, $http_method,
		// $endpoint ) {
		// $base_request_uri = rawurlencode( $this->_api_url . $endpoint );
		//
		// // normalize parameter key/values and sort them
		// $params = $this->normalize_parameters( $params );
		// uksort( $params, 'strcmp' );
		//
		// // form query string
		// $query_params = array();
		// foreach ( $params as $param_key => $param_value ) {
		// $query_params[] = $param_key . '%3D' . $param_value; // join with
		// equals sign
		// }
		//
		// $query_string = implode( '%26', $query_params ); // join with
		// ampersand
		//
		// // form string to sign (first key)
		// $string_to_sign = $http_method . '&' . $base_request_uri . '&' .
		// $query_string;
		//
		// return base64_encode( hash_hmac( self::HASH_ALGORITHM,
		// $string_to_sign, $this->_consumer_secret, true ) );
		// }
	}
	
	private static void uksort(List<Parameter> array){
		Collections.sort(array, new Comparator<Parameter>() {
			public int compare(Parameter o1, Parameter o2) {
				return o1.getName().compareTo(o2.getName());
			};
		});
	}

	private static List<Parameter> normalize_parameters(List<Parameter> parameters) throws UnsupportedEncodingException {

		List<Parameter> normalized = new ArrayList<Parameter>();
		for (Parameter parameter : parameters) {
			String key = rawurlencode(parameter.getName()).replace("%", "%25");
			String value = rawurlencode(parameter.getValue()).replace("%", "%25");
			normalized.add(new Parameter(key, value));
		}

		return normalized;
	}
	
	private static String rawurlencode(String string) throws UnsupportedEncodingException{
		return URLEncoder.encode(string, "UTF-8");
	}
	
	private static String implode(String separator, List<String> elems){
		return StringUtils.join(elems,separator);
	}
}
