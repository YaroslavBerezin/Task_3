package ru.vsu.sc.berezin_y_a;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        Test.mainTest();
        System.out.println(" ");

        double x = readNum("Input X: ");
        double y = readNum("Input Y: ");

        printColorForPoint(x, y);

    }

    public static final HorizontalParabola PR = new HorizontalParabola(-6, -6, 0.5);
    public static final HorizontalParabola PL = new HorizontalParabola(-3, -6, -0.25);
    public static final Circle S = new Circle(5, 1, 5);

    public static SimpleColor getColor(double x, double y) {
        if (PR.isPointRightOfParabola(x, y) && !PL.isPointRightOfParabola(x, y)) {
            return SimpleColor.ORANGE;
        } else if (!PL.isPointRightOfParabola(x, y) || (PR.isPointRightOfParabola(x, y) && S.isPointInCircle(x, y))) {
            return SimpleColor.BLUE;
        } else if (PR.isPointRightOfParabola(x, y)) {
            return SimpleColor.GREEN;
        } else if (S.isPointInCircle(x, y) && !PR.isPointRightOfParabola(x, y)) {
            return SimpleColor.GRAY;
        } else {
            return SimpleColor.WHITE;
        }
    }

    public static void printColorForPoint(double x, double y) {
        System.out.printf("(%.2f, %.2f) -> ", x, y);
        System.out.println(getColor(x, y));
    }

    private static double readNum(String text) {
        System.out.print(text);
        Scanner scn = new Scanner(System.in);
        double num = scn.nextDouble();
        if (num < -10 || num > 10) {
            System.out.println("Error, -10 < (X and Y) < 10");
            System.exit(1);
        }
        return num;
    }

}
