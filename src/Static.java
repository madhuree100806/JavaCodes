/*variable inside a class are instance variables and the variable inside method are local variables.
 static variable will be shared by all the objects(common variable used by all the objects).
 static variables can be used inside non-static methods but non-static variables cannot be used inside static methods*/
class Student{
    String name;
    int rollNo;
    //STATIC VARIABLE
    static String school;
    void show(){
        System.out.println("Name:"+name+" ;roll No:"+rollNo+" ;School:"+school);
    }
    //STATIC METHOD
    public static void show1(Student s){
        System.out.println("Inside static method");
        System.out.println("Name:"+s.name+" ;roll No:"+s.rollNo+" ;School:"+school);
        /*we cannot use non-static variables in static methods directly so we pass an object of class to access those variables
         static variables=>can be used directly
         non-static variable=> using class's obj. obj.nonStaticVariable
        */
    }


}

public class Static {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="madhuree";
        s1.rollNo=101;
        //Accessing static variable
        Student.school = "narayana";//className.variable=>same variable is shared by all the objects

        Student s2=new Student();
        s2.name="Geetha";
        s2.rollNo=102;
        s1.show();
        s2.show();
        //Calling static method
        Student.show1(s1);//to access non-static variables in static method=>className.staticMethod(Obj of class)

    }
}
