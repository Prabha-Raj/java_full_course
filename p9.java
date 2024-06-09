// WAP to print a Table of given number
import java.util.Scanner;
class p9{
public static void main(String [] args){
int num,result,counter;
Scanner s = new Scanner(System.in);
System.out.print("Enter A Number for Table :  ");
num=s.nextInt();
for(counter=1;counter<=10;counter++){
result=num*counter;
System.out.println(" "+num+" X "+counter+" = "+result);
}
}
}