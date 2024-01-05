package PrimitiveDatatype;

import java.util.Scanner;

public class OddorEvenprogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int result = num1+num2;

        if (result%2==0){
            System.out.println("Number is even:" + result);
        }
        else{
            System.out.println("Number is odd:" +result);
        }
    }
}
