package PrimitiveDatatype;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the float number:");
//        float num = input.nextFloat();
//        System.out.println(num);
        ///when we take the input value in double or float , in keyboard user enter the value in integer like 87 it's automatically converts into 87.0 this is known as type casting.
        ///Also enter the input value is bigger than the required data type that only it's converts the value.
        //type casting
         int sum = (int)(8756.8f);
        System.out.println(sum);
        //
        byte a= 50;
        byte b= 40;
        byte c = 60;
        int cal = a*b/c;
        System.out.println(cal);


    }
}
