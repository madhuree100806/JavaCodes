/*private variables are only accessible only in the same class.No one from outside can see that.There is a way to access them but
 not directly.Methods in the same class can use these variables */
import java.util.*;
class Human{
    private String name;
    private int age;

    //SETTERS AND GETTERS

    //Here n and a are local vars; name and age are instance vars
    public void setName(String n){
        name=n;
    }
    public void setAge(int a) {
        age = a;
    }
    public void setName1(String name){
        this.name=name;
    }


    //Here both instance and local variables are same and are assigned with the same values.
    public void setAge1(int age){
        this.age=age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
class Employee{
    String name;
    int ID;
    public Employee(){
        name="Madhuree";
        ID=1234;
    }
    public Employee(String name,int id){
        this.name=name;
        this.ID=id;
    }
    public void display(){
        System.out.println("Emp name:"+name+"; EmpID:"+ID);
    }




}


public class Encapsulation{
    public static void main(String[] args) {
        Human H=new Human();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name:");
        String Name= input.nextLine();
        System.out.println("Enter your age:");
        int Age= input.nextInt();

        //Initializing variables using setter methods declared in the same class.
        H.setName(Name);
        H.setAge(Age);
        //Accessing variables using getter methods declared in the same class.
        System.out.println("Name-"+H.getName()+" : Age-"+H.getAge());

        Employee E1=new Employee();
        E1.display();
        System.out.println("Enter the employee name:");
        String name= input.nextLine();
        input.nextLine();
        System.out.println("Enter empID:");
        int id= input.nextInt();

        Employee E2=new Employee(name,id);
        E2.display();
    }



}