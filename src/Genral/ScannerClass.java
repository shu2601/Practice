package Genral;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        System.out.println("Enter No :");

        Scanner sc = new Scanner(System.in);

        int rollNo= sc.nextInt();
        System.out.println(rollNo*2);

    }
}
