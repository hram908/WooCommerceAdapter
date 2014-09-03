
package com.wooCommerce.forJ.pojo.v2;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Order {

    @Expose
    private Integer id;
    @SerializedName("order_number")
    @Expose
    private String orderNumber;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("completed_at")
    @Expose
    private String completedAt;
    @Expose
    private String status;
    @Expose
    private String currency;
    @Expose
    private String total;
    @Expose
    private String subtotal;
    @SerializedName("total_line_items_quantity")
    @Expose
    private Integer totalLineItemsQuantity;
    @SerializedName("total_tax")
    @Expose
    private String totalTax;
    @SerializedName("total_shipping")
    @Expose
    private String totalShipping;
    @SerializedName("cart_tax")
    @Expose
    private String cartTax;
    @SerializedName("shipping_tax")
    @Expose
    private String shippingTax;
    @SerializedName("total_discount")
    @Expose
    private String totalDiscount;
    @SerializedName("cart_discount")
    @Expose
    private String cartDiscount;
    @SerializedName("order_discount")
    @Expose
    private String orderDiscount;
    @SerializedName("shipping_methods")
    @Expose
    private String shippingMethods;
    @SerializedName("payment_details")
    @Expose
    private PaymentDetails paymentDetails;
    @SerializedName("billing_address")
    @Expose
    private BillingAddress billingAddress;
    @SerializedName("shipping_address")
    @Expose
    private ShippingAddress shippingAddress;
    @Expose
    private String note;
    @SerializedName("customer_ip")
    @Expose
    private String customerIp;
    @SerializedName("customer_user_agent")
    @Expose
    private String customerUserAgent;
    @SerializedName("customer_id")
    @Expose
    private String customerId;
    @SerializedName("view_order_url")
    @Expose
    private String viewOrderUrl;
    @SerializedName("line_items")
    @Expose
    private List<LineItem> lineItems = new ArrayList<LineItem>();
    @SerializedName("shipping_lines")
    @Expose
    private List<Object> shippingLines = new ArrayList<Object>();
    @SerializedName("tax_lines")
    @Expose
    private List<Object> taxLines = new ArrayList<Object>();
    @SerializedName("fee_lines")
    @Expose
    private List<Object> feeLines = new ArrayList<Object>();
    @SerializedName("coupon_lines")
    @Expose
    private List<Object> couponLines = new ArrayList<Object>();
    @Expose
    private Customer customer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Order withId(Integer id) {
        this.id = id;
        return this;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Order withOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Order withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Order withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }

    public Order withCompletedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Order withStatus(String status) {
        this.status = status;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Order withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Order withTotal(String total) {
        this.total = total;
        return this;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public Order withSubtotal(String subtotal) {
        this.subtotal = subtotal;
        return this;
    }

    public Integer getTotalLineItemsQuantity() {
        return totalLineItemsQuantity;
    }

    public void setTotalLineItemsQuantity(Integer totalLineItemsQuantity) {
        this.totalLineItemsQuantity = totalLineItemsQuantity;
    }

    public Order withTotalLineItemsQuantity(Integer totalLineItemsQuantity) {
        this.totalLineItemsQuantity = totalLineItemsQuantity;
        return this;
    }

    public String getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(String totalTax) {
        this.totalTax = totalTax;
    }

    public Order withTotalTax(String totalTax) {
        this.totalTax = totalTax;
        return this;
    }

    public String getTotalShipping() {
        return totalShipping;
    }

    public void setTotalShipping(String totalShipping) {
        this.totalShipping = totalShipping;
    }

    public Order withTotalShipping(String totalShipping) {
        this.totalShipping = totalShipping;
        return this;
    }

    public String getCartTax() {
        return cartTax;
    }

    public void setCartTax(String cartTax) {
        this.cartTax = cartTax;
    }

    public Order withCartTax(String cartTax) {
        this.cartTax = cartTax;
        return this;
    }

    public String getShippingTax() {
        return shippingTax;
    }

    public void setShippingTax(String shippingTax) {
        this.shippingTax = shippingTax;
    }

    public Order withShippingTax(String shippingTax) {
        this.shippingTax = shippingTax;
        return this;
    }

    public String getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(String totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public Order withTotalDiscount(String totalDiscount) {
        this.totalDiscount = totalDiscount;
        return this;
    }

    public String getCartDiscount() {
        return cartDiscount;
    }

    public void setCartDiscount(String cartDiscount) {
        this.cartDiscount = cartDiscount;
    }

    public Order withCartDiscount(String cartDiscount) {
        this.cartDiscount = cartDiscount;
        return this;
    }

    public String getOrderDiscount() {
        return orderDiscount;
    }

    public void setOrderDiscount(String orderDiscount) {
        this.orderDiscount = orderDiscount;
    }

    public Order withOrderDiscount(String orderDiscount) {
        this.orderDiscount = orderDiscount;
        return this;
    }

    public String getShippingMethods() {
        return shippingMethods;
    }

    public void setShippingMethods(String shippingMethods) {
        this.shippingMethods = shippingMethods;
    }

    public Order withShippingMethods(String shippingMethods) {
        this.shippingMethods = shippingMethods;
        return this;
    }

    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public Order withPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
        return this;
    }

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Order withBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Order withShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Order withNote(String note) {
        this.note = note;
        return this;
    }

    public String getCustomerIp() {
        return customerIp;
    }

    public void setCustomerIp(String customerIp) {
        this.customerIp = customerIp;
    }

    public Order withCustomerIp(String customerIp) {
        this.customerIp = customerIp;
        return this;
    }

    public String getCustomerUserAgent() {
        return customerUserAgent;
    }

    public void setCustomerUserAgent(String customerUserAgent) {
        this.customerUserAgent = customerUserAgent;
    }

    public Order withCustomerUserAgent(String customerUserAgent) {
        this.customerUserAgent = customerUserAgent;
        return this;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Order withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getViewOrderUrl() {
        return viewOrderUrl;
    }

    public void setViewOrderUrl(String viewOrderUrl) {
        this.viewOrderUrl = viewOrderUrl;
    }

    public Order withViewOrderUrl(String viewOrderUrl) {
        this.viewOrderUrl = viewOrderUrl;
        return this;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public Order withLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    public List<Object> getShippingLines() {
        return shippingLines;
    }

    public void setShippingLines(List<Object> shippingLines) {
        this.shippingLines = shippingLines;
    }

    public Order withShippingLines(List<Object> shippingLines) {
        this.shippingLines = shippingLines;
        return this;
    }

    public List<Object> getTaxLines() {
        return taxLines;
    }

    public void setTaxLines(List<Object> taxLines) {
        this.taxLines = taxLines;
    }

    public Order withTaxLines(List<Object> taxLines) {
        this.taxLines = taxLines;
        return this;
    }

    public List<Object> getFeeLines() {
        return feeLines;
    }

    public void setFeeLines(List<Object> feeLines) {
        this.feeLines = feeLines;
    }

    public Order withFeeLines(List<Object> feeLines) {
        this.feeLines = feeLines;
        return this;
    }

    public List<Object> getCouponLines() {
        return couponLines;
    }

    public void setCouponLines(List<Object> couponLines) {
        this.couponLines = couponLines;
    }

    public Order withCouponLines(List<Object> couponLines) {
        this.couponLines = couponLines;
        return this;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Order withCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
