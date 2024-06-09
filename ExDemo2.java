// Reverse Counter

class ExDemo2{
public static void main(String [] args) throws InterruptedException{
int c=10;
while(c>0){
Thread.sleep(1500);  //Built-in thread class and   time in milisecond
System.out.println(c);
c--;
}
}}