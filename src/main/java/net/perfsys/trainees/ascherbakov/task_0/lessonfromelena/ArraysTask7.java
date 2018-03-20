//Задача 7 «Сумма цифр числа»
//Написать функцию, которая определяет сумму цифр целого числа. Создать массив из n случайных целых чисел в диапазоне [10…1000].
//Используя созданную функцию, вывести в список все числа, сумма цифр в которых минимальная.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

import java.util.Arrays;
import java.util.Random;

public class ArraysTask7 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        int[] arrayOfSum = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (new Random()).ints(10, 1000).iterator().nextInt();
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < arrayOfSum.length; i++) {
            arrayOfSum[i] = sumOfNums(array[i]);

        }
        //int min = Arrays.stream(array).min().getAsInt();
        //System.out.println(min);

        for (int num : arrayOfSum) {
            System.out.print(num + "\t");
        }
        System.out.println();
        for (int i = 0; i < arrayOfSum.length; i++) {
            if (arrayOfSum[i] == minOfArray(arrayOfSum))
                System.out.println("Минимальная сумма цифр в числе и само число " + minOfArray(arrayOfSum) + " " + array[i]);

        }

    }

    public static int minOfArray(int[] array) {
        int min = Arrays.stream(array).min().getAsInt();
        return min;
    }

    public static int sumOfNums(int a) {
        String str = String.valueOf(a);
        int[] numArr = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();
        int sum = Arrays.stream(numArr).sum();
        return sum;
    }

}
