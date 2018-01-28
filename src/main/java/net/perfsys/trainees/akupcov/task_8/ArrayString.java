package net.perfsys.trainees.akupcov.task_8;

import net.perfsys.trainees.akupcov.task_7.ArrayOfInteger;

//Создать метод, который будет выводить указанный массив на экран в строку. С помощью созданного метода и метода
// из предыдущей задачи заполнить 5 массивов из 10 элементов каждый случайными числами и вывести все 5 массивов на
// экран, каждый на отдельной строке.
//import
public class ArrayString {
    public static void main(String[] args) {
        int[] football = new int[10];
        int[] arena = new int[10];
        int[] address = new int[10];
        int[] index = new int[10];
        int[] basketball = new int[10];
        football = fillArray(football);
        arena = fillArray(arena);
        address = fillArray(address);
        index = fillArray(index);
        basketball = fillArray(basketball);
        toString(football);
        toString(arena);
        toString(address);
        toString(index);
        toString(basketball);
    }

    public static int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ArrayOfInteger.arrayRandom(5, 25);
        }
        return array;
    }

    public static void toString(int[] te) {
        for (int i = 0; i < te.length; i++) {
            System.out.print(Integer.toString(te[i]) + " ");

        }
        System.out.println();
    }
}
