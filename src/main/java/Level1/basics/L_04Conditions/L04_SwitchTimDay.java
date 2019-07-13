package Level1.basics.L_04Conditions;

import java.util.Scanner;

public class L04_SwitchTimDay {

    public static void main(String[] args) {

        System.out.println("Enter the number of the day of the week [1.7]");

        Scanner scanner = new Scanner(System.in);
        int myDay = scanner.nextInt();

        switch (myDay){
            case 1:{
                System.out.println(myDay + " / Monday");
                break;
            }

            case 2:{
                System.out.println(myDay + " / Tuesday");
                break;
            }

            case 3:{
                System.out.println(myDay + " / Wednesday");
                break;
            }
            case  4:{
                System.out.println(myDay + " / Thursday");
                break;
            }
            default:{
                System.out.println("Further writing laziness");
            }

        }

        switch (myDay){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Этот день недели - Рабочий.");
                break;
            case 6:
            case 7:
                System.out.println("Этот день недели - Выходной.");
                break;

            default:
                System.out.println("Вы ввели несуществующий день недели.");
                break;

        }
    }
}
