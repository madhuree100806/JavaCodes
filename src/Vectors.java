import java.util.*;
public class Vectors {
    public static void main(String[] args){
        ArrayList<Integer> A=new ArrayList<>();
        int n=5;
        long start=System.currentTimeMillis();
        for(int i=0;i<n;i++){
            A.add(i);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start+"ms");

        Scanner input=new Scanner(System.in);
        Vector<Integer> V=new Vector<>();
        start=System.currentTimeMillis();
        for(int i=0;i<n;i++){
            int temp=input.nextInt();
            V.add(temp);
        }
        end=System.currentTimeMillis();
        System.out.println(end-start+"ms");
        System.out.println(V.get(1));
        V.remove(1);//V.remove(index)
        for(int x:V){
            System.out.print(x+" ");
        }
        System.out.println();//V.size();V.capacity()


        Vector<String> v = new Vector<>();
        v.add("Apple");
        v.add("Banana");
        if (v.contains("Apple")) {
            System.out.println("Apple is present");
        }

        Vector<String> L=new Vector<>();
        Vector<String> result1 = create(L);
        System.out.println(result1);
        Vector<String> result2 = copyVector(v);
        System.out.println(result2);
    }
    //Returning A Vector
    public static Vector<String> create(Vector<String> v){
        v.add("Java");
        v.add("Python");
        v.add("C++");
        return v;
    }
    //Passing A Vector
    public static void display(Vector<String> v){
        Iterator<String> it=v.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
    //passing generic vector
    public static<T> void genericDisplay(Vector<T> v){
        for (T element : v) {
            System.out.println(element);
        }
    }
    // returning generic vector
    public static<T> Vector<T> copyVector(Vector<T> v){
        Vector<T> newVector = new Vector<>();
        newVector.addAll(v);
        return newVector;
    }
}
