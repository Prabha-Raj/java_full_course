// Simple calculator using switch statement

import java.util.Scanner;
class p7{
public static void main(String [] args){
int num1,num2,result,choice;
Scanner s=new Scanner(System.in);
System.out.print("Enter two number :  ");
num1=s.nextInt();
num2=s.nextInt();
System.out.println("Enter Your choice :  ");
System.out.println("Enter 1 for Addition :  ");
System.out.println("Enter 2 for Substraction : ");
System.out.println("Enter 3 for Multiplication : ");
System.out.println("Enter 4 for Division : ");
choice = s.nextInt();
switch(choice){
case 1:
System.out.println("Addintion is =  "+(num1+num2));
break;
case 2:
System.out.println("Substraction is =  "+(num1-num2));
break;
case 3:
System.out.println("Multiplication is =  "+(num1*num2));
break;
case 4:
System.out.println("Division is =  "+(num1/num2));
break;
default : 
System.out.println("Your choice is Invalid That is =  "+choice);
break;
}
}
}