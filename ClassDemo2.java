class Employee{
int empId;
String empName;
long empSalary;
public void setValue(int id, String name, long sal){
empId=id;
empName=name;
empSalary=sal;
}
public void displayValue(){
System.out.println("Employee Id =  "+empId);
System.out.println("Employee Name =  "+empName);
System.out.println("Employee Salary =  "+empSalary);
}
}
class ClassDemo2{
public static void main(String [] args){
Employee e1=new Employee();
e1.setValue(101,"Rajeev",50000);
e1.displayValue();
System.out.println("");
Employee e2= new Employee();
e2.setValue(102,"Mr Prabhakar",100000);
e2.displayValue();

}
}