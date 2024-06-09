class MyThread extends Thread {
// Here we Override run method of Thread class.
public void  run(){
for(int i=1; i<=100;i++){
try {
Thread.sleep(500);
}catch(InterruptedException ex){

}
System.out.println(i);
}}}
class ThreadDemo1 {
public static void main(String [] args){
MyThread t = new MyThread();
t.start();

for(int i=1;i<=100;i++){
try {
Thread.sleep(1000);
}catch(InterruptedException ex) {

}
System.out.println("Main = "+i);
}
}}