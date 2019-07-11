package Level1.basics;

import java.util.Scanner;

public class L04_Ternary {
    // Тернарная условная операция.

    // Тернарный (троичный) оператор [?:] .
    // Тернарный оператор [?:], является сокращенной формой конструкции if ... else.
    // [?:] - включает в себя три операнда - ( условие ? Если условие ИСТИННО : Если условие ЛОЖНО )

    // Алгоритм работы тернарной операции: (логическое выражение) ? выражение 1 : выражение 2
    //    1. Вычисляется логическое выражение (условие).
    //    2. Если логическое выражение истинно, то вычисляется значение выражения выражение 1, в противном случае — значение выражения выражение 2.
    //    3. Вычисленное значение возвращается.

    public static void main(String[] args) {

        /* int a=1, b=2, max1 = 0;

        max1 = (a>b)?a:b;
        System.out.println(max1); */
//--1
        int a, b, max;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter variable a:");
        a = scanner.nextInt();
        System.out.println("Enter variable b:");
        b = scanner.nextInt();
        max = (a < b) ? b : a;
        System.out.println("MAX [a,b] = " + max);

//--2
        int a1 = 1;
        double b1 = 0.0;
        int max1;

        // Выражения [?] и [:]  - должны быть одного типа.

        max1 = (int)((a1 > b1) ? a1 : b1);

        // ... или так

        max1 = (a1 > b1) ? a1 : (int)b1;

        System.out.println(max1);




//--3
        String string = "Hello ";

        System.out.println("Введите свой логин:");
        Scanner in = new Scanner(System.in);
        // На 14 строке создаем переменную с именем login типа String и принимаем в нее ввод от пользователя

        String login = in.next();

        // На 18 строке переменной string присваиваем возвращаемое значение тернарного оператора

        string += login.equals("Admin") ? "Administrator" : "User";
        System.out.println(string);
    }
}
