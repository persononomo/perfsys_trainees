//В банкомате имеются купюры номиналом 200 грн., 50 грн. и 10 грн.
//Как наименьшим количеством купюр можно выдать сумму в S гривен? Указать количество купюр каждого номинала.
//Предполагается, что в банкомате имеется достаточно большое количество купюр каждого номинала. 

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class LinearProgrammingTask2 {
   public static void main(String[] args) {
        int s = 2986;
        int a = 200;
        int b = 50;
        int c = 10;
        int d = 0;
        int b200 = 0;
        int b50 = 0;
        int b10 = 0;

        d = s;
        b200 = d / a;
        d = s - (b200 * a);
        b50 = d / b;
        d = s - b200 * a - b50 * b;
        b10 = d / c;
        d = s - b200 * a - b50 * b - b10 * c;


        System.out.println(b200 + " купюр по 200 грн. " + b50 + "  купюр по 50 грн. " +b10 + " купюр по 10 грн. "+ d + " остаток в грн. ");
    }

}
