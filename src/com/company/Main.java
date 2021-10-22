package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Уведіть значення а: ");
        double a = sc.nextDouble();

        System.out.println("Уведіть значення b: ");
        double b = sc.nextDouble();

        System.out.println("Уведіть значення c: ");
        double c = sc.nextDouble();


        System.out.println("Уведіть значення xEnd: ");
        double xEnd = sc.nextDouble();

        System.out.println("Уведіть значення xStep: ");
        double xStep = sc.nextDouble();

        System.out.println("Уведіть значення xStart: ");
        double xStart;
        double F;
        for (xStart = sc.nextDouble(); xStart <= xEnd; xStart++) {
            if (xStart < 0 && b != 0)
            {
                F = a - xStart/(10 + b);
            }

            else if (xStart > 0 && b == 0)
            {
                F = (xStart - a) /(xStart - c);
            }

            else
                F = 3 * xStart + 2 / c;

            System.out.println("При даних значеннях, функція набуває значення: " + F);

        }

    }
}
