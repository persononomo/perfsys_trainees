//Создайте программу, выводящую на экран 12 первых элементов последовательности 2an-2–2, где a1=3 и a2=2.

package net.perfsys.trainees.ascherbakov.task_0.lessonsfrompasha.java_loops;

public class Java_loops_task10 {
    public static void main(String[] args) {
        for (int i = 3, a = 1;a<12; a++, i=2*i-2) {
            System.out.println(i+" ");
        }
    }
}


