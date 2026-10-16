package util;

import java.util.Scanner;

public class InputUtil {
    static Scanner sc = new Scanner(System.in);

    public static String inputString() {
       
        return sc.nextLine();
    }

    public static double inputDouble() {
        double input = sc.nextDouble();
        sc.nextLine();
        return input;
    }

    public static int inputInt() {
        int input = sc.nextInt();
        sc.nextLine(); 
        return input;
    }
}
