package com.company;

import sun.security.util.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] strArr = s.split(" ");   //разделили пробелами для массива
        int[] numArr = Arrays.stream(strArr).mapToInt(Integer::parseInt).toArray(); //массив из целых чисел
        int[] counters = new int[numArr.length]; //создаем массив количеств
        int f = 0;
        for (String str : strArr) {
            char[] ch = str.toCharArray();          //переводим строку в массив чаров
            int count = 0;
            for (char c : ch) {
                count++;                            //считаем посимвольно
            }
            counters[f++] = count;                  //готовый массив количеств символов
        }
        Arrays.sort(numArr); //сортировка чисел
        Arrays.sort(counters); //сортировка счетчиков(количества символов)
        System.out.println("по возрастанию " + Arrays.toString(numArr));
        System.out.println("в количествах символов " + Arrays.toString(counters));


//
//        Matrixx m33 = new Matrixx(5, 5, 9);
//        m33.DisplayMatrix();
//        System.out.println("---");
//
//        for (int i = 0; i < 3; i++) {
//            m33.rotateMatrix(90);
//            System.out.println("---");
//            m33.DisplayMatrix();
//        }
    }
}


