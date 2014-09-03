package com.wooCommerce.forJ.facade;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.lang3.StringUtils;

import com.google.gson.Gson;
import com.wooCommerce.forJ.client.WooCommerceClientHelper;
import com.wooCommerce.forJ.client.WooCommerceClientHelper.ApiElements;
import com.wooCommerce.forJ.client.WooCommerceClientHelper.ApiVersion;
import com.wooCommerce.forJ.facade.OrdersFacade.Statuses;
import com.wooCommerce.forJ.interfaces.OrdersInterface;
import com.wooCommerce.forJ.pojo.v1.Order;
import com.wooCommerce.forJ.pojo.v1.Orders;
@SuppressWarnings("unchecked")
public class OrdersFacadeImpl implements OrdersFacade {
	// private final String secret = "cs_c184cb8055b47a1df6242b4dcc9318f9";
	// private final String key = "ck_db853a745d378b0944342c0ecc96535a";
	// private final String url = "http://joybug.net";

	private WooCommerceClientHelper wooClient;

	public OrdersFacadeImpl(String secret, String key, String url, ApiVersion api) {
		wooClient = WooCommerceClientHelper.getInstance(secret, key, url, api);
	}

	
	public <T extends OrdersInterface<U>, U> List<U> getOrdersWithStatus(
			Statuses status, List<String> fields, T type) throws Exception {
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new NameValuePair("status", status.getStatusName()));
		if (fields != null && !fields.isEmpty()) {
			params.add(new NameValuePair("fields", StringUtils
					.join(fields, ",")));
		}
		return (List<U>) new Gson().fromJson(callApi(params, "GET"),
				type.getClass()).getOrders();
	}

	@Override
	public <T extends OrdersInterface<U>, U> U getOrder(String id,
			List<String> fields, T type) throws Exception {
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new NameValuePair("id", id));
		if (fields != null && !fields.isEmpty()) {
			params.add(new NameValuePair("fields", StringUtils
					.join(fields, ",")));
		}
		return (U) new Gson().fromJson(callApi(params, "GET"), type.getClass())
				.getOrder();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public <T extends OrdersInterface> void updateOrderStatus(Statuses status,
			String id, T type) throws Exception {
		if (getOrder(id, null, type) != null) {
			List<NameValuePair> params = new ArrayList<NameValuePair>();
			params.add(new NameValuePair("id", id));
			params.add(new NameValuePair("status", status.getStatusName()));
			callApi(params,"PUT");
		}

	}

	private String callApi(List<NameValuePair> params, String method)
			throws InvalidKeyException, UnsupportedEncodingException,
			NoSuchAlgorithmException {

		return wooClient._make_api_call(ApiElements.orders.toString(), params,
				method);
	}

}
