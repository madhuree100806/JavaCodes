import java.util.*;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(5);
        nums.add(35);
        nums.add(40);
        nums.add(12);
        nums.add(23);
        //PRINTING AN ARRAYLIST
        //Method1
        for(Object n:nums){
            System.out.print(n+" ");
        }
        System.out.println();
        //Method2
        Iterator<Integer> it=nums.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        //Method3
        for(int i=0;i<nums.size();i++){
            System.out.print(nums.get(i)+" ");
        }
        System.out.println();

        //Example1
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("banana");                             //name.add(element)
        fruits.add(1,"orange");            //name.add(index,element)
        fruits.set(1,"guava");                          //name.set(index,new_element)
        fruits.remove("Apple");                     //name.remove(index)
        int ind=fruits.indexOf("banana");             //name.indexOf(element)
        int ind_last=fruits.lastIndexOf("banana");//name.lastIndexOf(element)
        fruits.add("apple");
        Iterator<String> itp= fruits.iterator();
        while(itp.hasNext()){
            System.out.print(itp.next()+" ");
        }
        System.out.println();
        //sorting an arraylist
        Collections.sort(fruits);
        System.out.println(fruits);

        //Example2
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println("Enter the no of elements:");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println("Enter the numbers:");
        for(int i=0;i<n;i++){
            int temp=input.nextInt();
            if(!arr.contains(temp)){
                arr.add(temp);
            }
        }
        sortList(arr);//Collections.sort(arr);
        System.out.println("Sorted Array:");
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
    public static void sortList(ArrayList<Integer> A){
        for(int i=0;i<A.size()-1;i++){
            for(int j=0;j<A.size()-i-1;j++){
                if(A.get(j)>A.get(j+1)){
                    int temp=A.get(j);
                    A.set(j,A.get(j+1));
                    A.set(j+1,temp);
                }
            }
        }
    }

}
