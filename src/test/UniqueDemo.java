package test;

import java.util.ArrayList;
import java.util.Scanner;

import static test.Person.isDuplicate;

public class UniqueDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<5; i++) {
            new Person(scanner.nextLine());
        }

        System.out.println(isDuplicate("jezreel"));

    }
}

class Person {
    private String name;
    private static ArrayList<String> names = new ArrayList<>();
    public static int count;

    public Person(String name) {
        this.name = name;
        names.add(name);
    }

    public String getName() {
        return name;
    }

    public static boolean isDuplicate(String name) {
        int counter = 0;

        for (String s: names) {
            if (name.equals(s)) {
                counter++;
            }
        }

        System.out.println(names);
        System.out.println(counter);

        if (counter > 1) {
            return true;
        }

        return false;
    }

    public static void getNames() {
        for (int i=0; i<names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println(names.size());
    }
}

