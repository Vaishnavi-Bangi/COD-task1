package com.codtech;
import java.util.Scanner;

public class Calci extends BasicCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicCalc b=new BasicCalc();
         Scanner sc=new Scanner(System.in);
         System.out.println("CALCULATOR:");
         System.out.println("Enter the first number:");
         double num1=sc.nextDouble();
         System.out.println("Enter the second number:");
         double num2=sc.nextDouble();
         System.out.println("Enter the operation:");
         System.out.println("1.Addition");
         System.out.println("2.Subtraction");
         System.out.println("3.Multiplication");
         System.out.println("4.Division");
         System.out.println("5.Modulus");
         int ch=sc.nextInt();
         sc.close();
         switch(ch)
         {
         case 1: System.out.println("Addition is:"+b.addition(num1,num2));
                 break;
         case 2: System.out.println("Subtraction is:"+b.subtraction(num1,num2));
                 break;
         case 3: System.out.println("Multiplication is:"+b.multiplication(num1,num2));
                 break;
         case 4: System.out.println("Division is:"+b.division(num1,num2));
                 break;
         case 5: if(num2!=0)
                {
        	     System.out.println("Modulus is:"+b.modulus(num1,num2));
                }
                else
                {
        	    System.out.println("cannot divide a number by Zero! please try again.");
        	    return;
                }
                break;
         }
	}


}
