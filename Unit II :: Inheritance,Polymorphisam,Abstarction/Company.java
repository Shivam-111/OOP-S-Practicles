// 11.	A company wants to clearly assign constructor parameters to object variables. 
// Question: 
// Create a class Employee with variables name and salary. 
// Use this keyword inside the constructor to initialize object variables. 
// Display employee details. 
// // 

class Employee{
    String name;
    double salary;

    Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }
    public void display(){
        System.out.println("Employee Name: "+name);
        System.out.println("Employee salary: "+salary);
    }
}
public class Company{
    public static void main(String args[]){
        Employee e1 = new Employee("Shivam",79000);
        Employee e2 = new Employee("Gaurav",79000);
        e1.display();
        e2.display();

    }
}