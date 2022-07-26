package com.EPAMjavaWEB.task1.task103;

//Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов

public class TrigonSandP {
    public static String perimetr = "Периметр прямоугольного треугольника";
    public static String square = "Площадь прямоугольного треугольника";
    public static String catet = "Прямоугольный треугольник с катетами";

    public static double randomABC() {
        return (Math.random() * (Math.random() * 100));
    }

    public static void main(String[] args) {
        double a = randomABC();
        double b = randomABC();
        double trigonSquare, trigonPerimeter;
        trigonPerimeter = a + b + Math.sqrt(a*a + b*b);
        trigonSquare = (a*b)/2;
        System.out.printf("%s\n %4.3f\n %4.3f\n ", catet,a, b);
        System.out.printf("%s %4.3f\n", perimetr, trigonPerimeter);
        System.out.printf("%s %4.3f\n", square, trigonSquare);



    }
}
