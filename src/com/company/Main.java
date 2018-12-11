package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte userChoice = 0;
        while (true)
        {
            System.out.println("1. Перестановка максимального и минимального элемента массива.");
            System.out.println("2. Упорядочение массива по возрастанию.");
            System.out.println("3. Среднее значение элементов массива.");
            System.out.println("4. Сумма четных и нечетных элементов массива.");
            System.out.println("5. Таблица  3х5 случайных элементов (a(i,j)< 10).");
            System.out.println("6. Вывод максимального элемента из первого задания.");
            System.out.println("7. Поиграй  со строками.");
            userChoice = in.nextByte();
            switch (userChoice){
                case 1:
                    task_1();
                    break;
                case 2:
                    task_2();
                    break;
                case 3:
                    task_3();
                    break;
                case 4:
                    task_4();
                    break;
                case 5:
                    task_5();
                    break;
                case 6:
                    task_6();
                    break;
                case 7:
                    task_7();
                    break;
                default:
                    System.out.println("Введено неверное число!");
                    break;
            }
        }
    }


    public static void task_1(){
        int size = 25;
        int[] array= new int[size];
        for (int i = 0; i <size; i++) {
            array[i] = (int)(Math.random()*41-20);
        }
        int max = array[0];
        int min = array[0];
        int maxI = 0;
        int minI = 0;
        int temporary = 0;
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array)+"\n");
        for (int i = 0; i < size; i++) {
            if(array[i] > max){
                max = array[i];
                maxI = i;
            }
            if(array[i] < min){
                min = array[i];
                minI = i;
            }
        }
        temporary = array[maxI];
        array[maxI] = array[minI];
        array[minI] = temporary;
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("После перестановки получаем массив:");
        System.out.println(Arrays.toString(array)+"\n");
    }


    public static void task_2(){
        int size = 25;
        int temporary = 0;
        int[] array= new int[size];
        for (int i = 0; i <size; i++) {
            array[i] = (int)(Math.random()*41-20);
        }
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array) + "\n");
        for (int i = size-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if( array[j] > array[j+1] ) {
                    temporary = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporary;
                }
            }
        }
        System.out.println("Массив после сортировки:");
        System.out.println(Arrays.toString(array) + "\n");
    }


    public static void task_3(){
        int size = 20;
        int summ = 0;
        double average = 0;
        int[] array= new int[size];
        for (int i = 0; i <size; i++) {
            array[i] = (int)(Math.random()*41-20);
        }
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array) + "\n");
        for (int i = 0; i < size; i++) {
            summ += array[i];
        }
        average = (double)summ / size;
        System.out.println("Среднее арифметическое элементов массива: " + average + "\n");
    }


    public static void task_4(){
        int size = 30;
        int summEven = 0;
        int summOdd = 0;
        int[] array= new int[size];
        for (int i = 0; i <size; i++) {
            array[i] = (int)(Math.random()*41-20);
        }
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array) + "\n");
        for (int i = 0; i < size; i++) {
            if(array[i] % 2 == 1)
                summOdd += array[i];
            else
                summEven += array[i];
        }
        System.out.println("Сумма четных : " + summEven);
        System.out.println("Сумма нечетных : " + summOdd + "\n");
    }


    public static void task_5(){
        int[][] array = new int[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = (int)(Math.random()*111-100);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public static void task_6(){
        System.out.println("Программа 1 уже выводит максимальный и минимальный элемент.");
    }


    public static void task_7() {
        Scanner scan = new Scanner(System.in);
        String[] s = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите строку №" + (i + 1) + ":");
            s[i] = scan.next();
        }
        if (s[3].equals(s[4])) {
            s[0] = s[0].concat(s[1]);
            System.out.println("Строка №4 равна строке №5, тогда складываем строку №1 со строкой №2 и получим:");
            System.out.println(s[0]);
        }
        else {
            s[0] = s[0].concat(s[2]);
            System.out.println("Строка №4 не равна строке №5, тогда складываем строку №1 со строкой №3 и получим:");
            System.out.println(s[0] + "\n");
        }
    }
}
