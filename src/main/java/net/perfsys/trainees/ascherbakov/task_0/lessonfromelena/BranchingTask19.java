//Ввести три целых числа. Определить, сколько среди них совпадающих.
// Программа должна вывести одно из чисел: 3 (если все совпадают), 2 (если два совпадают) или 0 (если все числа различны).
//Если совпадает два числа, указать какие: первое, второе или третье.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class BranchingTask19 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 5;
        if ((a == b) && (b == c) && (c == a)) System.out.println("3");
        else if ((a != b) && (b != c) && (c != a)) System.out.println("0");
        else if (a == b) System.out.println("2 " + "Первое и второе");
        else if (b == c) System.out.println("2 " + "Второе и третье");
        else if (c == a) System.out.println("2 " + "Третье и первое");
        else System.out.println("Муть");

    }
}
