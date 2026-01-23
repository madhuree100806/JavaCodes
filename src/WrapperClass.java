import java.util.*;
public class WrapperClass {
    public static void main(String[] args) {
            // Primitive variables
            int i = 10;
            double d = 25.5;
            boolean b = true;
            System.out.println("Before Autoboxing (Primitive values):");
            System.out.println("int value: " + i);
            System.out.println("double value: " + d);
            System.out.println("boolean value: " + b);

            // Autoboxing: primitive to wrapper object
            Integer intObj = i;
            Double doubleObj = d;
            Boolean boolObj = b;
            System.out.println("\nAfter Autoboxing (Wrapper objects):");
            System.out.println("Integer object: " + intObj);
            System.out.println("Double object: " + doubleObj);
            System.out.println("Boolean object: " + boolObj);

            // Unboxing: wrapper object to primitive
            int i2 = intObj;
            double d2 = doubleObj;
            boolean b2 = boolObj;
            System.out.println("\nAfter Unboxing (Primitive values again):");
            System.out.println("int value: " + i2);
            System.out.println("double value: " + d2);
            System.out.println("boolean value: " + b2);
    }
}
