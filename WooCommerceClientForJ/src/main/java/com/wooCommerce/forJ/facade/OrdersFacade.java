package com.wooCommerce.forJ.facade;

import java.util.List;
import java.util.Map;

import com.wooCommerce.forJ.interfaces.OrdersInterface;

public interface OrdersFacade {
	public enum Statuses {
		pending("pending"), onHold("on-hold"), processing("processing"), completed("completed"), refunded("refunded"), failed(
				"failed"), cancelled("cancelled"), subscribed("subscribed"), unsubscribed("unsubscribed");

		private final String statusName;

		private Statuses(String status) {
			statusName = status;
		}

		public String getStatusName() {
			return statusName;
		}
	}

	public enum Filters {
		created_at_min, created_at_max, updated_at_min, updated_at_max
	}

	public <T extends OrdersInterface<U>, U> List<U> getOrdersWithStatus(Statuses status, List<String> fields, T type)
			throws Exception;

	public <T extends OrdersInterface<U>, U> List<U> getOrdersWithStatusAndFilter(Statuses status, List<String> fields,
			T type, Map<Filters, String> filters) throws Exception;

	public <T extends OrdersInterface<U>, U> U getOrder(String id, List<String> fields, T type) throws Exception;

	public <T extends OrdersInterface<U>, U> List<U> getOrdersWithFilters(List<String> fields, T type,
			Map<Filters, String> filters) throws Exception;

	public <T extends OrdersInterface> void updateOrderStatus(Statuses status, String id, T type) throws Exception;
}
