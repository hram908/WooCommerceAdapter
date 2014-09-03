package com.wooCommerce.forJ.pojo.v1;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.wooCommerce.forJ.interfaces.OrdersInterface;

@Generated("org.jsonschema2pojo")
public class Orders implements OrdersInterface<Order>{

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

	public void setOrder(Order order) {
		this.order = order;
	}

	public Order getOrder() {
		return order;
	}

}
