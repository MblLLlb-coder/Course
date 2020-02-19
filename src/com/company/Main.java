package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static class C1 {//пункт 6
        private Scanner scr = new Scanner(System.in);

        void umn(int a) {
            int b = 3 * a;
        }

        void what(String str) {
            String s1 = ("Что значит, " + str + "?");
        }

        void AddToArr(int Num) {
            ArrayList<Integer> al;
            al = new ArrayList<>(10);
            al.add(Num);
        }

        void ChangeArr(int[] p7) {
            int elArr = scr.nextInt();
            int change = scr.nextInt();
            p7[elArr] = change;
        }

        int Return(int fr, int sd) {
            return fr + sd;
        }

        void P17(int[] arr, int a) {
            a = scr.nextInt();
            arr[5] = a;
        }
    }

    public static void main(String[] args) {
        // write your code here
        C1 c1 = new C1();//объект класса
        Scanner sc = new Scanner(System.in);
        int[] arr;
        // int choice = sc.nextInt();


        int a = 15;//Пункт 1


        String str = "Котики";//пункт 2
//int without[10]; ХЗ как делать пункт 3

        int[] arr0 = new int[10];//пункт 4
        arr = new int[10];
        for (int i = 0; i < arr.length; i++) {//пункт 5>>>
            arr[i] = (i + 1) * 10;
        }//<<<
        int num = sc.nextInt();

        int[] p7 = new int[10];//пункт 7>>>

        for (int i = 0; i < p7.length; i++) {
            p7[i] = sc.nextInt();
        }//<<<
        c1.ChangeArr(p7);//пункт 14
        c1.AddToArr(num);//пункт 13
        for (int value : arr0) {
            System.out.print(value);
        }

        c1.umn(a);//пункт 11
        c1.what(str);//пункт 12
        c1.Return(15, 5);//пункт 15
        c1.P17(arr0, 12);//пункт 17


        int[] arr1;
        Integer[] arr2 = new Integer[10];
        arr1 = new int[10];

        Arrays.sort(arr1);//пункт 8 по возрастанию
        for (int value : arr1) {
            System.out.println(value);
        }
        Arrays.sort(arr2, Collections.reverseOrder());//пункт 8 по убыванию
        for (Integer integer : arr2) {
            System.out.println(integer);
        }

    }
}

