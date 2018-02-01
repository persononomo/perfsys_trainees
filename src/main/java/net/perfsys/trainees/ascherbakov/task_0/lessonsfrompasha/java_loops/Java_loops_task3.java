//Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….

package net.perfsys.trainees.ascherbakov.task_0.lessonsfrompasha.java_loops;

public class Java_loops_task3 {
    public static void main(String[] args) {
        for (int i = 90; i >= 0; i -= 5) {
            System.out.println(i + "");
        }

    }
}
