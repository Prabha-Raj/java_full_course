//WAP to find grearest no. in three unequal numbers 
import java.util.Scanner;
class p6{
public static void main(String [] args){
int a,b,c;
Scanner s = new Scanner(System.in);
System.out.print("Enter three numbers =  ");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
if(a>b && a>c){
System.out.println("Greatest number = "+a);
}else if(b>c && b>a){
System.out.println("Greatest Number = "+b);
}else{
System.out.println("Greatest Number = "+c);
}
}
}