package com.wooCommerce.forJ.testCase;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.httpclient.NameValuePair;
import org.junit.Before;
import org.junit.Test;

import com.wooCommerce.forJ.client.WooCommerceClientHelper;
import com.wooCommerce.forJ.client.WooCommerceClientHelper.ApiVersion;
import com.wooCommerce.forJ.facade.OrdersFacade;
import com.wooCommerce.forJ.facade.OrdersFacade.Statuses;
import com.wooCommerce.forJ.facade.OrdersFacadeImpl;
import com.wooCommerce.forJ.pojo.v1.Order;
import com.wooCommerce.forJ.pojo.v1.Orders;
import com.wooCommerce.forJ.pojo.v2.LineItem;
import com.wooCommerce.forJ.pojo.v2.Metum;

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
	public void AppTest() throws InvalidKeyException,
			UnsupportedEncodingException, NoSuchAlgorithmException {
		List<NameValuePair> array = new ArrayList<NameValuePair>();
		// array.add(new NameValuePair("type","variable-subscription"));
		WooCommerceClientHelper woo = WooCommerceClientHelper.getInstance(
				secret, key, url, ApiVersion.v2);
		// String wa = woo._make_api_call("products", array, "GET");
		String wa = woo._make_api_call("orders", array, "GET");
		System.out.println(wa);
	}

	@Test
	public void OrdersTestV1() throws Exception {
		OrdersFacade a = new OrdersFacadeImpl(secret, key, url, ApiVersion.v1);
		for (Order order : a.getOrdersWithStatus(Statuses.completed, null,
				new Orders())) {
			System.out.println(order.getCustomerId());
		}

	}

	@Test
	public void OrdersTestV2() throws Exception {
		OrdersFacade a = new OrdersFacadeImpl(secret, key, url, ApiVersion.v2);
		for (com.wooCommerce.forJ.pojo.v2.Order order : a.getOrdersWithStatus(
				Statuses.completed, null,
				new com.wooCommerce.forJ.pojo.v2.Orders())) {
			for (LineItem line : order.getLineItems()) {
				for (Metum meta : line.getMeta()) {
					try {
						System.out.println(meta.getDateValue("hh:mm aa"));
					} catch (Exception e) {
						try {
							System.out.println(meta.getDateValue("hhmm-aa"));
						} catch (Exception e2) {
							System.out.println(meta.getValue());
						}
					}
				}

			}
			System.out.println(order);
		}

	}
}
