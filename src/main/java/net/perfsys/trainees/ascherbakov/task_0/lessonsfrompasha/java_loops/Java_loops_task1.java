//Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….

package net.perfsys.trainees.ascherbakov.task_0.lessonsfrompasha.java_loops;

public class Java_loops_task1 {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i+=3) {
            System.out.println(i + "");
        }
    }
}
