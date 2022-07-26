package com.EPAMjavaWEB.task1.task106;

// Написать программу нахождения суммы большего и меньшего из трех чисел

import java.util.Random;

public class SumOfMinMaxDig {
    public static void main(String[] args) {
        Random digit = new Random();
        int min, max;
        int a = digit.nextInt(100);
        int b = digit.nextInt(100);
        int c = digit.nextInt(100);
        System.out.println("Заданы три числа");
        System.out.printf("%d  %d  %d\n", a, b, c);
        System.out.println("Сумма MinMax равна");
        min = Math.min(a, b);
        if (min > c) min = c;
        max = Math.max(a, b);
        if (max < c) max = c;
        System.out.println("     " + (min + max));

    }
}
