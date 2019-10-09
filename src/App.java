import ar.com.ada.discountcalculator.subclass.Clothes;
import ar.com.ada.discountcalculator.subclass.Foods;
import ar.com.ada.discountcalculator.subclass.Tools;
import ar.com.ada.discountcalculator.subclass.Toys;
import ar.com.ada.discountcalculator.superclass.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        //array del stock en gondola
        Product[] products = new Product[12];

        products[0] = new Foods("lunes", "rice", 35.5);
        products[1] = new Foods("martes", "apple", 25.00);
        products[2] = new Foods("miércoles", "bread", 90.00);
        products[3] = new Toys("doll", 1500.00);
        products[4] = new Toys("car", 3500.00);
        products[5] = new Toys("tablet", 4000.00);
        products[6] = new Clothes(1, "bikini", 1200.00);
        products[7] = new Clothes(2, "short", 560.00);
        products[8] = new Clothes(3, "shirt", 2000.00);
        products[9] = new Tools("hammer", 1800.00);
        products[10] = new Tools("screwdriver", 550.50);
        products[11] = new Tools("saw", 700.10);

        //Array list de la cesta de compras
        ArrayList<Product> purchase = new ArrayList<Product>();

        int answer;

        for (int i = 0; i < products.length; i++) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Desea agregar este producto al carrito?"+products[i]+"Igrese: 1 : SÍ  o 2: NO");
            answer = keyboard.nextInt();
            if (answer == 1) {
                purchase.add(products[i]);
            }

        }
        for (int j = 0; j < purchase.size(); j++) {
            Product pourchases = purchase.get(j);
            System.out.println("El area de la figura " + (j + 1) + " es:  " + pourchases.calculateDiscount());
            System.out.println("Y la figura es: " + purchase.toString());
            System.out.println();
        }









    }
}
