package Level1.basics;
// Условие
// ЕСЛИ: Купили 10 единиц товара и больше.
// ТО: предоставить скидку в 25%. ИНАЧЕ: Скидку не предоставлять.

import java.util.Scanner;

public class L04_Ternary_Sale {

    public static void main(String[] args) {

//        double quantity = 9;      // Количество единиц товара.
//        double price = 100;       // Цена за единицу товара.
//        double discount = 0.75;   // Скидка на общую стоимость - 25%.
//        double cost;              // Общая стоимость.

        double quantity, price, discount = 0.75, cost, sale;
        String txtSale = "Sale: ";
        String txtNotSale ="Not sale! ";


        Scanner scannersc = new Scanner(System.in);

        System.out.println("Input quantity: ");
        quantity = scannersc.nextInt();

        System.out.println("Input price: ");
        price = scannersc.nextInt();

        cost = quantity >= 10 ? price * quantity * discount : price * quantity;
        System.out.println("Cost: "+cost);

        sale = quantity>=10 ? price*quantity*(1-discount) : 0;
        String txt = sale!=0 ? txtSale : txtNotSale;

        System.out.println(txt+sale);
    }
}
