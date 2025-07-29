package OOPS;

class Base{
    int x;
    public int getNumber(){
        return x;
    }
    public void setNumber(int num){
        this.x = num;
    }

    Base(){
        System.out.println("\nBase class constructor");
    }
    Base(int x){
        System.out.println("\nBase class parameterized constructor with a value of x as " + x);
    }
}

class Derived extends Base{
    int y;
    public int getNumber(){
        return y;
    }
    public void setNumber(int num){
        this.y = num;
    }

    Derived(){
        System.out.println("\nDerived class constructor");
    }
    Derived(int x, int y){
        super(x);// Calling the base class constructor with a value of x
        System.out.println("\nDerived class parameterized constructor with a value of y as " + y);
    }

}

class ChildOfDerived extends Derived{
    int z;
    public int getNumber(){
        return z;
    }
    public void setNumber(int num){
        this.z = num;
    }

    ChildOfDerived(){
        System.out.println("\nChildOfDerived class constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);// Calling the parameterized constructor of the parent class
        System.out.println("\nChild of Derived paraetrized constructor with a value of z as " + z);
    }

}

public class Oops_05 {
    public static void main(String[] args) {
        ChildOfDerived cd = new ChildOfDerived();// this calls the unparametrized constructors
        ChildOfDerived cd1 = new ChildOfDerived(10,15,20);// this calls the parametrized constructors
    }
}
