//Ввести трехзначное число. Определить большую и меньшую из его цифр.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

        System.out.println("Максимальная цифра в числе " + numArr[numArr.length -1] + "," + " Минимальная цифра в числе " + numArr[0]);

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите трехзначное число:");
        String str = scn.nextLine();

        OptionalInt optionalMax = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).max();
        OptionalInt optionalMin =  Arrays.stream(str.split("")).mapToInt(Integer::parseInt).min();
        int max = optionalMax.orElse(0);
        int min = optionalMin.orElse(0);

        System.out.println("Максимальная цифра в числе " + max + "," + " Минимальная цифра в числе " + min);

    }
}
