package PrimitiveDatatype;

import java.util.Scanner;

public class SumfromInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enetr Number1: ");
        int num1 = input.nextInt();
        System.out.print("Enetr Number2: ");
        int num2 = input.nextInt();
        int result= num1+num2;
        System.out.println("Result is = " + result );
    }
}
