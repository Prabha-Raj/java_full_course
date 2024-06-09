import java.util.Scanner;
class p4{
public static void main(String [] args){
int l,b;
Scanner s = new Scanner(System.in);
System.out.println("Enter Lenght and Breath Of Rectangle");
l = s.nextInt();
b = s.nextInt();
System.out.println("Area of rectangular = "+(l*b));
System.out.println("Perimeter of rectangular= "+ 2*(l+b));
}}