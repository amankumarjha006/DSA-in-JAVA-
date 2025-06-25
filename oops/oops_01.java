package OOPS;
import java.util.Scanner;

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println("Name: " + this.name);//'this' is used to find which object is accessing the variable
        System.out.println("Age: " +this.age);
    }
}

public class oops_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();//here the construtor is non parameterized so it will take default values for name and age
        System.out.println("Enter name: ");
        s1.name = sc.nextLine();
        System.out.println("Enter age: ");
        s1.age = sc.nextInt();
        sc.nextLine(); // consume newline left-over

        Student s2 = new Student();
        System.out.println("Enter name: ");
        s2.name = sc.nextLine();
        System.out.println("Enter age: ");
        s2.age = sc.nextInt();
        sc.nextLine();

        Student s3 = new Student();
        System.out.println("Enter name: ");
        s3.name = sc.nextLine();
        System.out.println("Enter age: ");
        s3.age = sc.nextInt();
        sc.nextLine();

        Student s4 = new Student();
        System.out.println("Enter name: ");
        s4.name = sc.nextLine();
        System.out.println("Enter age: ");
        s4.age = sc.nextInt();
        sc.nextLine();
        
        System.out.println("---Student 1 info---");
        s1.printInfo();
        System.out.println("---Student 2 info---");
        s2.printInfo();
        System.out.println("---Student 3 info---");
        s3.printInfo();
        System.out.println("---Student 4 info---");
        s4.printInfo();
        sc.close();


    }
}
