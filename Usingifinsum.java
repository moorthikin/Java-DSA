package PrimitiveDatatype;

import java.util.Scanner;

public class Usingifinsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Number  ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if(num1>num2){
            System.out.println(num1*num2);
        }
        if(num1<num2){
            System.out.println(num1-num2);

        }
    }
}
