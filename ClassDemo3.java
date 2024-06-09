class Rectangle {
int length,breadth; // instance variable.
Rectangle(int l,int b){// constructor.
length=l;
breadth=b;
}
public int area(){
return length*breadth;
}}
class ClassDemo3 {
public static void main(String [] args){
Rectangle r = new Rectangle(10,5);
int a = r.area();
System.out.println("The area of the Rectangle =  "+a);
}}