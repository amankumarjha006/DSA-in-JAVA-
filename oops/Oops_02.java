// The previous code can also be written using parametrized constructor as follows:
package OOPS;
import java.util.Scanner;


class Student {
    String name;
    int age;

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void printInfo(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
    }


}


public class Oops_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Enter the number of Students---");
        int n = sc.nextInt();
         sc.nextLine();

        Student [] s = new Student[n];
        //input loop
        for (int i = 0; i<n; i++) {
            System.out.println("---Enter the details of Student " + (i+1) +"---");
            
            System.out.println("Enter Name: ");
            String name = sc.nextLine();

            System.out.println("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            s[i]=new Student(name,age);
        }

        //output loop
        for (int i = 0; i<n;i++){
            System.out.println("===details of Student " + (i+1) +"===");
            s[i].printInfo();
        }
        sc.close();
        
    }
    
}
