import java.util.Scanner;

public class calc {


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        char ch1 = '+';
        char ch2 = '-';
        char ch3 = '/';
        char ch4 = '*';


        switch (scn.nextInt()) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '*':
                System.out.println(a * b);
                break;
        }


    }
}
