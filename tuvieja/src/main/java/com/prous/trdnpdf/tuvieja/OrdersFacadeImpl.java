package com.prous.trdnpdf.tuvieja;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.lang3.StringUtils;

import com.google.gson.Gson;
import com.joybug.pojo.Order;
import com.joybug.pojo.Orders;

public class OrdersFacadeImpl implements OrdersFacade {
	private final String secret = "cs_c184cb8055b47a1df6242b4dcc9318f9";
	private final String key = "ck_db853a745d378b0944342c0ecc96535a";
	private final String url = "http://joybug.net";

	private final WooCommerceClientHelper wooClient = WooCommerceClientHelper.getInstance(secret, key, url);

	@Override
	public List<Order> getOrdersWithStatus(Statuses status, List<String> fields) throws Exception {
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new NameValuePair("status", status.getStatusName()));
		if (fields != null && !fields.isEmpty()) {
			params.add(new NameValuePair("fields", StringUtils.join(fields, ",")));
		}
		return new Gson().fromJson(wooClient._make_api_call("order", params, "GET"), Orders.class).getOrders();
	}

	@Override
	public Order getOrder(String id, List<String> fields) throws Exception {
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new NameValuePair("id", id));
		if (fields != null && !fields.isEmpty()) {
			params.add(new NameValuePair("fields", StringUtils.join(fields, ",")));
		}
		return new Gson().fromJson(wooClient._make_api_call("order", params, "GET"), Orders.class).getOrder();
	}

	@Override
	public void updateOrderStatus(Statuses status, String id) throws Exception {
		if (getOrder(id, null) != null) {
			List<NameValuePair> params = new ArrayList<NameValuePair>();
			params.add(new NameValuePair("id", id));
			params.add(new NameValuePair("status", status.getStatusName()));
			wooClient._make_api_call("order", params, "PUT");
		}

	}

}
