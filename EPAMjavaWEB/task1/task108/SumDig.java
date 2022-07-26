package com.EPAMjavaWEB.task1.task108;

//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К

import java.util.Random;

public class SumDig {
    public static void main(String[] args) {
        int[] arr = new int[25];
        Random natNum = new Random();
        int k = natNum.nextInt(10, 50);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = natNum.nextInt(25) + 1;
            if (k % arr[i] == 0) {
                sum += arr[i];
            }
        }
        System.out.println("k=" + k);
        for (int arrIdex : arr) {
            System.out.print("  " + arrIdex);
        }
        System.out.println();
        System.out.println("Сумма кратных К элементов массива равна   " + sum);
    }
}
