package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1)\n");
        System.out.println(fizzBuzz(500));
        System.out.println("2)\n");
        System.out.println(reverse("make install"));
        System.out.println("3)\n");
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        System.out.println(discrimant(a,b,c));
        System.out.println("4)\n");
        System.out.println(seriesSum());
        System.out.println("5)\n");
        String input = scanner.nextLine();
        System.out.println(palindrom(input));
    }

    public static ArrayList<String> fizzBuzz(int n) {

        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 7 == 0 && i % 5 == 0) {
                list.add("fizzbuzz");
            } else if (i % 5 == 0) {
                list.add("fizz");
            } else if (i % 7 == 0) {
                list.add("buzz");
            } else {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }

    public static String reverse(String input) {

        char[] chars = input.toCharArray();
        String str = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            str += chars[i];
        }
        return str;
    }

    public static ArrayList<String> discrimant(int a, int b, int c) {

        ArrayList<String> list = new ArrayList<>();
        int D = b * b - 4 * a * c;

        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);

            list.add(String.valueOf(x1));
            list.add(String.valueOf(x2));
        } else if (D == 0) {
            double x = (-b) / (2.0 * a);
            list.add(String.valueOf(x));
        } else {
            list.add("Нет корней");
        }

        return list;
    }

    public static double seriesSum() {

        ArrayList<String> list = new ArrayList<>();

        int n = 2;
        double sum = 0;
        double i = 0;

        do {
            i = 1.0 / (n * n + n - 2);
            sum += i;

            n++;
        } while (i > Math.pow(10, -6));

        return sum;
    }

    public static boolean palindrom(String input) {

        char[] chars = input.toCharArray();
        String rev = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            rev += chars[i];
        }
        return input.equals(rev);
    }
}
