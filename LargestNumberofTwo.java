package PrimitiveDatatype;

import java.util.Scanner;

public class LargestNumberofTwo {
    public static void main(String[] args) {
        Scanner big = new Scanner(System.in);
        System.out.println("Enter the Number1: ");
        int a = big.nextInt();
        System.out.println("Enter the Number2: ");
        int b = big.nextInt();

        if(a>b){
            System.out.println("Largest Number :"+a);
        }
        if(a<b){
            System.out.println("Largest Number :"+b);
        }

    }
}
