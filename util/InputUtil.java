package util;

import java.util.Scanner;

public class InputUtil {
    static Scanner sc = new Scanner(System.in);

    public static String inputString(String text) {
        System.out.print(text);
        return sc.nextLine();
    }

    public static double inputDouble(String text) {
        System.out.print(text);
        double input = sc.nextDouble();
        sc.nextLine();
        return input;
    }

    public static int inputInt(String text) {
        System.out.print(text);
        int input = sc.nextInt();
        sc.nextLine(); 
        return input;
    }
}
