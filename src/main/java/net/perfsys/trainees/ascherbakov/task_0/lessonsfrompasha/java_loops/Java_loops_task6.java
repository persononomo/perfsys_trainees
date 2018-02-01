//Выведите на экран все двузначные члены последовательности 2an-1+200, где a1= –166.

package net.perfsys.trainees.ascherbakov.task_0.lessonsfrompasha.java_loops;

public class Java_loops_task6 {
    public static void main(String[] args) {
        for (int i = -166; i < 100; i = 2 * i + 200) {
            if (i > -100) {
                System.out.println(i + " ");
            }
        }
    }
}

