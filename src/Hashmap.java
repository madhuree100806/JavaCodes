import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> students=new HashMap<>();
        students.put("Madhuree",19);
        students.put("Keerthi",19);
        students.put("Aarifa",18);
        System.out.println(students.get("Madhuree"));
        System.out.println(students.containsKey("Madhuri"));
        System.out.println(students.containsValue(18));
        System.out.println("Size of hashmap:"+students.size());
        System.out.println(students);
        students.replace("keerthi",18);//students.put("keerthi",18)
        System.out.println(students);
        students.putIfAbsent("Madhuri",19);
        System.out.println(students);
        students.remove("madhuree");
        if(students.containsKey("madhuree")){
            System.out.println("Key Found");
        }
        else{
            System.out.println("Key not found");
        }
        System.out.println(students.keySet());
        System.out.println(students.values());
        System.out.println(students.entrySet());
        for(String key:students.keySet()){
            System.out.println(key+":"+students.get(key));
        }
        //SORTING A HASHMAP
        //Ascending Order by Key
        students.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .forEach(e-> System.out.println(e.getKey()+"-"+e.getValue()));

        //Descending order by key
        students.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(e->System.out.println(e.getKey()+"-"+e.getValue()));

        //Ascending Order by Value
        students.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEach(e-> System.out.println(e.getKey()+"-"+e.getValue()));

        //Descending order by Value
        students.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(e->System.out.println(e.getKey()+"-"+e.getValue()));

    }
}
