//Создайте программу, выводящую на экран 12 первых 
//элементов последовательности 2an-2–2, где a1=3 и a2=2.

package net.perfsys.trainees.ascherbakov.task_0.lessonsfrompasha.java_loops;

public class Java_loops_task10 {
    private static int recursion(int x) {
            if (x == 1) {
                return 3;
            } else if (x == 2) {
                return 2;
            } else {
                return 2 * recursion(x - 2) - 2;
            }
        }

        public static void main(String[] args) {
            for (int i = 1; i <= 12; i++) {
                System.out.println(i + " : " + recursion(i));
            }
        }
    }
    
