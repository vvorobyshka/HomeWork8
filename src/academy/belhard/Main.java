package academy.belhard;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {


        Person per1 = new Person("Anna", "Vorobyova", new Address("Minsk", "Bedy", 4));
        Person per2 = new Person("Vanya", "Ivanov", new Address("Mogilev", "Nepokorennyh", 67));
        Person per3 = new Person("Petya", "Petrov", new Address("Grodno", "Lenina", 14));
        Person per4 = new Person(null, "Grichkov", new Address("Vitebsk", "Pushkina", 7));
        Person per5 = new Person("Nikita", null, new Address("Brest", "Grodnenskaya", 83));
        Person per6 = new Person("Sasha", "Kalitka", null);

        List<Person> list1 = new ArrayList<>();

        list1.add(per1);
        list1.add(per2);
        list1.add(per3);
        list1.add(per4);
        list1.add(per5);
        list1.add(per6);


        List<String> list2 = list1.stream()
                .filter(line -> (line.getFirstName() != null))
                .filter(line -> (line.getLastName() != null))
                .filter(line -> (line.getAddress() != null))
                .sorted((h1,h2) -> h1.getAddress().getHouse() - h2.getAddress().getHouse())
                .map(line -> line.toString())
                .collect(Collectors.toList());

        System.out.println(list2);

    }
}
