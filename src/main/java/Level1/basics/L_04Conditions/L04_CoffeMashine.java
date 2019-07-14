package Level1.basics.L_04Conditions;

import java.util.Scanner;

public class L04_CoffeMashine {

    public static void main(String[] args) {
        System.out.println("choose a serving of coffee [1,3] ");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        int serving = scanner.nextInt();
        int price = 0;

        switch (serving){
            case 1:{
                price+=25;
            break;}

            case 2:{
                price+=50;
                break;
            }
            case 3:{
                price+=75;
                break;
            }
            default:
                System.out.println("Enter new");
        }

        if (price!=0){
            System.out.println("your choice: "+serving+"! Pay by "+price+" $.");
        }else {
            System.out.println("choose a serving of coffee [1,3] ");
              }

    }
}
