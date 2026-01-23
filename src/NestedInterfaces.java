/*  class A implements outer
    class B implements outer.inner
*/
interface Vit_Vellore{//Interface 1
    void yr_1994();
    interface Vit_AP{//Interface 2
        void yr_2017();
    }
}
class Vellore implements Vit_Vellore{
    public void yr_1994(){
        System.out.println("Main Branch");
    }
}
class AP implements Vit_Vellore.Vit_AP{//interface1.interface2
    public void yr_2017(){
        System.out.println("Sub Branch");
    }
}
public class NestedInterfaces {
    public static void main(String[] args) {
        Vellore V=new Vellore();
        V.yr_1994();
        AP A=new AP();
        A.yr_2017();
    }
}
