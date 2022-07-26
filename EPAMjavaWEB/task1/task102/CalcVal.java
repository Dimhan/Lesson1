package com.EPAMjavaWEB.task1.task102;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения).


public class CalcVal {
    public static double randomABC() {
        return (Math.random() - Math.random()) * (Math.random() * 100);
    }

    public static void main(String[] args) {
        double a = randomABC();
        double b = randomABC();
        double c = randomABC();
        double rezult;
        rezult = (b + Math.sqrt(b * b + Math.abs(4 * a * c))) / (2 * a);
        rezult = rezult - a * a * a * c + Math.pow(b, -2);
        System.out.println(rezult);
    }
}
