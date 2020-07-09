package javahomework.homawork4;

import java.util.*;

public class HashSetHomework {


    public static void main(String[] args) {
        // append the specified element to the end of a hash set
        HashSet<String> countries = new LinkedHashSet<>();
        countries.add("Costa Rica");
        countries.add("Dominican Republic");
        countries.add("Chile");
        countries.add("Switzerland");
        countries.add("Norway");
        countries.add("Spain");
        System.out.println("--------------------------------------");
        System.out.println("Now hash set is ordered: " + countries);

        // iterate through all elements in a hash set
        System.out.println("--------------------------------------");
        System.out.println("Iterating through the hash set: ");
        for (String country: countries) {
            System.out.println(". " + country);
        }

        // get the number of elements in a hash set
        System.out.println("--------------------------------------");
        System.out.println("Number of elements in a hash set: " + countries.size());

        // clone a hash set to another hash set
        HashSet<String> countriesClone = (HashSet<String>) countries.clone();
        System.out.println("--------------------------------------");
        System.out.println("Clone of previous hash set: " + countriesClone);

        // empty a hash set clone
        System.out.println("--------------------------------------");
        System.out.println("Before emptying clone: " + countriesClone);
        countriesClone.clear();
        System.out.println("After emptying clone: " + countriesClone);

        // test if a hash set is empty or not
        System.out.println("--------------------------------------");
        System.out.println("Is hash set clone is empty? " + countriesClone.isEmpty());

        // convert a hash set to an array
        System.out.println("--------------------------------------");
        System.out.print("Array from a hash set: ");
        for (int i = 0; i < countries.toArray().length; i++) {
            System.out.print(countries.toArray()[i]);
        }
        System.out.println();

        // convert a hash set to a tree set
        System.out.println("--------------------------------------");
        System.out.println("Tree set from a hash set: " + new TreeSet<String>(countries));

        // convert a hash set to a array list
        System.out.println("--------------------------------------");
        System.out.println("Array list from a hash set: " + new ArrayList<String>(countries));

        //  compare two hash sets, retain elements which are the same on both sets
        System.out.println("--------------------------------------");
        HashSet<String> countries1 = new LinkedHashSet<>();
        countries1.add("China");
        countries1.add("Dominican Republic");
        countries1.add("Japan");
        countries1.add("Italy");
        countries1.add("Iceland");
        countries1.add("Spain");
        System.out.println("Compare two hash sets: " + countries1.equals(countries));
        System.out.print("Elements which are in both sets: ");
        for (String country: countries) {
            if (countries1.contains(country)){
                System.out.print(country + " ");
            }
        }
        System.out.println();

        // remove all of the elements from a hash set
        System.out.println("--------------------------------------");
        System.out.println("Before removing elements from a hash set: " + countries);
        countries.removeAll(countries);
        System.out.println("After removing all elements from a hash set: " + countries);
    }
}
