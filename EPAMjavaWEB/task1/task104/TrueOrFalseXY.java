package com.EPAMjavaWEB.task1.task104;

/*      Для данных областей составить линейную программу, которая печатает true,
        если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае
*/

import java.util.Random;

public class TrueOrFalseXY {
    public static void main(String[] args) {
        System.out.println("Дана область, ограниченная координатами (см. условие)");
        int x1 = -4, x2 = -2, x3 = 2, x4 = 4;
        int y1 = -3, y2 = 4;
        Random randomXY = new Random();
        int x = randomXY.nextInt(10) - randomXY.nextInt(10);
        int y = randomXY.nextInt(10) - randomXY.nextInt(10);
        System.out.println("Заданы координаты");
        System.out.printf("%s  %d\n%s  %d\n", "X=", x, "Y=", y);
        if ((y > 0) && (y <= y2) && (x >= x2) && (x <= x3))
            System.out.println("Результат TRUE");
        else if ((y < 0) && (y >= y1) && (x >= x1) && (x <= x4))
            System.out.println("Результат TRUE");
        else
            System.out.println("Результат FALSE");

    }
}
