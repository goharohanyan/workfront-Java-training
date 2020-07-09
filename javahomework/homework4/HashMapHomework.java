package javahomework.homawork4;

import java.util.HashMap;

public class HashMapHomework {
    public static void main(String[] args) {
        //13. associate the specified value with the specified key in a HashMap.
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("Spain", "Madrid");
        capitals.put("Japan", "Tokyo");
        capitals.put("Fiji", "Suva");
        capitals.put("Chile", "Santiago");
        System.out.println("----------------------");
        System.out.println("Country-capital hash map is: " + capitals);

        //14. count the number of key-value (size) mappings in a map.
        System.out.println("----------------------");
        System.out.println("Hash map size is: " + capitals.size());

        //15. copy all of the mappings from the specified map to another map.
        HashMap<String, String> capitalsClone = new HashMap<>();
        for (String key : capitals.keySet()) {
            capitalsClone.put(key, capitals.get(key));
        }
        System.out.println("----------------------");
        System.out.println("clone of hash map is: " + capitalsClone);

        //16. remove all of the mappings from a map.
        capitalsClone.clear();
        System.out.println("----------------------");
        System.out.println("Now after removing all elements, hash map clone is: " + capitalsClone);

        //17. check whether a map contains key-value mappings (empty) or not.
        System.out.println("----------------------");
        System.out.println("Hash map is empty: " + capitals.isEmpty());
        System.out.println("Clone hash map is empty: " + capitalsClone.isEmpty());

        //18. get a shallow copy of a HashMap instance.
        HashMap<String, String> capitalsShallowClone = (HashMap<String, String>) capitals.clone();
        System.out.println("----------------------");
        System.out.println("Shallow copy of hash map is: " + capitalsShallowClone);

        //19. test if a map contains a mapping for the specified key.
        System.out.println("----------------------");
        System.out.println("Hash map contains 'Armenia': " + capitals.containsKey("Armenia"));
        System.out.println("Hash map contains 'Spain': " + capitals.containsKey("Spain"));

        //20. test if a map contains a mapping for the specified value.
        System.out.println("----------------------");
        System.out.println("Hash map contains 'Suva': " + capitals.containsValue("Suva"));
        System.out.println("Hash map contains 'Yerevan': " + capitals.containsValue("Yerevan"));

        //21. create a set of the mappings contained in a map.
        System.out.println("----------------------");
        System.out.println("'Key - Value' set of the hash map: " + capitals.entrySet());

        //22. get the value of a specified key in a map.
        System.out.println("----------------------");
        System.out.println("The value of the element with key 'Chile' in hash map: " + capitals.get("Chile"));
        System.out.println("The value of the element with key 'Transilvania' in hash map: " + capitals.get("Transilvania"));

        //23. get a set of the keys contained in this map.
        System.out.println("----------------------");
        System.out.println("Keys of hash map: " + capitals.keySet());

        //24. get a collection view of the values contained in this map.
        System.out.println("----------------------");
        System.out.println("Values in hash map: " + capitals.values());
    }
}
