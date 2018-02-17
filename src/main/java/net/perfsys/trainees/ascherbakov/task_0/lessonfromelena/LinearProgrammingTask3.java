//Имеются гири весом 100, 300 и 1000 грамм. Как наименьшим числом гирь этого набора можно составить вес в М грамм (M кратно 100).
// Указать вес каждой из используемых для этого гирь.
// Предполагается, что имеется достаточно большое количество гирь любого вида веса.


package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class LinearProgrammingTask3 {
    public static void main(String[] args) {
        int m = 500590;
        int a = 100;
        int b = 300;
        int c = 1000;
        int a100 = 0;
        int a300 = 0;
        int a1000 = 0;
        int d = 0;

        d=m;

        a1000=d/c;
        d = m - (a1000*c);
        a300=d/b;
        d = m - (a1000*c) - (a300*b);
        a100 = d/a;
        d = m - (a1000*c) - (a300*b) - (a100*a);

        System.out.println(a1000 + " гирь по 1000г " + a300 + " гирь по 300г " + a100 + " гирь по 100г " + d + " г в остатке");
    }
}
