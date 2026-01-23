import java.util.*;
class Printer <T>{//GENERIC CLASS1
    T num;
    public Printer(T num){//GENERIC CONSTRUCTOR
        this.num=num;
    }
    public void display(){
        System.out.println(num);
    }
}
class Box <T>{
    T item;
    public void setBox(T item){//GENERIC METHOD
        this.item=item;

    }
    public T getBox(){
        return item;
    }
}
class StudentInfo<T,U>{//GENERIC CLASS2
    T name;
    U age;
    public StudentInfo(T name, U age){
        this.name=name;
        this.age=age;
    }
    public void show(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
//Inheritance
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cage<T extends Animal> {
    T animal;

    Cage(T animal) {
        this.animal = animal;
    }

    void makeSound() {
        animal.sound();
    }
}

//Interface
interface Interface<T>{
    void displayData(T data);
}
class InterImpl<T> implements Interface<T>{
    public void displayData(T data){
        System.out.println(data);
    }
}

public class Generics {
    public static void main(String[] args){
        Printer<Integer> I=new Printer(10);
        I.display();
        Printer<Double> D=new Printer(23.4);
        D.display();

        Box<String> B1=new Box<>();
        B1.setBox("Oranges");
        System.out.println(B1.getBox());
        Box<Integer> B2=new Box<>();
        B2.setBox(10);
        System.out.println(B2.getBox());

        //Multiple parameter generic class
        StudentInfo<String,Integer> S=new StudentInfo("Madhuree",19);
        S.show();

        //Inheritance
        Cage<Animal> c1 = new Cage<>(new Animal());
        Cage<Dog> c2 = new Cage<>(new Dog());
        c1.makeSound();
        c2.makeSound();

        Interface<String> i=new InterImpl<>();
        i.displayData("Interface");

    }
}
