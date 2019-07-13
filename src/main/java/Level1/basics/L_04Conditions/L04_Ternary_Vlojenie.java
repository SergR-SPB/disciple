package Level1.basics.L_04Conditions;

import java.util.Scanner;

public class L04_Ternary_Vlojenie {
    // Тернарная условная операция. Вложенные тернарные операторы.
    /*
    Условие:
        Если Х>0 то при У>0 получаем "Квадрат 1" иначе "Квадрат 2"
        иначе (Х<0) то при у>0 получаем "Квадрат 4" иначе "Квадрат 3"

     */

    public static void main(String[] args) {
        // Определение квадранта в котором лежит заданная точка.
        // Для упрощения примера условимся, что точка не будет лежать в центре координат и на координатных осях,
        // это значит, что x и y - не могут быть равны 0.

        int x, y;
        String quadrant;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input variable X: ");
        x = scanner.nextInt();

        System.out.println("Input variable Y:");
        y = scanner.nextInt();


        // Не рекомендуется вкладывать тернарные операторы, так как это ухудшает чтение кода.


        quadrant =
                //если (condition)
                (x > 0) ?
                        //то (true block)
                        ((y > 0) ? "I quadrant" : "II quadrant") :
                        //иначе (false block)
                        ((y > 0) ? "IV quadrant" : "III quadrant");//
        System.out.println(quadrant);


    }
}
