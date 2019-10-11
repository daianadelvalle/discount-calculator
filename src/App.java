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

        products[0] = new Foods("lunes", "RICE", 35.5);
        products[1] = new Foods("martes", "apple", 25.00);
        products[2] = new Foods("miércoles", "bread", 90.00);
        products[3] = new Toys("doll", 1500.00, 1);
        products[4] = new Toys("car", 3500.00, 1);
        products[5] = new Toys("tablet", 4000.00, 1);
        products[6] = new Clothes(1, "bikini", 1200.00);
        products[7] = new Clothes(2, "short", 560.00);
        products[8] = new Clothes(3, "shirt", 2000.00);
        products[9] = new Tools("hammer", 1800.00);
        products[10] = new Tools("screwdriver", 550.50);
        products[11] = new Tools("saw", 700.10);

        //Array list de la cesta de compras
        ArrayList<Product> purchase = new ArrayList<Product>();

        System.out.println("");
        System.out.println("Bienvenido a la góndola virtual del supermercado ''TE SACAMOS UN OJO''\n");

        int answer;

        for (int i = 0; i < products.length; i++) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("--- Desea agregar este producto al carrito? ---\n");
            System.out.println(products[i]);
            System.out.println("\nSi la respuesta es SÍ, igrese: [1], de lo contrario, igrese [2]");
            answer = keyboard.nextInt();
            if (answer == 1) {
                purchase.add(products[i]);
            }

        }

        double totalCost = 0;
        double totalFinalCost = 0;

        System.out.println("\nTICKET DE COMPRA: \n");
        for (int j = 0; j < purchase.size(); j++) {
            Product pourchases = purchase.get(j);
            System.out.println("PRODUCTO:" + (j + 1) +"\n"+ pourchases.toString());
            pourchases.calculateDiscount();
            totalCost += pourchases.getCost();
            totalFinalCost += pourchases.getFinalCost();
            pourchases.showDiscount();
            System.out.println();


        }
        System.out.println("\nLa cantidad de productos que compraste es de: " + purchase.size());
        System.out.println("\nFACTURA:\nHubieras gastado: " + totalCost +
                "\nGracias a nuestras promociones solo deberas pagar: " + (totalCost - totalFinalCost));
        System.out.println("\nGRACIAS POR SU COMPRA EN 'TE SACAMOS UN OJO!!!\nVuelva pronto!!");



    }
}
