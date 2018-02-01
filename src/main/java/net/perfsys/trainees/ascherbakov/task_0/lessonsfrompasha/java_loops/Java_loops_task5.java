//Выведите на экран все члены последовательности 2an-1–1, где a1=2, которые меньше 10000.

package net.perfsys.trainees.ascherbakov.task_0.lessonsfrompasha.java_loops;

public class Java_loops_task5 {
    public static void main(String[] args) {
        for (int i = 2; i <10000 ; i=2*i-1) {
            System.out.println(i+" ");
        }
    }
}
