//Ввести трехзначное число, в котором все цифры различны.
//Получить шесть чисел, образованных при перестановке цифр заданного числа.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

import java.util.Arrays;
import java.util.Scanner;

public class LinearProgrammingTask13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите трехзначное число, в котором все цифры различны:");
        String str = scn.nextLine();
        int[] numArr = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();
        System.out.println("Первое число: " + numArr[2]+numArr[1]+numArr[0]);
        System.out.println("Второе число: " +numArr[1]+numArr[2]+numArr[0]);
        System.out.println("Третье число: " +numArr[1]+numArr[0]+numArr[2]);
        System.out.println("Четвертое число: " +numArr[2]+numArr[0]+numArr[1]);
        System.out.println("Пятое число: " +numArr[0]+numArr[2]+numArr[1]);
        System.out.println("Шестое число: " +numArr[0]+numArr[1]+numArr[2]);
    }
}
