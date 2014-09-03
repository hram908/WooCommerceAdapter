package com.wooCommerce.forJ.interfaces;

import java.util.List;

public interface OrdersInterface<T> {

	T getOrder();
	
	List<T> getOrders();
}
