package net.perfsys.trainees.akupcov.task_6;

public class Snake {
    public static void main(String[] args) {

        int num[][] = {
                {1, 2, 3, 4, 5},
                {16, 17, 18, 19, 6},
                {15, 24, 25, 20, 7},
                {14, 23, 22, 21, 8},
                {13, 12, 11, 10, 9},
        };
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                System.out.print(num[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
