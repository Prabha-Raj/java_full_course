import java.util.Scanner;
class figur{
public int area(int s){
return (s*s);
}
public int area(int l,int b){
return (l*b);
}
}

class OverlodingDemo {
public static void main(String [] args){
Scanner s = new Scanner(System.in);
int side,length,breadth;
long a1,a2;
System.out.print(" Enter a Side of Square :  ");
side=s.nextInt();
System.out.print("Enter lenght and Breadth of Rectangle :  ");
length=s.nextInt();
breadth=s.nextInt();
figur obj = new figur();
a1=obj.area(side);
a2=obj.area(length,breadth);
System.out.println("Area of  Square is  "+a1);
System.out.println("Area of Rectangle is  "+a2);
}}