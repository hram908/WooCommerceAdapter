
package com.wooCommerce.forJ.pojo.v2;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Customer {

    @Expose
    private Integer id;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @Expose
    private String email;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @Expose
    private String username;
    @SerializedName("last_order_id")
    @Expose
    private String lastOrderId;
    @SerializedName("last_order_date")
    @Expose
    private String lastOrderDate;
    @SerializedName("orders_count")
    @Expose
    private Integer ordersCount;
    @SerializedName("total_spent")
    @Expose
    private String totalSpent;
    @SerializedName("avatar_url")
    @Expose
    private String avatarUrl;
    @SerializedName("billing_address")
    @Expose
    private BillingAddress_ billingAddress;
    @SerializedName("shipping_address")
    @Expose
    private ShippingAddress_ shippingAddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Customer withId(Integer id) {
        this.id = id;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Customer withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Customer withEmail(String email) {
        this.email = email;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Customer withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Customer withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Customer withUsername(String username) {
        this.username = username;
        return this;
    }

    public String getLastOrderId() {
        return lastOrderId;
    }

    public void setLastOrderId(String lastOrderId) {
        this.lastOrderId = lastOrderId;
    }

    public Customer withLastOrderId(String lastOrderId) {
        this.lastOrderId = lastOrderId;
        return this;
    }

    public String getLastOrderDate() {
        return lastOrderDate;
    }

    public void setLastOrderDate(String lastOrderDate) {
        this.lastOrderDate = lastOrderDate;
    }

    public Customer withLastOrderDate(String lastOrderDate) {
        this.lastOrderDate = lastOrderDate;
        return this;
    }

    public Integer getOrdersCount() {
        return ordersCount;
    }

    public void setOrdersCount(Integer ordersCount) {
        this.ordersCount = ordersCount;
    }

    public Customer withOrdersCount(Integer ordersCount) {
        this.ordersCount = ordersCount;
        return this;
    }

    public String getTotalSpent() {
        return totalSpent;
    }

    public void setTotalSpent(String totalSpent) {
        this.totalSpent = totalSpent;
    }

    public Customer withTotalSpent(String totalSpent) {
        this.totalSpent = totalSpent;
        return this;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Customer withAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    public BillingAddress_ getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(BillingAddress_ billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Customer withBillingAddress(BillingAddress_ billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    public ShippingAddress_ getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress_ shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Customer withShippingAddress(ShippingAddress_ shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
