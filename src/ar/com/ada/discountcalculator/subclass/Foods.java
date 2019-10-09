package ar.com.ada.discountcalculator.subclass;

import ar.com.ada.discountcalculator.superclass.Product;

import java.util.Objects;

public class Foods extends Product {

    //attr
    private String day;

    //constructors
    public Foods() {
    }
    public Foods(String day) {
        this.day = day;
    }
    public Foods(String day, String name, Double cost) {
        super(name, cost);
        this.cost = cost;

    }
    public Foods(String day, String name, Double cost, Double finalCost) {
        super(name, cost, finalCost);
        this.day = day;
    }

    //getter and setter
    public String getDay() {
        return day;
    }
    public void setDay(String day) {
        this.day = day;
    }

    //methods
    @Override
    public Double calculateDiscount() {
        if (day == "martes" || day == "jueves") {
            finalCost = cost - (cost * 0.10);
        } else {
            finalCost = cost;
        }
        return finalCost;
    }

    @Override
    public int hashCode() {
        return -54 * Objects.hash(this.name, this.day);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Foods that = (Foods) obj;
        return super.equals(that) && this.day.equals(that.day);
    }

    @Override
    public String toString() {
        return "Categoría: ALIMENTOS - "+ name+" \n Precio de lista: " + cost + "- Precio final, con descuento: " + finalCost;
    }


}
