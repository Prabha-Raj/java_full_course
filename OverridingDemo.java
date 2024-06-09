class A{
public void m1(){
System.out.println("m1 Of A");
}
public void m2(){
System.out.println("m2 Of A");
}}
class B extends A{

public void m1(){
super.m1();
System.out.println("m1 Of B");
}
public void m3(){
System.out.println("m3 Of B");
}}
class OverridingDemo {
public static void main(String [] args){
A obj1 = new A();
B obj2 = new B();
obj1.m1();
obj1.m2();
obj2.m1();
obj2.m2();
obj2.m3();
obj2.m1();
}}