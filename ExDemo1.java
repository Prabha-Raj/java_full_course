import java.util.*;
class ExDemo1{
public static void main (String [] args){
int x,y,z;
Scanner s= new Scanner(System.in);
try{
System.out.print("Enter first number :  ");
x=s.nextInt();
System.out.print("Enter Second number :  ");
y=s.nextInt();
z=x/y;
System.out.println("Result = "+z);
}
catch(InputMismatchException ex1){
System.out.println("Enter numbers only");
}
catch(ArithmeticException ex2){
System.out.println("Are you trying to / by zero?");
}
finally{
System.out.println("This is the finally block");
}
}
}