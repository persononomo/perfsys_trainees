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
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
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
}
