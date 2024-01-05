package PrimitiveDatatype;

import java.util.Scanner;

public class InrtoUSDprogram {
    public static void main(String[] args) {
        Scanner Inr = new Scanner(System.in);
        System.out.println("Enter the Rupees: ");
        float rupees = Inr.nextFloat();
        System.out.println("USD Value is: "+ rupees/83);

    }
}
