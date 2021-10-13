package ru.vsu.sc.berezin_y_a;

public class Test {

    public boolean testProgram() {
        if (picture.getColor(1.2, 2.2) != SimpleColor.YELLOW) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (picture.getColor(0, 0) != SimpleColor.ORANGE) {
            System.out.println("Test 2 is not completed");
            return false;
        } else if (picture.getColor(0, -3) != SimpleColor.GREEN) {
            System.out.println("Test 3 is not completed");
            return false;
        } else if (picture.getColor(3, -2) != SimpleColor.BLUE) {
            System.out.println("Test 4 is not completed");
            return false;
        } else if (picture.getColor(0, -5) != SimpleColor.GRAY) {
            System.out.println("Test 5 is not completed");
            return false;
        } else if (picture.getColor(-3, 5) != SimpleColor.WHITE) {
            System.out.println("Test 6 is not completed");
            return false;
        } else if (picture.getColor(-3, 0) != SimpleColor.GRAY) {
            System.out.println("Test 7 is not completed");
            return false;
        } else if (picture.getColor(-2, -5) != SimpleColor.ORANGE) {
            System.out.println("Test 8 is not completed");
            return false;
        } else if (picture.getColor(0, 3.3) != SimpleColor.GRAY) {
            System.out.println("Test 9 is not completed");
            return false;
        } else if (picture.getColor(4, 3) != SimpleColor.YELLOW) {
            System.out.println("Test 10 is not completed");
            return false;
        } else {
            return true;
        }
    }

    private static final Picture picture = new Picture();

}
