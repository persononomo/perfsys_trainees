//Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….

package net.perfsys.trainees.ascherbakov.task_0.lessonsfrompasha.java_loops;

public class Java_loops_task2 {
    public static void main(String[] args) {
//        int a = 2*55;
//        for (int i = 1; i <a ; i+=2) {
//            System.out.println(i+"");
        for (int a = 1, b = 1; a <= 55; a++, b += 2) {
            System.out.println(a+"." + " " + b + " ");
        }
    }
}
