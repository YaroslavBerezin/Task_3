package ru.vsu.sc.berezin_y_a;

import static ru.vsu.sc.berezin_y_a.Picture.getColor;
import static ru.vsu.sc.berezin_y_a.Picture.printColorForPoint;

public class Test {

    public static void mainTest() {
        System.out.println("Tests: ");

        System.out.println(test(4, 3, SimpleColor.YELLOW));
        System.out.println(test(1.2, 2.2, SimpleColor.YELLOW));
        System.out.println(test(0, 0, SimpleColor.ORANGE));
        System.out.println(test(0, -3, SimpleColor.GREEN));
        System.out.println(test(3, -2, SimpleColor.BLUE));
        System.out.println(test(0, -5, SimpleColor.GRAY));
        System.out.println(test(-3, 5, SimpleColor.WHITE));
        System.out.println(test(-3, 0, SimpleColor.GRAY));
        System.out.println(test(-2, -5, SimpleColor.ORANGE));
        System.out.println(test(0, 3.3, SimpleColor.GRAY));
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
