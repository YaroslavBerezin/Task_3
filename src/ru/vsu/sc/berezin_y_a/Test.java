package ru.vsu.sc.berezin_y_a;

import static ru.vsu.sc.berezin_y_a.Main.getColor;
import static ru.vsu.sc.berezin_y_a.Main.printColorForPoint;

public class Test {

    public static void mainTest() {
        System.out.println("Tests: ");
        System.out.println(test(1, 1, SimpleColor.GRAY));
        System.out.println(test(2, -3, SimpleColor.BLUE));
        System.out.println(test(0, -4, SimpleColor.GREEN));
        System.out.println(test(-5, -6, SimpleColor.ORANGE));
        System.out.println(test(-8, -4, SimpleColor.BLUE));
        System.out.println(test(0, 5, SimpleColor.WHITE));
        System.out.println(test(0, -10, SimpleColor.WHITE));
    }

    public static State test(double x, double y, SimpleColor state) {
        printColorForPoint(x, y);
        if (getColor(x, y) == state) {
            return State.OK;
        } else {
            return State.ERROR;
        }
    }

}
