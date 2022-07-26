package com.EPAMjavaWEB.task1.task101;

import java.util.Scanner;

/*Составить линейную программу, печатающую значение true, если указанное высказывание является истинным,
        и false — в противном случае:
        Сумма двух первых цифр заданного четырехзначного числа
        равна сумме двух его последних цифр.
*/
public class TrueOrFalse {
    public static String sumFirstTwoDigits = "Сумма двух первых цифр числа";
    public static String sumSecondTwoDigits = "равна сумме двух его последних цифр";

    public static void main(String[] args) {
        int sum1, sum2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите четырёхзначное целое число:");
        if (!sc.hasNextInt()) {
            System.out.println("Не число");
            return;
        }
        int numb = sc.nextInt();
        if (numb / 1000 == 0) {
            System.out.println("В числе меньшу четырёх цифр");
        } else {
            sum1 = numb / 100;
            sum1 = sum1 / 10 + sum1 % 10;
            sum2 = numb % 100;
            sum2 = sum2 / 10 + sum2 % 10;
            System.out.printf("%s %d %s\n", sumFirstTwoDigits, numb, sumSecondTwoDigits);
            if (sum1 == sum2) {
                System.out.println("TRUE");
            } else {
                System.out.println("FALSE");
            }
        }
    }
}
