import java.util.Arrays;
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
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        //Arrays.sort(array);
        //for (int i = 0; i < array.length; i++) {
//4) Создать матрицу 10 на 10;
            int wImg = 10, hImg = 10, count = 0;
            int[][] matrix = new int[wImg][hImg];
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
