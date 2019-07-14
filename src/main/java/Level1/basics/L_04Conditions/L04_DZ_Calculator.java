package Level1.basics.L_04Conditions;
/*Напишите программу – консольный калькулятор.
Создайте две переменные с именами operand1 и operand2.
Задайте переменным некоторые произвольные значения. Предложите пользователю ввести знак арифметической операции.
Примите значение, введенное пользователем и поместите его в строковую переменную sign.
Для организации выбора алгоритма вычислительного процесса, используйте переключатель switch.
Выведите на экран результат выполнения арифметической операции.
В случае использования операции деления, организуйте проверку попытки деления на
ноль. И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке пользователя.*/


import java.util.Scanner;

public class L04_DZ_Calculator {
    public static void main(String[] args) {

        double rez = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input operand1: ");
        double x = scanner.nextInt();
        System.out.println("Input operand2: ");
        double y = scanner.nextInt();

        System.out.println("Enter [+-*/]");
        String matOperation = scanner.next();

        switch (matOperation) {
            case "+": {
                rez = x + y;
                break;
            }
            case "-": {
                rez = x - y;
                break;
            }
            case "*": {
                rez = x * y;
                break;
            }
            case "/": {
                if (y != 0) {
                    rez = x / y;
                } else {
                    System.out.println("EROR Y=0");
                }
                break;
            }

            default:
                System.out.println("Not Enter [+-*/]");
        }
        if (matOperation.equals("/") & y==0){
            System.out.println();
        }else
        System.out.println("rezult: "+x+" "+matOperation+" "+y+" = "+rez);

    }
}
