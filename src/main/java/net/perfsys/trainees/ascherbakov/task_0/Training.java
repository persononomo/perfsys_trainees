package net.perfsys.trainees.ascherbakov.task_0;

// Создать статический метод,который будет иметь два целочисленных параметра a и b,и в качестве своего значения
// возвращать случайное целое число из отрезка[a;b].C помощью данного метода заполнить массив из 20целых
// чисел и вывести его на экран.

public class Training {
    public static void main(String[] args) {
        array();
    }

    private static int numbers() {
        int a = 0;
        int b = 78;
        int c;
        c = (int) (Math.random() * (b - a) + a);
        return c;

    }

    private static void array() {
        int[] newArray = new int[20];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = numbers();
            System.out.print(newArray[i] + "\t");
        }
        System.out.println();
    }

}
