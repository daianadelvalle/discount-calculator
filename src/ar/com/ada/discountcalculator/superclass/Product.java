package ar.com.ada.discountcalculator.superclass;

import java.util.Objects;

public abstract class Product {

    //attr
    protected String name;
    protected Double cost;
    protected Double finalCost;
    protected Integer paymentMethod;

    //constructors
    public Product() {}
    public Product(Double cost) {
        this.cost = cost;
    }
    public Product(String name) {
        this.name = name;
    }
    public Product(Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public Product(String name, Double cost) {
        this.name = name;
        this.cost =cost;
    }
    public Product(String name, Double cost, Double finalCost) {
        this.name = name;
        this.cost = cost;
        this.finalCost = finalCost;
    }

    //getter and setter
    public Double getCost() {
        return cost;
    }
    public void setCost(Double cost) {
        this.cost = cost;
    }
    public Double getFinalCost() {
        return finalCost;
    }
    public void setFinalCost(Double finalCost) {
        this.finalCost = finalCost;
    }
    public Integer getPaymentMethod() {
        return paymentMethod;
    }
    public void setPaymentMethod(Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    //methods
    public abstract Double calculateDiscount();

    //
    @Override
    public int hashCode() {
        return -89 * Objects.hash(this.name, this.cost, this.finalCost);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product that = (Product) obj;
        return this.name.equals(that.name) && this.cost.equals(that.cost) && this.finalCost.equals(that.finalCost);
    }

    @Override
    public String toString() {
        return  name + "\n Precio de lista: " + cost + "- Precio final, con descuento: " + finalCost;
    }



}
