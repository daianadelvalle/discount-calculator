package ar.com.ada.discountcalculator.subclass;

import ar.com.ada.discountcalculator.superclass.Product;

import java.util.Objects;

public class Toys extends Product {

    //attr
    private Integer quantity;

    //constructors
    public Toys() {
    }

    public Toys(Integer quantity) {
        this.quantity = quantity;
    }

    public Toys(String name, Double cost) {
        super(name, cost);
    }

    public Toys( String name, Double cost, Double finalCost) {
        super(name, cost, finalCost);
    }

    //getter and setter
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    //methods
    @Override
    public Double calculateDiscount() {
        if (quantity > 3 || cost > 3000) {
            finalCost = cost - (cost * 0.25);
        } else {
            finalCost = cost;
        }
        return finalCost;
    }

    @Override
    public int hashCode() {
        return -54 * Objects.hash(this.name, this.quantity);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Toys that = (Toys) obj;
        return super.equals(that) && this.quantity.equals(that.quantity);
    }

    @Override
    public String toString() {
        return "Categoría: JUGUETES -"+name+" \n Precio de lista: " + cost + "- Precio final, con descuento: " + finalCost;
    }

}
