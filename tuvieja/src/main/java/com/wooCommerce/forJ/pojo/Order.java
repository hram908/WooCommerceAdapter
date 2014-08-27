
package com.wooCommerce.forJ.pojo;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Order {

    @SerializedName("billing_address")
    @Expose
    private BillingAddress billingAddress;
    @SerializedName("cart_discount")
    @Expose
    private String cartDiscount;
    @SerializedName("cart_tax")
    @Expose
    private String cartTax;
    @SerializedName("completed_at")
    @Expose
    private String completedAt;
    @SerializedName("coupon_lines")
    @Expose
    private List<Object> couponLines = new ArrayList<Object>();
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @Expose
    private String currency;
    @Expose
    private Customer customer;
    @SerializedName("customer_id")
    @Expose
    private String customerId;
    @SerializedName("customer_ip")
    @Expose
    private String customerIp;
    @SerializedName("customer_user_agent")
    @Expose
    private String customerUserAgent;
    @SerializedName("fee_lines")
    @Expose
    private List<Object> feeLines = new ArrayList<Object>();
    @Expose
    private Integer id;
    @SerializedName("line_items")
    @Expose
    private List<LineItem> lineItems = new ArrayList<LineItem>();
    @Expose
    private String note;
    @SerializedName("order_discount")
    @Expose
    private String orderDiscount;
    @SerializedName("order_number")
    @Expose
    private String orderNumber;
    @SerializedName("payment_details")
    @Expose
    private PaymentDetails paymentDetails;
    @SerializedName("shipping_address")
    @Expose
    private ShippingAddress_ shippingAddress;
    @SerializedName("shipping_lines")
    @Expose
    private List<Object> shippingLines = new ArrayList<Object>();
    @SerializedName("shipping_methods")
    @Expose
    private String shippingMethods;
    @SerializedName("shipping_tax")
    @Expose
    private String shippingTax;
    @Expose
    private String status;
    @Expose
    private String subtotal;
    @SerializedName("tax_lines")
    @Expose
    private List<Object> taxLines = new ArrayList<Object>();
    @Expose
    private String total;
    @SerializedName("total_discount")
    @Expose
    private String totalDiscount;
    @SerializedName("total_line_items_quantity")
    @Expose
    private Integer totalLineItemsQuantity;
    @SerializedName("total_shipping")
    @Expose
    private String totalShipping;
    @SerializedName("total_tax")
    @Expose
    private String totalTax;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("view_order_url")
    @Expose
    private String viewOrderUrl;

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getCartDiscount() {
        return cartDiscount;
    }

    public void setCartDiscount(String cartDiscount) {
        this.cartDiscount = cartDiscount;
    }

    public String getCartTax() {
        return cartTax;
    }

    public void setCartTax(String cartTax) {
        this.cartTax = cartTax;
    }

    public String getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }

    public List<Object> getCouponLines() {
        return couponLines;
    }

    public void setCouponLines(List<Object> couponLines) {
        this.couponLines = couponLines;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerIp() {
        return customerIp;
    }

    public void setCustomerIp(String customerIp) {
        this.customerIp = customerIp;
    }

    public String getCustomerUserAgent() {
        return customerUserAgent;
    }

    public void setCustomerUserAgent(String customerUserAgent) {
        this.customerUserAgent = customerUserAgent;
    }

    public List<Object> getFeeLines() {
        return feeLines;
    }

    public void setFeeLines(List<Object> feeLines) {
        this.feeLines = feeLines;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getOrderDiscount() {
        return orderDiscount;
    }

    public void setOrderDiscount(String orderDiscount) {
        this.orderDiscount = orderDiscount;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public ShippingAddress_ getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress_ shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public List<Object> getShippingLines() {
        return shippingLines;
    }

    public void setShippingLines(List<Object> shippingLines) {
        this.shippingLines = shippingLines;
    }

    public String getShippingMethods() {
        return shippingMethods;
    }

    public void setShippingMethods(String shippingMethods) {
        this.shippingMethods = shippingMethods;
    }

    public String getShippingTax() {
        return shippingTax;
    }

    public void setShippingTax(String shippingTax) {
        this.shippingTax = shippingTax;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public List<Object> getTaxLines() {
        return taxLines;
    }

    public void setTaxLines(List<Object> taxLines) {
        this.taxLines = taxLines;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(String totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public Integer getTotalLineItemsQuantity() {
        return totalLineItemsQuantity;
    }

    public void setTotalLineItemsQuantity(Integer totalLineItemsQuantity) {
        this.totalLineItemsQuantity = totalLineItemsQuantity;
    }

    public String getTotalShipping() {
        return totalShipping;
    }

    public void setTotalShipping(String totalShipping) {
        this.totalShipping = totalShipping;
    }

    public String getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(String totalTax) {
        this.totalTax = totalTax;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getViewOrderUrl() {
        return viewOrderUrl;
    }

    public void setViewOrderUrl(String viewOrderUrl) {
        this.viewOrderUrl = viewOrderUrl;
    }

}
