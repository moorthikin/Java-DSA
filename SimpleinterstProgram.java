package PrimitiveDatatype;

import java.util.Scanner;

public class SimpleinterstProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the P T R values: ");
        float principle = input.nextInt();
        float time = input.nextFloat();
        float rate = input.nextFloat();

        System.out.println("The Simple Interest is : " +principle*time*rate/100);
    }
}
