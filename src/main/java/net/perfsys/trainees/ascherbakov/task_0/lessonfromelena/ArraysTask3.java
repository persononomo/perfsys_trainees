//Задача 3 «Пары чисел»
//Заполнить массив, состоящий из n элементов таким образом, чтобы элементы с четными номерами были случайными числами в диапазоне [1;100], а с нечетными – равны предыдущему.
//Например, элементы массива A (n=10): 13, 13, 56, 56, 70, 70, 89, 89, 41, 41

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

import java.util.Random;

public class ArraysTask3 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];

        for (int i = 1; i < array.length; i += 2) {
            array[i] = (new Random()).ints(1, 100).iterator().nextInt();
            array[i - 1] = array[i];
        }
        for (int num : array) {
            System.out.print(num + "\t");
        }


    }
}
