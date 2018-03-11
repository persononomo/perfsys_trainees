//Задача 1 «Половина массива»
//Заполнить первую половину массива, состоящего из n элементов (n – четное) случайными числами в диапазоне [1;20]. Вторую половину массива получить как копию первой половины массива.
//Например, элементы массива A (n=10): 3, 6, 10, 16, 11, 3, 6, 10, 16, 11


package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;


import java.util.Random;


public class ArraysTask1 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (new Random()).ints(1, 20).iterator().nextInt();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                System.out.print(array[j] + "\t");
            }


        }

    }

}








