package net.perfsys.trainees.ascherbakov.task_0.lessonsfrombook;

import java.util.Random;

public class ExampleBubbleSort {

    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[100];


        int maxValueArray = 99;

        for (int h = 0; h < array.length; h++)
            array[h] = r.nextInt(maxValueArray);

        bubbleSort(array);


    }

    public static void bubbleSort(int[] numbers) {

        int temp = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < (numbers.length - i); j++) {

                if (numbers[j - 1] > numbers[j]) {
                    //swap elements
                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;

                }
            }
        }
    }
}