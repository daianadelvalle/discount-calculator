package ar.com.ada.discountcalculator.superclass;

import java.util.Objects;

public abstract class Product {

    //attr
    protected String name;
    protected Double cost;
    protected Double discount;
    protected Integer paymentMethod;
    protected Double finalCost;

    //constructors
    public Product() {}
    public Product(String name) {
        this.name = name;
    }
    public Product(Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public Product(Double discount) {
        this.discount = discount;
    }
    public Product(String name, Double cost) {
        this.name = name;
        this.cost =cost;
    }
    public Product(String name, Double cost, Double discount) {
        this.name = name;
        this.cost = cost;
        this.discount = discount;
    }

    //getter and setter
    public Double getCost() {
        return cost;
    }
    public void setCost(Double cost) {
        this.cost = cost;
    }
    public Double getDiscount() {
        return discount;
    }
    public void setDiscount() {
        this.discount= discount;
    }
    public Double getFinalCost() {
        return discount;
    }
    public void setFinalCost(Double finalCost) {
        this.discount = finalCost;
    }
    public Integer getPaymentMethod() {
        return paymentMethod;
    }
    public void setPaymentMethod(Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    //methods
    public abstract Double calculateDiscount();
    public abstract void showDiscount();

    //
    @Override
    public int hashCode() {
        return -89 * Objects.hash(this.name, this.cost, this.discount);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product that = (Product) obj;
        return this.name.equals(that.name) && this.cost.equals(that.cost) && this.discount.equals(that.discount);
    }

    @Override
    public String toString() {
        return  name + "\n Precio de lista: " + cost;
    }



}
