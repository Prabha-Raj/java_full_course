// WAP to fint sum if two numbers using user defined static method. 

import java.util.Scanner;
class p12{
static int sum(int x,int y){
return (x+y);
}
public static void main(String [] args){
Scanner s = new Scanner(System.in);
int a,b;
System.out.print("Enter two Number : ");
a=s.nextInt();
b=s.nextInt();
System.out.println("The sum of two numbers =  "+sum(a,b));
}
}