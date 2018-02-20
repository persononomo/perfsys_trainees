//Ввести трехзначное число. Определить число, полученное при прочтении его цифр справа налево.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

import java.util.Arrays;
import java.util.Scanner;

public class LinearProgrammingTask10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите трехзначное число:");
        String str = scn.nextLine();
        int[] numArr = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();
        System.out.println("Число с цифрами в обратном порядке:" + numArr[2]+numArr[1]+numArr[0]);

    }
}
