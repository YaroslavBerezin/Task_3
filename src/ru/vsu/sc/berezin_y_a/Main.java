package ru.vsu.sc.berezin_y_a;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        if (!test.testProgram()) {
            System.out.println("Test error");
            System.exit(1);
        } else {
            System.out.println("All tests completed");
        }

        System.out.println(" ");

        double x = readNum("Input X: ");
        double y = readNum("Input Y: ");

        printColorForPoint(x, y);

    }

    private static final Picture picture = new Picture();
    private static final Test test = new Test();

    public static void printColorForPoint(double x, double y) {
        System.out.printf("(%.2f, %.2f) -> ", x, y);
        System.out.println(picture.getColor(x, y));
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
