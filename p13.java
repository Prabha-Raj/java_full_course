//WAP to calculate volume of cuboid using user defined Non-static method
import java.util.Scanner;
class p13{
public int volume(int l,int b, int h){
return (l*b*h);
}
public static void main(String [] args){
int x,y,z,result;
Scanner s = new Scanner(System.in);
System.out.println("Enter length, breadth and height of Cuboid: ");
x=s.nextInt();
y=s.nextInt();
z=s.nextInt();
p13 obj=new p13();
result=obj.volume(x,y,z);
System.out.println("The volume of Cuboid =  "+result);
}
}
