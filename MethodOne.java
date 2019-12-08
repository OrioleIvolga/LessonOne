package ru.geekbrains.java_one.lesson_a.homework;

import java.util.Scanner;

public class MethodOne {

    private static double math ( int a,  int b,  int c,  int d) {
        double result = (a * (b + (c / d)));
        return result;
    }

    private static int summ ( int a,  int b) {
        int sum = (a + b);
        return sum;
    }

   private static void HelloUser (String firstname) {
        System.out.println("Добро пожаловать, " + firstname);
    }




    public static void main(String[] args) {
        System.out.println("Как Вас зовут?");
        Scanner scanner = new Scanner(System.in);
        String firstname = scanner.next();
        HelloUser (firstname);
        System.out.println("Введите первое число (a)");
        scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите второе число (b)");
        scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        System.out.println("Введите третье число (c)");
        scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        System.out.println("Введите четвертое число (d)");
        scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        double result = math (a, b, c, d);
        System.out.println(result);

        int sum = summ (a, b);
        if (sum >=10 && sum <=20) {
            System.out.println("Сумма a и b больше 10 и меньше 20 включительно");
        } else {
            System.out.println("false");
        }

        if (a < 0) {
            System.out.println("a меньше 0");
        } else {
            System.out.println("a больше 0");
        }
        System.out.println("Введите год");
        scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 400 ==0 ) {
            System.out.println("год високосный, остаток от деления на 400 - " + year % 400);
        } else if (year % 4 == 0 && year % 100 > 0) {
            System.out.println("год високосный, остаток от деления на 4 - " + year % 4 +
                    ", остаток от деления на 100 " + year % 100);
        } else {
            System.out.println("год не високосный, остаток от деления на 400 - " + year % 400 +
                    ", остаток от деления на 4 - " + year % 4 + ", остаток от деления на 100 - " + year % 100);
        }

        scanner.close();
    }


}
