//У фермера живут коровы и курицы. У них всего N голов и k ног (k>2N, k – четное). Определить, сколько на ферме коров и куриц.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class LinearProgrammingTask1 {
    public static void main(String[] args) {
        int x, y, n, k;
        n = 4; // головы
        k = 12; // ноги
        x = y = 0;
        y = (4 * n - k) / 2;
        x = n - y;
        System.out.println(x + " коров " + y + " куриц ");
    }

}
