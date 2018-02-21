//В трехзначном числе х зачеркнули вторую цифру.
//Когда к образованному при этом двузначному числу справа приписали вторую цифру числа х, то получили число у. 
//Написать программу, которая по введенному числу у определяет число х.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

import java.util.Arrays;
import java.util.Scanner;

public class LinearProgrammingTask12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число у: ");
        String str = scn.nextLine();
        int[] numArr = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();
        System.out.println("Число х: " + numArr[0] + numArr[2] + numArr[1]);
    }
}
