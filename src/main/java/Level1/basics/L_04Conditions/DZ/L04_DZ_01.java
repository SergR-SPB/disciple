package Level1.basics.L_04Conditions.DZ;

/*
Напишите программу русско-английский переводчик.
Программа одно слово. Требуется, чтобы пользователь вводил слово на русском языке,
а программа давала ему перевод этого слова на английском языке. Если пользователь ввел слово,
для которого отсутствует перевод, то следует вывести сообщение, что такого слова нет.
*/

import java.util.Scanner;

public class L04_DZ_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the word for translation");
        String word = scanner.next();

        switch (word){
            case "first": {
                System.out.println("first / первый");
                break;
            }
            default:{
                System.out.println("the NOT word for translation");
            }
        }





    }


}
