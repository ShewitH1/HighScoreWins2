package com.pluralsight;

public class HighScore {
    public static void main(String[] args) {
        String format = "Home:Visitor|21:9";

        String[] name = format.split("\\|");

        String sideLeft = name[0];
        String sideRight = name[1];

        System.out.println("------Part 1------");
        System.out.println("Original: " + format);
        System.out.println(sideLeft);
        System.out.println(sideRight);
        System.out.println();

        System.out.println("------Part 2------");
        String[] leftSideSemi = sideLeft.split("\\:");
        String leftSide = leftSideSemi[0];
        String rightSide = leftSideSemi[1];
        System.out.println("Original: " + sideLeft);
        System.out.println(leftSide);
        System.out.println(rightSide);
        System.out.println();

        System.out.println("------Part 3------");
        String[] rightSideSemi = sideRight.split("\\:");
        String left_side = rightSideSemi[0];
        String right_side = rightSideSemi[1];
        System.out.println("Original: " + sideRight);
        System.out.println(left_side);
        System.out.println(right_side);
        System.out.println();












    }
}