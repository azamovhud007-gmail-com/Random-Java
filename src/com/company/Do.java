package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Do {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);
        int w = 0;
        int res = 1;
        int n = scanner.nextInt();

        do {
            res = n * w;
            System.out.println(n + " * " + w + " = " + res);
            w++;
        } while (w <= 10);


    }
}
