//Ввести цифры двух целых чисел: двузначного a2a1 и однозначного b, где a1 – число единиц, a2 – число десятков. 
//Получить цифры числа, равного сумме заданных чисел (известно, что это число двузначное).
//Слагаемое – двузначное число и число-результат не определять; условный оператор не использовать.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

import java.util.Arrays;
import java.util.Scanner;

public class LinearProgrammingTask14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите двухзначное число : ");
        int a = scn.nextInt();
        System.out.println("Введите однозначное число : ");
        int b = scn.nextInt();
        int sum = a+b;
        String str = String.valueOf(sum);
        int[] numArr = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();
        int a2 = numArr[0];
        int a1 = numArr[1];
        System.out.println("Цифры числа:" + a2 + " " + a1);
    }
}
