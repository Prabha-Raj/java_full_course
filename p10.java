// WAP to find sum and average using Array.
import java.util.Scanner;
class p10{
public static void main(String [] args){
int [] x = new int[10];
int sum=0;
double average;
System.out.println("Enter 10 Number : ");
for(int i=0;i<10;i++){
Scanner s = new Scanner(System.in);
System.out.print("Enter ");
x[i] = s.nextInt();
sum = sum + x[i];
}
average = sum/10;
for(int i=0;i<10;i++){
System.out.println("x["+i+"] =  "+x[i]);
}
System.out.println("Sum of 10 Number is =  "+sum);
System.out.println("Average of 10 Numbers is = "+average);
}}