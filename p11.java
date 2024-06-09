//WAP to sort array elements inn ascending order.
import java.util.Scanner;
import java.util.Arrays;
class p11{
public static void main(String [] args){
int [] list = new int[10];
int i;
Scanner s = new Scanner(System.in);
System.out.println("Enter ten numbers to the list ");
for(i=0;i<10;i++){
list[i]=s.nextInt();
}
Arrays.sort(list);
System.out.println("The elements of list in sorted order are ->" );
System.out.print("[ ");
for(i=0;i<10;i++){
System.out.print(list[i]+", ");
}
System.out.print(" ]");
}}