package com.pluralsight;

import com.pluralsight.streams.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Person p1 = new Person("Karl","Marx",64);
        Person p2 = new Person("Ada", "Lovelace", 36);
        Person p3 = new Person("Albert", "Einstein", 76);
        Person p4 = new Person("Marie", "Curie", 66);
        Person p5 = new Person("Nikola", "Tesla", 86);
        Person p6 = new Person("Isaac", "Newton", 84);
        Person p7 = new Person("Rosalind", "Franklin", 37);
        Person p8 = new Person("Alan", "Turing", 41);
        Person p9 = new Person("Grace", "Hopper", 85);
        Person p10 = new Person("Leonardo", "da Vinci", 67);

        ArrayList<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);
        people.add(p7);
        people.add(p8);
        people.add(p9);
        people.add(p10);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name to search (first or last)");
        String name = scan.nextLine();

        List<Person> matches = new ArrayList<>();
        for (Person peeps : people){
            if (peeps.getFirstName().equalsIgnoreCase(name) ||
                    peeps.getLastName().equalsIgnoreCase(name)) {
                matches.add(peeps);
            }

        }

    }
}
