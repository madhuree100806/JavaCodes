//NESTED INNER CLASS
class Outer{
    int x=10;
    class Inner{
        int y=20;
    }
}

//METHOD LOCAL INNER CLASS
class Outside{
    void display(){
        class Inside{
            void show(){
                System.out.println("Inside method");
            }
        }
        Inside i=new Inside();
        i.show();
    }
    //STATIC INNER CLASS
    static class staticInside{
        int num=23;
    }
}
//ANONYMOUS INNER CLASS
class Anonymous{
    void message(){
        System.out.println("Hello");
    }
}
//INTERFACE IMPLEMENTATION
interface Students{
    void name();
}
public class InnerClass {
    public static void main(String[] args) {
        //object of inner class method1
        Outer.Inner I1=new Outer().new Inner();
        System.out.println("y="+I1.y);
        //object of outer class
        Outer O=new Outer();
        System.out.println("x="+O.x);
        //object of inner class method2
        Outer.Inner I2=O.new Inner();
        System.out.println("y="+I2.y);
        System.out.println("---------");



        //obj of method local inner class
        Outside o=new Outside();
        o.display();
        System.out.println("---------");



        //Obj of static inner class
        Outside.staticInside S=new Outside.staticInside();
        System.out.println(S.num);
        System.out.println("---------");



        //obj of anonymous inner class
        Anonymous A=new Anonymous(){
            void message(){
                System.out.println("Hello madhuree");
            }
        };
        A.message();
        System.out.println("---------");



        //Interface implementation
        Students s=new Students() {
            @Override
            public void name() {
                System.out.println("Geetha Madhuree");
            }
        };
        s.name();


    }
}
