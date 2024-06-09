// How can Imlements Inheritance.
class Base{
public void showBase(){
System.out.println("this massage frome Base class .");
}
}
class Derived extends Base {

void showDerived(){
super.showBase();
System.out.println("this massage frome Derived class .");
}
}
class InDemo1 {
public static void main(String [] args){
Derived d = new Derived();
d.showDerived();
}
}