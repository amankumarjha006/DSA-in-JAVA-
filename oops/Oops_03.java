package OOPS;

class Employee{
    String name;
    int salary;

    public int getSalary(){
        return salary;
    }
    public int setSalary(int salary){
        this.salary = salary;
        return this.salary;

    }
    public String getName(){
        return name;
    }
    public String setName(String n){
        this.name = n;
        return this.name;
    }
}

public class Oops_03 {
    public static void main(String[] args) {

        System.out.println("\n===Employee e2 details===");

        Employee e1 = new Employee();
        e1.setName("Aman");
        System.out.println("Employee Name: " + e1.getName());
        e1.setSalary(50000);
        System.out.println("Employee Salary: " + e1.getSalary());

        System.out.println("\n===Employee e2 details===");

        Employee e2 = new Employee();
        e2.setName("Aryan");
        System.out.println("Employee Name: " + e2.getName());
        e2.setSalary(60000);
        System.out.println("Employee Salary: " + e2.getSalary());

        System.out.println("\n===Employee e3 details===");

        Employee e3 = new Employee();
        e3.setName("Kunal");
        System.out.println("Employee Name: " + e3.getName());
        e3.setSalary(70000);
        System.out.println("Employee  Salary: " + e3.getSalary());


    }
    
}
