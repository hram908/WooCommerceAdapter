
package com.joybug.pojo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class LineItem {

    @Expose
    private Integer id;
    @Expose
    private String name;
    @Expose
    private String price;
    @SerializedName("product_id")
    @Expose
    private Integer productId;
    @Expose
    private Integer quantity;
    @Expose
    private String sku;
    @Expose
    private String subtotal;
    @SerializedName("tax_class")
    @Expose
    private Object taxClass;
    @Expose
    private String total;
    @SerializedName("total_tax")
    @Expose
    private String totalTax;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public Object getTaxClass() {
        return taxClass;
    }

    public void setTaxClass(Object taxClass) {
        this.taxClass = taxClass;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(String totalTax) {
        this.totalTax = totalTax;
    }

}
