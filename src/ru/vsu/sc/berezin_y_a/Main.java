package ru.vsu.sc.berezin_y_a;

import java.util.Locale;
import java.util.Scanner;
import static ru.vsu.sc.berezin_y_a.Picture.printColorForPoint;
import static ru.vsu.sc.berezin_y_a.Test.mainTest;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        mainTest();
        System.out.println(" ");

        double x = readNum("Input X: ");
        double y = readNum("Input Y: ");

        printColorForPoint(x, y);

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
