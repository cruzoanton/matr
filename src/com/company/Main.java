package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String strArr[] = str.split(" ");
        int[] numArr = Arrays.stream(strArr).mapToInt(Integer::parseInt).toArray();




        Matrixx m33 = new Matrixx(5, 5, 9);
        m33.DisplayMatrix();
        System.out.println("---");

        for (int i = 0; i < 3; i++) {
            m33.rotateMatrix(90);
            System.out.println("---");
            m33.DisplayMatrix();
         }
    }
}
