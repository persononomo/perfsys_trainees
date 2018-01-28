package net.perfsys.trainees.ascherbakov.task_0;

public class Training {
    public static void main(String[] args) {
        System.out.println();

    }

    private static int numbers() {
        int a = 0;
        int b = 78;
        int c;
        c = (int) (Math.random() * (b - a) + a);
        return c;

    }

    private static void array() {
        int[] newArray = new int[20];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = numbers();
            System.out.print(newArray[i] + "\t");
        }
        System.out.println();
    }

}
