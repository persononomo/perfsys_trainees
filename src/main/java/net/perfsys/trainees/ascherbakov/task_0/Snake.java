package net.perfsys.trainees.ascherbakov.task_0;
import java.util.Random;
import java.util.Arrays;

public class Snake {
    public static void main(String[] args) {
        //обьявление переменной рандома;
        Random r = new Random();
        //длина массива значений случайных чисел от 0 до 99, чтобы заполнить матрицу 10х10;
        int lengthArray = 99;
        //обьявление массива 10х10;
        int[][] newArray = new int[10][10];
        //инициализация 10 строк массива;
        for (int i = 0; i < newArray.length; i++) {
            //инициализация 10 столбцов массива;       
            for (int j = 0; j < newArray.length; j++) {
                //заполнения массива 10х10 случайными числами;   
                newArray[i][j] = r.nextInt(lengthArray);
                //вывод на экран массива 10х10 из случайных чисел;
                System.out.print(newArray[i][j] + "\t");        
            }
            System.out.println();
        }
    }
}

