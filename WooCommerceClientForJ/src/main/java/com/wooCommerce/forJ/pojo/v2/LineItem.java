
package com.wooCommerce.forJ.pojo.v2;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class LineItem {

    @Expose
    private Integer id;
    @Expose
    private String subtotal;
    @SerializedName("subtotal_tax")
    @Expose
    private String subtotalTax;
    @Expose
    private String total;
    @SerializedName("total_tax")
    @Expose
    private String totalTax;
    @Expose
    private String price;
    @Expose
    private Integer quantity;
    @SerializedName("tax_class")
    @Expose
    private Object taxClass;
    @Expose
    private String name;
    @SerializedName("product_id")
    @Expose
    private Integer productId;
    @Expose
    private String sku;
    @Expose
    private List<Metum> meta = new ArrayList<Metum>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LineItem withId(Integer id) {
        this.id = id;
        return this;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public LineItem withSubtotal(String subtotal) {
        this.subtotal = subtotal;
        return this;
    }

    public String getSubtotalTax() {
        return subtotalTax;
    }

    public void setSubtotalTax(String subtotalTax) {
        this.subtotalTax = subtotalTax;
    }

    public LineItem withSubtotalTax(String subtotalTax) {
        this.subtotalTax = subtotalTax;
        return this;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public LineItem withTotal(String total) {
        this.total = total;
        return this;
    }

    public String getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(String totalTax) {
        this.totalTax = totalTax;
    }

    public LineItem withTotalTax(String totalTax) {
        this.totalTax = totalTax;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public LineItem withPrice(String price) {
        this.price = price;
        return this;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LineItem withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public Object getTaxClass() {
        return taxClass;
    }

    public void setTaxClass(Object taxClass) {
        this.taxClass = taxClass;
    }

    public LineItem withTaxClass(Object taxClass) {
        this.taxClass = taxClass;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LineItem withName(String name) {
        this.name = name;
        return this;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public LineItem withProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public LineItem withSku(String sku) {
        this.sku = sku;
        return this;
    }

    public List<Metum> getMeta() {
        return meta;
    }

    public void setMeta(List<Metum> meta) {
        this.meta = meta;
    }

    public LineItem withMeta(List<Metum> meta) {
        this.meta = meta;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
