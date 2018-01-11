package net.perfsys.trainees.ascherbakov.task_0;
import java.util.Random;


public class Snake {
    public static void main(String[] args) {
//1) Создать массив из 100 элементов 10х10;
        int[][] newArray = new int[10][10];
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray.length; j++) {
//2) Заполнить массив случайными натуральными числами от 0 до 99;
                Random r = new Random();
                int lengthArray = 99;
                newArray[i][j] = r.nextInt(lengthArray);
//3) Отсортировать массив от минимального к максимальному значению;


                System.out.print(newArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
