
// simple calculator BY user input.
import jav.util.scanner;
class p3{
public static void main(String [] args){
int a,b;
Scanner s = new Scanner(System.in);
System.out.println("Enter two numbers = ");
a = s.nextInt();
b = s.nextInt();
System.out.println("Summition= "+(a+b));
System.out.println("Substraction= "+(a-b));
System.out.println("Multiplecation ="+(a*b));
System.out.println("Division = "+(a/b));
System.out.println("remainder = "+(a%b));
}}