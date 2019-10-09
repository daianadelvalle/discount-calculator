package ar.com.ada.discountcalculator.subclass;

import ar.com.ada.discountcalculator.superclass.Product;

import java.util.Objects;

public class Clothes extends Product {

    //attr
    private Integer type;

    //constructors
    public Clothes() {
    }
    public Clothes(Integer type) {
        this.type = type;
    }
    public Clothes(Integer type, String name, Double cost) {
        super(name, cost);
        this.type = type;
    }
    public Clothes(Integer type, String name, Double cost, Double finalCost) {
        super(name, cost, finalCost);
        this.type = type;
    }

    //getter and setter
    public int getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }

    //methods
    @Override
    public Double calculateDiscount() {
        if (type == 1 || type == 2) {
            finalCost = cost - (cost * 0.15);
        } else {
            finalCost = cost;
        }
        return finalCost;
    }

    @Override
    public int hashCode() {
        return -54 * Objects.hash(this.type);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Clothes that = (Clothes) obj;
        return super.equals(that) && this.type.equals(that.type);
    }

    @Override
    public String toString() {
        return "Categoría: ROPA - " + name + "\n Precio de lista: " + cost + "- Precio final, con descuento: " + finalCost;
    }
}
