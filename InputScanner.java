package PrimitiveDatatype;

import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter some input: ");
        int rollno = input.nextInt();
        System.out.println("your roll no is "+ rollno);

        // int is a data type, a is the identifier
        // object 10 is a literal in primitive data types.
        int a = 234_000_000;
        System.out.println(a);
    }
}
