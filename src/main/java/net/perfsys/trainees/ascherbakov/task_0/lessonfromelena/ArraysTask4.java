//Заполнить элементы массива, состоящего из n элементов последовательностью Фибоначчи: первые два элемента равны 1, а следующие равны сумме двух предыдущих
//Например (n=10): 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class ArraysTask4 {
    public static void main(String[] args) {
        int n = 15;
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            if (i < 2) {
                array[i] = 1;
            } else {
                array[i] = array[i - 2] + array[i - 1];
            }
            System.out.print(array[i] + "\t");
        }

    }
}

