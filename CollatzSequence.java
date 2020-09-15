package com.company;

import java.util.Scanner;

public class CollatzSequence {
    public CollatzSequence() {
        Scanner scan = new Scanner(System.in);
        int i = -1;

        System.out.println("Please enter a number: ");
        try {
            i = scan.nextInt();
        } catch (Exception e) {
            System.out.println("You failed!");
            System.exit(0);
        }

        while(i != 1) {
            if (i % 2 == 1) {
                i *= 3;
                i += 1;
            } else {
                i /= 2;
            }
            System.out.println(i);
        }
    }
}
