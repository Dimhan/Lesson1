package com.EPAMjavaWEB.task1.task107;

/*        Составить программу для вычисления значений функции  F(x) на отрезке [а, b] с шагом h.
        Результат представить в виде таблицы, первый столбец которой – значения  аргумента,
        второй - соответствующие значения функции:
*/
public class FunctionFx {
    public static void main(String[] args) {
        double a = Math.random() * 3;
        System.out.println("a = " + a);
        double b = Math.random() * 10;
        System.out.println("b = " + b);
        double h = 0.2;
        double fx;
        System.out.println("---------------------------------");
        System.out.println("|      x        |         y     |");
        System.out.println("---------------------------------");
        for (double x = a; x <= b; x = x + h) {
            fx = Math.pow(Math.sin(x), 2) - Math.cos(2 * x);
            System.out.printf(" %4.4f         |%4.4f\n", x, fx);
        }
        System.out.println("---------------------------------");

    }
}
