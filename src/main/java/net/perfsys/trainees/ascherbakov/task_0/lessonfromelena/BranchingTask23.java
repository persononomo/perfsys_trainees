//Вася пытается высунуть голову в форточку размерами a и b см. Приняв условно, что его голова – круглая диаметром d см,
// определить, сможет ли Вася сделать это.
// Для прохождения головы в форточку необходим зазор в 1 см с каждой стороны.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class BranchingTask23 {
    public static void main(String[] args) {
        int a = 12;
        int b = 36;
        int d = 10;
        if (((d+2)<=a)&&((d+2)<=b)) System.out.println("Проходит");
        else System.out.println("Не проходит");

    }
}
