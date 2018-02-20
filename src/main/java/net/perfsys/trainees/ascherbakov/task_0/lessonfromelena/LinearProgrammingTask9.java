//Ввести трехзначное число. Определить большую и меньшую из его цифр.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Math.abs;

public class LinearProgrammingTask9 {
    public static void main2(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите трехзначное число:");
        String str = scn.nextLine();
        int[] numArr = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();
        int a = Math.max(numArr[0], numArr[1]);
        int b = Math.max(numArr[1], numArr[2]);
        int c = Math.max(a, b);
        int a1 = Math.min(numArr[0], numArr[1]);
        int b1 = Math.min(numArr[1], numArr[2]);
        int c2 = Math.min(a1, b1);
        System.out.println("Максимальная цифра в числе " + c + "," + " Минимальная цифра в числе " + c2);

    }

    public static void main3(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите трехзначное число:");
        String str = scn.nextLine();
        int[] numArr = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).sorted().toArray();

        System.out.println("Максимальная цифра в числе " + numArr[numArr.length - 1] + "," + " Минимальная цифра в числе " + numArr[0]);

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите трехзначное число:");
        String str = scn.nextLine();

        int[] numArr = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();
        int a = numArr[0];
        int b = numArr[1];
        int c = numArr[2];

        int max = (abs(2 * c - abs(b - a) - b - a) + 2 * c + abs(b - a) + b + a) / 4;

        int indexMax = str.indexOf(String.valueOf(max));
        String str_mid = str.substring(0, indexMax) + str.substring(indexMax + 1);
        int[] numArr_short = Arrays.stream(str_mid.split("")).mapToInt(Integer::parseInt).toArray();

        int x = numArr_short[0];
        int y = numArr_short[1];
        int mid = (x + y + abs(x - y)) / 2;

        int indexMid = str.indexOf(String.valueOf(mid));
        String str_min = str.substring(0, indexMid) + str.substring(indexMid + 1);

        int min = Arrays.stream(str_min.split("")).mapToInt(Integer::parseInt).toArray()[0];

        System.out.println("Максимальная цифра в числе " + max + "," + " Минимальная цифра в числе " + min);

    }
}
