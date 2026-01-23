// Normal class=> Only normal methods
//abstract class=>both normal and abstract methods
// We create objects of child/extended class to access the methods of abstract parent class.
// Abstract class's methods cannot be used directly.
//abstract methods are only declared in abstract class and its body defined in its extended class.
//We cannot create object of abstract class.All the abstract methods body should be defined in normal classes

//PROGRAM 1
abstract class College{
    //Normal Method
    public void display(){
        System.out.println("I am Vitian");
    }
    //Abstract Method
    public abstract void msg();// Declaration of abstract method
}
class Scope extends College{
    public void display(){
        System.out.println("I am from SCOPE");
    }
    //Body of abstract method in its derived class
    public void msg(){
        System.out.println("Hello! Madhuree");
    }
}


//PROGRAM 2
abstract class Car{
    public abstract void drive();
    public abstract void fly();
    public void FM(){
        System.out.println("Playing Music..");
    }
}
//Since all the abstract methods are not defined in his class this becomes abstract class
abstract class Jetta extends Car{
    public void drive(){
        System.out.println("Driving..");
    }
}
class AdvJetta extends Jetta{
    public void fly(){
        System.out.println("Flying high..");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Scope c=new Scope();
        c.msg();
        c.display();
        System.out.println("-----------------");
        AdvJetta J=new AdvJetta();
        J.FM();
        J.drive();
        J.fly();

    }
}
