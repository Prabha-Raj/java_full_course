// WAP to find factorial of given number using 'Recursion'

import java.util.Scanner;
class p14{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter a Number for factorial :  ");
int num = s.nextInt();
double result = fact(num);
System.out.print("This is factorial of your number :  "+result);
}
static double fact(int num){
if(num==0 || num==1){
return 1;
}else{
return num*fact(num-1);
}
}
}