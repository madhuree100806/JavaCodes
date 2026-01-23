//every constructor have a super() method=>calls the constructor of parent class
//this()=>calls the constructor of same class
class Parent{
    public Parent(){
        super();
        System.out.println("In parent");
    }
    public Parent(int n){
        System.out.println("In parent paraConstructor");
    }
}
class Child extends Parent{
    public Child(){
        super(5);// calls the parameterized constrictor of parent class and then the next statement executes
        System.out.println("In child");
    }
    public Child(int n){
        //super() calls the default constructor of parent class and then the next statement executes
        this(); //calls the default constructor of same class
        System.out.println("In child paraConstructor ");
    }
}

public class Constructors {
    public static void main(String[] args) {
        Child c=new Child();
        System.out.println("---------");
        Child C=new Child(5);

    }
}
