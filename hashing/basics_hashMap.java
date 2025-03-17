import java.util.*;
public class basics_hashMap {
public static void main(String[] args) {
    
    HashMap<String, Integer> map = new HashMap<>();

    map.put("India", 1);
    map.put("India", 2);
    map.put("India", 3);
    System.out.println(map);

    for(String i : map.keySet()){

        if(map.containsKey("map")){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        System.out.println("uuu");
    }

}
}
