package net.perfsys.trainees.ascherbakov.task_0.lessonsfrompasha.other;
import java.util.Arrays;

// 1) Создать статический метод,который будет иметь два целочисленных параметра a и b,и в качестве своего значения
// возвращать случайное целое число из отрезка[a;b].C помощью данного метода заполнить массив из 20 целых
// чисел и вывести его на экран.
// 2) Создать метод, который будет выводить указанный массив на экран в строку. С помощью созданного метода и метода
// из предыдущей задачи заполнить 5 массивов из 10 элементов каждый случайными числами и вывести все 5 массивов на
// экран, каждый на отдельной строке.
// 3) Создать метод, который будет сортировать указанный массив по возарстанию любым известным вам способом.
// 4) В массиве хранится 7 явно заданных текстовых строк. Создать программу, которая отсортирует и выведет на экран строки
// в алфавитном порядке.


// Создать статический метод,который будет иметь два целочисленных параметра a и b,и в качестве своего значения
// возвращать случайное целое число из отрезка[a;b].C помощью данного метода заполнить массив из 20целых
// чисел и вывести его на экран.

public class Training {
    public static void main(String[] args) {
        int[] num = {21, 76, 16, 98, 123, 564}; //пример сортировки методом пузырька
        int n = num.length;
        bubbleSort(num);
        for (int i = 0; i < n; i++)
            System.out.print(num[i] + "\t");
//        wordsArray(); //пример выполнения 4-ого задания

    }

    private static int numbers() { //метод случайных чисел
        int a = 0;
        int b = 78;
        return (int) (Math.random() * (b - a) + a);
    }

    private static void array() { //массив 20 случайных чисел
        int[] newArray = new int[20];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = numbers();
            System.out.print(newArray[i] + "\t");
        }
        System.out.println();
    }

    private static void arrayFiveTen() { //массив 10 случайных чисел
        int[] newArrayFiveTen = new int[10];
        for (int i = 0; i < newArrayFiveTen.length; i++) {
            newArrayFiveTen[i] = numbers();
            System.out.print(newArrayFiveTen[i] + "\t");
        }
        System.out.println();

    }

    private static void bubbleSort(int[] numbers) { //метод сортировки пузырьком
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < (numbers.length - i); j++) {
                if (numbers[j - 1] > numbers[j]) {
                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

    }

    private static void fiveArraysToScreen() { //5 массивов из 10 числе в консоль
        int x = 0;
        while (x < 5) {
            x++;
            arrayFiveTen();
        }
    }

    private static void wordsArray() {
        String[] words = {"Пушкин", "Лермонтов", "Некрасов",
        "Толстой Л.Н.", "Толстой А.Н.", "Есенин", "Паустовский"};
        System.out.println("Unsorted array:" + Arrays.toString(words));
        Arrays.sort(words);
        System.out.println("Sorted array:" + Arrays.toString(words));
    }
}
