package PrimitiveDatatype;

import java.util.Scanner;
//Fibbonaci series
// 0 1 1 2 3 5 8 13 21 34
// a b c
public class FibbonaciprintingNnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int num = input.nextInt();
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a+""+b);
        for(int i=2;i<num;i++){
            if(a==10){
                break;
            }
            c=a+b;
            a=b;
            b=c;
            System.out.print(c) ;
        }
    }
}
