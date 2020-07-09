package javahomework.homework5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionHomework {

    public static void main(String[] args) {

            //1. Convert elements of a  collection to upper case.

        List<String> stringList = new ArrayList<>();
        stringList.add("We");
        stringList.add("haVe");
        stringList.add("to");
        stringList.add("uppercase");
        stringList.add("aLL");
        stringList.add("WOrdS");

        System.out.println("---------------------------------------");
        System.out.println("stringList is: " + stringList);
        List<String> uppercasedList = stringList.stream()
                .map(el -> el.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("uppercasedList is: " + uppercasedList);

            //2. Filter collection so that only elements with less than 4 characters are returned.

        HashSet<String> stationary = new HashSet<>();
        stationary.add("pen");
        stationary.add("rubber");
        stationary.add("gum");
        stationary.add("book");
        stationary.add("copybook");
        stationary.add("pencil");

        System.out.println("---------------------------------------");
        System.out.println("stationary set is: " + stationary);
        List<String> filteredStationary = stationary.stream()
                .filter(el -> el.length() >= 4)
                .collect(Collectors.toList());
        System.out.println("filtered set is: " + filteredStationary);

            //3. Flatten multidimensional collection.

        List<List<String>> nestedLists = new ArrayList<>();
        List<String> el1 = new ArrayList<>();
        el1.add("el1.0");
        el1.add("el1.1");
        el1.add("el1.2");
        List<String> el2 = new ArrayList<>();
        el2.add("el2.0");
        el2.add("el2.1");
        nestedLists.add(el1);
        nestedLists.add(el2);
        System.out.println("---------------------------------------");
        System.out.println("Nested list is: " + nestedLists);
        List<String> flattened = nestedLists.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        System.out.println("Flattened list is: " + flattened);

            //4. Get oldest person from the collection.

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Ann", 17, "american"));
        personList.add(new Person("Jack", 19, "American"));
        personList.add(new Person("Stanislav", 31, "Russian"));
        personList.add(new Person("Chris", 18, "German"));
        personList.add(new Person("Emma", 12, "russian"));
        personList.add(new Person("Liam", 9, "GERMAN"));
        personList.add(new Person("Khloe", 31, "American"));
        personList.add(new Person("Ekaterina", 5, "russian"));
        personList.add(new Person("Jame", 16, "german"));

        System.out.println("---------------------------------------");
        System.out.println("Person list is: " + personList);
        Person oldest = personList.stream()
                .reduce((acc, person) -> person.getAge() > acc.getAge() ? person : acc)
                .get();
        System.out.println("The oldes is : " + oldest);

            //5. Sum all elements of a numeric collection

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(15);
        numbers.add(-6);

        System.out.println("---------------------------------------");
        System.out.println("Numbers: " + numbers);
        int sum = numbers.stream()
                .reduce((acc, number) -> acc + number)
                .get();
        System.out.println("Sum of numbers: " + sum);

            //7. Partition adults and kids.

        System.out.println("---------------------------------------");
        System.out.println("Persons: " + personList);
        List<Person> kids = personList.stream()
                .filter(person -> person.getAge() < 18)
                .collect(Collectors.toList());
        System.out.println("Kids list : " + kids);
        List<Person> adults = personList.stream()
                .filter(person -> person.getAge() >= 18)
                .collect(Collectors.toList());
        System.out.println("Adults list : " + adults);

            //6. Get names of all kids.

        List<String> kidsName = kids.stream()
                .map(kid -> kid.getName())
                .collect(Collectors.toList());
        System.out.println("Kids names: " + kidsName);

            //8. Group people by nationality.



        System.out.println("---------------------------------------");
        System.out.println("Person list: : " + personList);
        HashMap<String, ArrayList<Person>> nationalities = new HashMap<>();
        nationalities.put("american", new ArrayList<>());
        nationalities.put("russian", new ArrayList<>());
        nationalities.put("german", new ArrayList<>());
        personList.stream()
                .forEach(person -> nationalities.get(person.getNationality().toLowerCase()).add(person));
        System.out.println("Nationality partition : " + nationalities);

            //9.Get people names separated by comma.

        String names = personList.stream()
                .map(person -> person.getName())
                .collect(Collectors.joining(","));
        System.out.println("Concatinated names in person list: " + names + ".");
    }
}

class Person {
    private String name;
    private int age;
    private String nationality;

    public Person(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String anme) {
        this.name = anme;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String anme, int age) {
        this.name = anme;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}