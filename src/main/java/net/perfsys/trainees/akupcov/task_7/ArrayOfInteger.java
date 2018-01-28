package net.perfsys.trainees.akupcov.task_7;

/*Создать статический метод, который будет иметь два целочисленных параметра a и b, и в качестве своего значения
возвращать случайное целое число из отрезка [a;b]. C помощью данного метода заполнить массив из 20 целых чисел и вывести его на экран.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayOfInteger {
    public static void main(String[] args) throws IOException {
        int[] array = new int[20];
        int start;
        int finish;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число начала массива");
        start = Integer.parseInt(reader.readLine());
        System.out.println("Введите число конца массива");
        finish = Integer.parseInt(reader.readLine());
        if (start < finish) {
            for (int i = 0; i < array.length; i++) {
                array[i] = arrayRandom(start, finish);
            }
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[j]);
            }

        } else {
            System.out.println("Конец массива больше начала!!!");

        }

    }

    public static int arrayRandom(int a, int b) {
        int c = b - a;
        return (int) (Math.random() * c) + a;


    }
}
