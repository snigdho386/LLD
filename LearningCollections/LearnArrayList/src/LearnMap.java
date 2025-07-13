import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {

    public LearnMap(){


        //In HashMap all operations cost O(1)
        //In TreeMap all operations cost O(logN)

        //Map<String,Integer> mp = new HashMap<>();
        Map<String,Integer> mp = new TreeMap<>();


        mp.put("One",1);
        mp.put("Two",2);
        mp.put("Three",3);

        System.out.println(mp);
        // OP : {One=1, Two=2, Three=3}

        //ContainsKey to check if the key is present or not
        if(mp.containsKey("Two"))
            System.out.println("Present two");

        //Contains value
        if(mp.containsValue(2))
            System.out.println(2+" Value is present");

        // remove() is for removal of a entry
        mp.remove("Three");
        System.out.println("Map :: "+mp);

        // If it is absent then enter, alternate to former
        mp.putIfAbsent("Two", 23);


        //  Iterating over map

        // All entry set
        for (Map.Entry<String,Integer> e: mp.entrySet()){
            System.out.println(e.getKey()+" -> "+e.getValue());
        }

        // All keys of key value pair using mp.keySet()
        for(String k: mp.keySet()){
            System.out.println(k);
        }

        // All values of key value pair using mp.values()
        for(Integer v: mp.values()){
            System.out.println(v);
        }



        // isEmpty() to check if map is empty or not
        System.out.println(mp.isEmpty());

        // clear() to clear the map
        // mp.clear();


    }
}
