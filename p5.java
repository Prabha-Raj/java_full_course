// Write a program to check given number even or odd
import java.util.Scanner;
class p5{
public static void main(String [] args){
int num;
Scanner sc = new Scanner(System.in);
System.out.print("Enter a Number =  ");
num = sc.nextInt();
if(num%2==0){
System.out.print("Even Number, num = "+num);
}else{
System.out.print("Odd Number, num = "+num);
}}}