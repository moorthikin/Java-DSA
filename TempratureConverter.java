package PrimitiveDatatype;

import java.util.Scanner;

public class TempratureConverter {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.print("Enter the Celcius: ");
        float tempc = temp.nextInt();
        float tempf = (tempc*9/5)+32;// it was the formula for converting celcius into faranheate.
        System.out.println("Faranheate is "+tempf);
    }
}
