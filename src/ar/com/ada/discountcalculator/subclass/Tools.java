package ar.com.ada.discountcalculator.subclass;

import ar.com.ada.discountcalculator.superclass.Product;

import java.util.Objects;
import java.util.Scanner;

public class Tools extends Product {

    //attr
    private Integer paymentMethod;

    //constructors
    public Tools() {
    }

    public Tools(Integer paymentMethod) {
        super(paymentMethod);
    }

    public Tools(String name, Double cost) {
        super(name, cost);
    }

    public Tools(Integer paymentMethod, String name, Double cost, Double finalCost) {
        super(name, cost, finalCost);
        this.paymentMethod = paymentMethod;
    }

    //getter and setter
    public Integer getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    //methods
    @Override
    public Double calculateDiscount() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese el método de pago: \n Efectivo: 1\n TDC: 2");
        paymentMethod = keyboard.nextInt();
        if (paymentMethod == 2) {
            finalCost = cost - (cost * 0.05);
        } else {
            finalCost = cost;
        }
        return finalCost;
    }

    @Override
    public int hashCode() {
        return -54 * Objects.hash(this.paymentMethod);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Tools that = (Tools) obj;
        return super.equals(that) && this.paymentMethod.equals(that.paymentMethod);
    }

    @Override
    public String toString() {
        return "Categoría: HERRAMIENTAS-" +name+ "\n Precio de lista: " + cost + "- Precio final, con descuento: " + finalCost;
    }

}
