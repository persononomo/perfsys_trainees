package net.perfsys.trainees.akupcov.task_4;
//5. В переменные a и b записаны целые числа, при этом b больше a.
// Создайте программу, которая будет генерировать и выводить на экран целое псевдослучайное число из отрезка [a;b].
public class RandomNumber {
    public static void main(String[] args) {
        int a = 40;
        int b = 43;
        int n = 0;
        if(a < b){
            b -= a;
            n = (int)(Math.random()* b) + a;
            System.out.println(n);
        }else {
            System.out.println("a >= b ");
        }

    }
}
