package net.perfsys.trainees.akupcov.task_6;

public class Snake {
    public static void main(String[] args) {
        int[][] numTwo = new int[9][9];
        numTwo = snakeNum1(numTwo, 1, 0, 0, 0); // для коректной работы вводить 1,0,0,0

        for (int i = 0; i < numTwo.length; i++) {
            for (int j = 0; j < numTwo.length; j++) {
                System.out.print(numTwo[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] snakeNum1(int[][] array, int k1, int a1, int t1, int m1) {
        int[][] num = array;
        int k = k1;
        int i, j;
        int a = a1;
        int t = t1;
        int m = m1;
        int p = 0;
        if(num.length % 2 == 0){
            p = num.length / 2;}
        else{ p = (num.length/2) + 1;}

        for (i = t; i < num.length - t; i++) {
            for (j = t; j < num.length - t; j++) {
                num[i][j] = a;
                a++;

                if (j == num.length - k) {
                    for (i = k; i < num.length - t; i++) {
                        num[i][j] = a;
                        a++;
                    }
                    k++;
                    m++;
                }
            }
        }
        for (i = num.length - k; i >= t; i--) {
            for (j = num.length - k; j >= t; j--) {
                i = num.length - m;
                num[i][j] = a;
                a++;
                if (j == t) {
                    j = t;
                    for (i = num.length - k; i > t; i--) {
                        num[i][j] = a;
                        a++;
                    }

                }
            }
        }
        t++;
        if (k <= p) {
            return snakeNum1(num, k, a, t, m);
        } else {
            return num;
        }
    }
}