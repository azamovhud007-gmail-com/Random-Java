package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static int count = 0;
    public static Scanner scanner = new Scanner(in);
    public static ArrayList<Car> carArrayList;

    public static void main(String[] args) {
        // write your code here



        System.out.println("User->[1]");
        System.out.println("Admin->[2]");
        System.out.print("= ");

        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println("GM Welcome");
            System.out.println("Car list [1]");
            System.out.println("Car buy [2]");
            System.out.print("= ");
            int c = scanner.nextInt();
            if (c == 1) {



                System.out.println("Car list");

                for (Car car : carArrayList) {
                    System.out.println(car.getId()+" "+car.getBrand() + " " + car.getName() + " " + car.getAge() + " -yil " + car.getPrice() + " $");
                }
            } else if (c == 2) {
                System.out.println("Car buy");
                for (Car car : carArrayList) {
                    System.out.println(car.getBrand() + " " + car.getName() + " " + car.getAge() + " -yil " + car.getPrice() + " $");
                }
                System.out.print("= ");


            } else {
                System.out.println("error");
            }


        } else if (n == 2) {


        } else {
            System.out.println("Error");
        }
    }
}
