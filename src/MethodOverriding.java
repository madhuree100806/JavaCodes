/* parent class=>overridden class
   child class=>overriding class
  */
class VIT{
    int marks=100;
    void display(){
        System.out.println("In  VIT");
    }
    void display1(){
        System.out.println("VIT");
    }
    void show(){
        System.out.println("In VIT show");
    }

}
class CSE extends VIT{
    int marks=80;
    //overrides the parent class display() method
    void display(){
        System.out.println("Marks:"+super.marks);//prints the marks of parent class
        System.out.println("In CSE");
    }
    void display1(){
        super.display1();//goes to parent class display1 method
        System.out.println("CSE");
    }
    final void show(){
       
        System.out.println("In CSE show");
    }

}
public class MethodOverriding {
    public static void main(String[] args) {
        CSE c=new CSE();
        c.display();
        System.out.println("-------");
        c.display1();
        c.show();
    }
}
