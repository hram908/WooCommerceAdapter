package com.wooCommerce.forJ.facade;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.lang3.StringUtils;

import com.google.gson.Gson;
import com.wooCommerce.forJ.client.WooCommerceClientHelper;
import com.wooCommerce.forJ.client.WooCommerceClientHelper.ApiElements;
import com.wooCommerce.forJ.client.WooCommerceClientHelper.ApiVersion;
import com.wooCommerce.forJ.interfaces.OrdersInterface;

@SuppressWarnings("unchecked")
public class OrdersFacadeImpl implements OrdersFacade {

	private WooCommerceClientHelper wooClient;

	public OrdersFacadeImpl(String secret, String key, String url, ApiVersion api) {
		wooClient = WooCommerceClientHelper.getInstance(secret, key, url, api);
	}

	public <T extends OrdersInterface<U>, U> List<U> getOrdersWithStatus(Statuses status, List<String> fields, T type)
			throws Exception {
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new NameValuePair("status", status.getStatusName()));
		if (fields != null && !fields.isEmpty()) {
			params.add(new NameValuePair("fields", StringUtils.join(fields, ",")));
		}
		return (List<U>) new Gson().fromJson(callApi(params, "GET"), type.getClass()).getOrders();
	}

	@Override
	public <T extends OrdersInterface<U>, U> U getOrder(String id, List<String> fields, T type) throws Exception {
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new NameValuePair("id", id));
		if (fields != null && !fields.isEmpty()) {
			params.add(new NameValuePair("fields", StringUtils.join(fields, ",")));
		}
		return (U) new Gson().fromJson(callApi(params, "GET"), type.getClass()).getOrder();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public <T extends OrdersInterface> void updateOrderStatus(Statuses status, String id, T type) throws Exception {
		if (getOrder(id, null, type) != null) {
			List<NameValuePair> params = new ArrayList<NameValuePair>();
			params.add(new NameValuePair("id", id));
			params.add(new NameValuePair("status", status.getStatusName()));
			callApi(params, "POST");
		}

	}

	private String callApi(List<NameValuePair> params, String method) throws InvalidKeyException,
			UnsupportedEncodingException, NoSuchAlgorithmException {

		return wooClient._make_api_call(ApiElements.orders.toString(), params, method);
	}

	@Override
	public <T extends OrdersInterface<U>, U> List<U> getOrdersWithStatusAndFilter(Statuses status, List<String> fields,
			T type, Map<Filters, String> filters) throws Exception {
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new NameValuePair("status", status.getStatusName()));
		if (fields != null && !fields.isEmpty()) {
			params.add(new NameValuePair("fields", StringUtils.join(fields, ",")));
		}

		if (!filters.isEmpty()) {
			for (Map.Entry<Filters, String> ent : filters.entrySet()) {
				params.add(new NameValuePair("filter[" + ent.getKey().toString() + "]", ent.getValue()));
			}

		}
		return (List<U>) new Gson().fromJson(callApi(params, "GET"), type.getClass()).getOrders();
	}

	@Override
	public <T extends OrdersInterface<U>, U> List<U> getOrdersWithFilters(List<String> fields, T type,
			Map<Filters, String> filters) throws Exception {
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		if (fields != null && !fields.isEmpty()) {
			params.add(new NameValuePair("fields", StringUtils.join(fields, ",")));
		}
		if (!filters.isEmpty()) {
			for (Map.Entry<Filters, String> ent : filters.entrySet()) {
				params.add(new NameValuePair("filter[" + ent.getKey().toString() + "]", ent.getValue()));
			}

		}
		return (List<U>) new Gson().fromJson(callApi(params, "GET"), type.getClass()).getOrders();
	}

}
