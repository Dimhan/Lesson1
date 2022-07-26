package com.EPAMjavaWEB.task1.task105;
/*
Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны,
        и в четвертую степень — отрицательные.

 */

public class CalcSqrtDoubleSqrt {
    public static double calcVal(double x) {
        if (x < 0) {
            System.out.println("Отрицательное число -> возводим в 4ю степень");
            return Math.pow(x, 4);
        } else {
            System.out.println("Неотрицательное число -> возводим в квадрат");
            return x * x;
        }
    }

    public static double randomABC() {
        return (Math.random() - Math.random()) * (Math.random() * 100);
    }

    public static void main(String[] args) {
        double a = randomABC();
        double b = randomABC();
        double c = randomABC();
        System.out.println(a);
        System.out.println(calcVal(a));
        System.out.println(b);
        System.out.println(calcVal(b));
        System.out.println(c);
        System.out.println(calcVal(c));
    }
}
