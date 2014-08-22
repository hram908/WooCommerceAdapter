package com.prous.trdnpdf.tuvieja;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.httpclient.NameValuePair;
import org.junit.Before;
import org.junit.Test;

import com.joybug.pojo.Orders;

/**
 * Unit test for simple App.
 */
public class TestCase {
	private static String key, secret, url;

	@Before
	public void init() {
		secret = "cs_c184cb8055b47a1df6242b4dcc9318f9";
		key = "ck_db853a745d378b0944342c0ecc96535a";
		url = "http://joybug.net";
	}

	@Test
	public void AppTest() throws InvalidKeyException, UnsupportedEncodingException, NoSuchAlgorithmException {
		List<NameValuePair> array = new ArrayList<NameValuePair>();
		array.add(new NameValuePair("id","1867"));
		WooCommerceClientHelper woo = WooCommerceClientHelper.getInstance(secret, key, url);
		Orders wa = woo._make_api_call("orders", array, "GET");
	}

}
