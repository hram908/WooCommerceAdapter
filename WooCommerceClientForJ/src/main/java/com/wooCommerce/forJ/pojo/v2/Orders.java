package com.wooCommerce.forJ.pojo.v2;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.wooCommerce.forJ.interfaces.OrdersInterface;

@Generated("org.jsonschema2pojo")
public class Orders implements OrdersInterface<Order> {

	@Expose
	private List<Order> orders = new ArrayList<Order>();

	@Expose
	private Order order;

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Orders withOrders(List<Order> orders) {
		this.orders = orders;
		return this;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public Order getOrder() {

		return order;
	}

}
