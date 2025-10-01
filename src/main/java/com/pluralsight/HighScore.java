package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HighScore {
    public static void main(String[] args) {
        String format = "Home:Visitor|21:9";

        String[] name = format.split("\\|");

        String section1 = name[0];
        String section2 = name[1];

        System.out.println("Part 1 ");
        System.out.println("Original- " + format);
        System.out.println(section1);
        System.out.println(section2);

        System.out.println();
        System.out.println("Part 2 ");

        String[] name2 = section1.split("\\:");
        String part1 = name2[0];
        String part2 = name2[1];

        System.out.println(section1);
        System.out.println(part1);
        System.out.println(part2);

        String[] name3 = section2.split("\\:");

        String door1 = name3[0];
        String door2 = name3[1];

        System.out.println();
        System.out.println("Part 3: ");
        System.out.println(section2);
        System.out.println(door1);
        System.out.println(door2);







    }
}