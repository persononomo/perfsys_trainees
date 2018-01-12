package net.perfsys.trainees.ascherbakov.task_0;
import java.util.Random;
import java.util.Arrays;

public class Snake {
    public static void main(String[] args) {
//1) Создать массив из 100 элементов;
        int[] Array = new int[100];
//2) Заполнить массив случайными натуральными числами от 0 до 99;
        Random r = new Random();
        int lengthArray = 99;
        for(int i =0;i<Array.length;i++){
            Array [i] = r.nextInt(lengthArray);
        }
//3) Отсортировать массив;
        Arrays.sort(Array);
        System.out.print(Array +"\t");
