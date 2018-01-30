//Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру.

package net.perfsys.trainees.ascherbakov.task_0.lessonsfrompasha;

public class SwitchAndMoreLogicTask2 {
    public static void main(String[] args) {
        int r = random();
        int a = r/100;
        int b = (r%100)/10;
        int c = r%10;
        if(a>=b&&a>=c) {
            System.out.println("Наибольшое число  " + a );
        }
        System.out.println();
    }
    private static int random() {
        int a = 100;
        int b = 999;
        return (int) (Math.random() * (b - a) + a);
    }
}
