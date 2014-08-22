
package com.joybug.pojo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Customer {

    @SerializedName("avatar_url")
    @Expose
    private String avatarUrl;
    @SerializedName("billing_address")
    @Expose
    private BillingAddress_ billingAddress;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @Expose
    private String email;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @Expose
    private Integer id;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("last_order_date")
    @Expose
    private String lastOrderDate;
    @SerializedName("last_order_id")
    @Expose
    private String lastOrderId;
    @SerializedName("orders_count")
    @Expose
    private Integer ordersCount;
    @SerializedName("shipping_address")
    @Expose
    private ShippingAddress shippingAddress;
    @SerializedName("total_spent")
    @Expose
    private String totalSpent;
    @Expose
    private String username;

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public BillingAddress_ getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(BillingAddress_ billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastOrderDate() {
        return lastOrderDate;
    }

    public void setLastOrderDate(String lastOrderDate) {
        this.lastOrderDate = lastOrderDate;
    }

    public String getLastOrderId() {
        return lastOrderId;
    }

    public void setLastOrderId(String lastOrderId) {
        this.lastOrderId = lastOrderId;
    }

    public Integer getOrdersCount() {
        return ordersCount;
    }

    public void setOrdersCount(Integer ordersCount) {
        this.ordersCount = ordersCount;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getTotalSpent() {
        return totalSpent;
    }

    public void setTotalSpent(String totalSpent) {
        this.totalSpent = totalSpent;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
