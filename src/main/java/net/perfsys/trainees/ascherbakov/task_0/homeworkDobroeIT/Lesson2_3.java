//Написать программу, которая принимает на вход двумерный массив, печатает его содержимое и ничего не возвращает. (реализовать с помощью вложенных циклов).

package net.perfsys.trainees.ascherbakov.task_0.homeworkDobroeIT;

public class Lesson2_3 {
    public static void main(String[] args) {
        printOfArray(new int[][]{{1, 2, 87, 4, 676, 3, 4}, {3, 4, 23, 5, 76, 45, 3, 65}});

    }

    static void printOfArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
