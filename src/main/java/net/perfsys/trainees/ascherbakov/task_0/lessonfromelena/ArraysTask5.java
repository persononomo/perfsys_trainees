//Задача 5 «По возрастанию»
//Заполнить элементы массива, состоящего из n элементов таким образом, чтобы он был упорядочен по возрастанию (каждый следующий элемент массива больше предыдущего на некоторое случайное число).
//Например (n=10): -6, -3, 1, 3, 5, 6, 10, 15, 16, 20.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

import java.util.Random;

public class ArraysTask5 {
    public static void main(String[] args) {

        int n = 25;
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (new Random()).ints(1, 20).iterator().nextInt();
        }
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {

                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int num : array) {
            System.out.print(num + "\t");
        }
    }
}
