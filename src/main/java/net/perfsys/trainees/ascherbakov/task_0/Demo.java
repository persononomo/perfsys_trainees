package net.perfsys.trainees.ascherbakov.task_0;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        //1) Создать массив из 100 элементов;
        int[] array = new int[100];
//2) Заполнить массив случайными натуральными числами от 0 до 99;
        Random r = new Random();
        int maxValueOfArray = 99;
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(maxValueOfArray);
        }
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;


                }

            }
        }
    }
}