package net.perfsys.trainees.ascherbakov.task_0;

// 1) Создать статический метод,который будет иметь два целочисленных параметра a и b,и в качестве своего значения
// возвращать случайное целое число из отрезка[a;b].C помощью данного метода заполнить массив из 20 целых
// чисел и вывести его на экран.
// 2) Создать метод, который будет выводить указанный массив на экран в строку. С помощью созданного метода и метода
// из предыдущей задачи заполнить 5 массивов из 10 элементов каждый случайными числами и вывести все 5 массивов на
// экран, каждый на отдельной строке.


public class Training {
    public static void main(String[] args) {
        arrayFiveTen();
        arrayFiveTen();
        arrayFiveTen();
        arrayFiveTen();
        arrayFiveTen();
        
      \\    int x = 0;
      \\  while (x<5){
      \\      x++;
      \\      arrayFiveTen();
      \\  }

    }

    private static int numbers() {
        int a = 0;
        int b = 78;
        return (int) (Math.random() * (b - a) + a);
    }

    private static void array() {
        int[] newArray = new int[20];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = numbers();
            System.out.print(newArray[i] + "\t");
        }
        System.out.println();
    }

    private static void arrayFiveTen() {
        int[] newArrayFiveTen = new int[10];
        for (int i = 0; i < newArrayFiveTen.length; i++) {
            newArrayFiveTen[i] = numbers();
            System.out.print(newArrayFiveTen[i] + "\t");
        }
        System.out.println();

    }

}
