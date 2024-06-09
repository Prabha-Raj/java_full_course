interface MyInterface1{
void m1();//public abstract void m1();
void m2();//public abstract void m2();
}
class inter implements MyInterface1{
public void m1(){
System.out.println("m1 of MyInterface1");
}
public void m2(){
System.out.println("m2 of MyInterface1");
}
}
class MyInterface {
public static void main(String [] args){
inter I = new inter();
I.m1();
I.m2();
}
}