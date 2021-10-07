package ru.vsu.sc.berezin_y_a;

public class Picture {

    public static final VerticalParabola P1 = new VerticalParabola(3, 2, 0.1);
    public static final VerticalParabola P2 = new VerticalParabola(-4, 2, -0.25);
    public static final VerticalParabola P3 = new VerticalParabola(5, 4, -0.125);
    public static final Circle S = new Circle(-2, 0, 4);
    public static final Line L = new Line(1, 2, 4);

    public static SimpleColor getColor(double x, double y) {
        if (S.isPointInCircle(x, y) && !L.isPointAboveLine(x, y) && P1.isPointBelowOfParabola(x, y) &&
                !P3.isPointBelowOfParabola(x, y)) {
            return SimpleColor.YELLOW;
        } else if (S.isPointInCircle(x, y) && !P1.isPointBelowOfParabola(x, y)) {
            return SimpleColor.GRAY;
        } else if (!P1.isPointBelowOfParabola(x, y) && P3.isPointBelowOfParabola(x, y)) {
            return SimpleColor.YELLOW;
        } else if (S.isPointInCircle(x, y) && P1.isPointBelowOfParabola(x, y) && P2.isPointBelowOfParabola(x, y) &&
                !L.isPointAboveLine(x, y)) {
            return SimpleColor.GREEN;
        } else if (S.isPointInCircle(x, y) && P3.isPointBelowOfParabola(x, y) && P2.isPointBelowOfParabola(x, y) &&
                L.isPointAboveLine(x, y)) {
            return SimpleColor.BLUE;
        } else if (L.isPointAboveLine(x, y) && P3.isPointBelowOfParabola(x, y) && !P2.isPointBelowOfParabola(x, y)) {
            return SimpleColor.ORANGE;
        } else if (S.isPointInCircle(x, y) && P1.isPointBelowOfParabola(x, y) && !P2.isPointBelowOfParabola(x, y) &&
                !P3.isPointBelowOfParabola(x, y)) {
            return SimpleColor.GREEN;
        } else if (S.isPointInCircle(x, y) && P2.isPointBelowOfParabola(x, y) && !P3.isPointBelowOfParabola(x, y)) {
            return SimpleColor.GRAY;
        } else if (!L.isPointAboveLine(x, y) && P3.isPointBelowOfParabola(x, y) && S.isPointInCircle(x, y) &&
                P3.isPointBelowOfParabola(x, y)) {
            return SimpleColor.GRAY;
        } else if (P3.isPointBelowOfParabola(x, y) && !P2.isPointBelowOfParabola(x, y) && !S.isPointInCircle(x, y) &&
                P1.isPointBelowOfParabola(x, y)) {
            return SimpleColor.BLUE;
        } else if (P2.isPointBelowOfParabola(x, y) && !S.isPointInCircle(x, y) && !P3.isPointBelowOfParabola(x, y)) {
            return SimpleColor.BLUE;
        } else if (P2.isPointBelowOfParabola(x, y) && !S.isPointInCircle(x, y) && P3.isPointBelowOfParabola(x, y) &&
                L.isPointAboveLine(x, y)) {
            return SimpleColor.ORANGE;
        } else if (P2.isPointBelowOfParabola(x, y) && !S.isPointInCircle(x, y) && P3.isPointBelowOfParabola(x, y) &&
                !L.isPointAboveLine(x, y)) {
            return SimpleColor.GRAY;
        } else if (P1.isPointBelowOfParabola(x, y) && !P3.isPointBelowOfParabola(x, y) && x > 6) {
            return SimpleColor.ORANGE;
        } else if (!P1.isPointBelowOfParabola(x, y) && !P3.isPointBelowOfParabola(x, y)) {
            return SimpleColor.ORANGE;
        } else {
            return SimpleColor.WHITE;
        }
    }

    public static void printColorForPoint(double x, double y) {
        System.out.printf("(%.2f, %.2f) -> ", x, y);
        System.out.println(getColor(x, y));
    }

}
