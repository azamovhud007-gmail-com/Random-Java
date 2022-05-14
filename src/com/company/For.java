package com.company;


import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class For {
    public static void main(String[] args) {

        // scanner
        Scanner scanner = new Scanner(in);
        //random
        Random random = new Random();
        int countT = 0;
        int countN = 0;
        int cMT = 0;
        int cMN = 0;

        for (int i = 1; i <= 3; i++) {
            int num1 = random.nextInt(10);
            int num2 = random.nextInt(10);
            int n = random.nextInt(4);

            int res = 0;
            switch (n) {
                case 0 -> {
                    res = num1 + num2;
                    System.out.print(num1 + " + " + num2 + " = ");
                }
                case 1 -> {
                    res = num1 - num2;
                    System.out.print(num1 + " - " + num2 + " = ");
                }
                case 2 -> {
                    res = num1 * num2;
                    System.out.print(num1 + " * " + num2 + " = ");
                }
                case 3 -> {
                    res = num1 / num2;
                    System.out.print(num1 + " / " + num2 + " = ");
                }
            }

            int t = scanner.nextInt();

            if (res == t) {
                countT++;//6
            } else {
                countN++;
            }
        }

        System.out.println("2");


        if (countT>=2){
            for (int i = 1; i <= 3; i++) {
                int num1 = random.nextInt(100);
                int num2 = random.nextInt(100);
                int n = random.nextInt(4);

                int res = 0;
                switch (n) {
                    case 0 -> {
                        res = num1 + num2;
                        System.out.print(num1 + " + " + num2 + " = ");
                    }
                    case 1 -> {
                        res = num1 - num2;
                        System.out.print(num1 + " - " + num2 + " = ");
                    }
                    case 2 -> {
                        res = num1 * num2;
                        System.out.print(num1 + " * " + num2 + " = ");
                    }
                    case 3 -> {
                        res = num1 / num2;
                        System.out.print(num1 + " / " + num2 + " = ");
                    }
                }

                int t = scanner.nextInt();

                if (res == t) {
                    cMT++;//6
                } else {
               cMN++;
                }
            }
        }
        int resJ = countN+cMT;
        System.out.println("Jami "+resJ);


    }
}
