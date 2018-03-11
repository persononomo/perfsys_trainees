//Написать метод, который принимает на вход массив целых чисел и возвращает сумму тех, которые делятся на 2 без остатка.

package net.perfsys.trainees.ascherbakov.task_0.homeworkDobroeIT;

public class Lesson2_2 {
    public static void main(String[] args) {
        System.out.println(sumOfArray(new int[]{8, 2, 12, 8, 10}));
    }

     static int sumOfArray(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) result += array[i];
        }

        return result;
    }
}
