package com.company;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        task12();
    }

    public static void task1() {
        System.out.printf("%n C++, %n C#, %n java, %n pascal,%n php,%n JavaScript,%n ActionScript");
    }

    public static void task2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input first number:");
        int firstNum = scan.nextInt();
        System.out.print("Input second number:");
        int secondNum = scan.nextInt();

        System.out.println("Division :" + (firstNum / secondNum));
        System.out.println("Remainder :" + (secondNum % firstNum));
    }

    public static void task3() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input first number:");
        int firstNum = scan.nextInt();
        System.out.print("Input second number:");
        int secondNum = scan.nextInt();
        System.out.print("Input third number:");
        int thirdNum = scan.nextInt();
        System.out.println("Sum=" + (firstNum + secondNum + thirdNum));
        System.out.println("Multiply=" + (firstNum * secondNum * thirdNum));
    }

    public static void task4() {
        Scanner scan = new Scanner(System.in);
        System.out.print("input 3 digit number:");
        String num = scan.next();
        for (int i = 0; i < num.length(); i++)
            System.out.println(num.charAt(i));

    }

    public static void task5_6() {
        //5 - 6 ერთადაა
        Scanner scan = new Scanner(System.in);
        System.out.print("input 4 or any digit number:");
        String num = scan.next();
        int sum = 0;
        for (int i = 0; i < num.length(); i++)
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        System.out.println(sum);

    }

    public static void algorithm() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input first number:");
        int firstNum = scan.nextInt();
        System.out.print("Input second number:");
        int secondNum = scan.nextInt();

    }

    public static void task7() {

    }

    public static void task8() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input M number:");
        int firstNum = scan.nextInt();
        System.out.print("Input N number:");
        int secondNum = scan.nextInt();
        for (int i = firstNum + 1; i < secondNum; i++)
            System.out.println(i);
    }

    public static void task9() {
        int[] myNum = {10, 20, 30, 40, 50, 60, 70, 80};
        int max = myNum[0];
        for (int i = 1; i < myNum.length; i++)
            if (myNum[i] > max)
                max = myNum[i];

        int min = myNum[0];
        for (int i = 1; i < myNum.length; i++)
            if (myNum[i] < min)
                min = myNum[i];
        System.out.println(myNum);
        System.out.println(max);
        System.out.println(min);
    }

    public static void task10() {
        int[] myNum = {14, 11, 4, 5, 6, 3};
        Arrays.sort(myNum);
        System.out.println(Arrays.toString(myNum));
    }

    public static void task11() {
        double[] randomList = new double[8];
        for (int i = 0; i < 8; i++) {
            double randomNumber = Math.random();
            randomList[i] = randomNumber;
        }
        System.out.println(Arrays.toString(randomList));
    }

    public static void task12(){
        Integer[] randomList = new Integer[8];
        for (int i = 0; i < 8; i++) {
            Random r = new Random();
            randomList[i] = r.nextInt();
        }
        Arrays.sort(randomList, Collections.reverseOrder());
        System.out.println(Arrays.toString(randomList));
    }
}
