package net.perfsys.trainees.ascherbakov.task_0.lessonsfrompasha.other;


//import java.util.Arrays;
import java.util.Random;

public class Snake {
    public static void main(String[] args) {
//1) Создать массив из 100 элементов;
        int[] array = new int[100];
//2) Заполнить массив случайными натуральными числами от 0 до 99;
        Random r = new Random();
        int maxValueOfArray = 99;
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(maxValueOfArray);
        }
//3) Отсортировать массив;
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        //Arrays.sort(array);
        //for (int i = 0; i < array.length; i++) {
//4) Создать матрицу 10 на 10;
        int size = 10, count = 0;
        int[][] matrix = new int[size][size];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
//5) Перенести одномерный отсортированный массив в двухмерный массив;
                matrix[row][column] = array[count++];
                System.out.print(matrix[row][column] + "\t");
            }
            System.out.println();


        }
    }
}

