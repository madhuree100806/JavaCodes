//Every method in an interface is public abstract method and every variable is a static final variable
//interface to interface=>extends
//interface to class=>implements
//interfaces to class=>implements A,B
interface Inter{
    void show();
}
interface Tenth extends Inter{
    void marks();
}
class Result implements Tenth{
    public void show(){
        System.out.println("Inter:97 percentage.");
    }
    public void marks(){
        System.out.println("Tenth:95 percentage");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Result I=new Result();
        I.show();
        I.marks();


    }
}
