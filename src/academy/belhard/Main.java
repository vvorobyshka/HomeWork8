package academy.belhard;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {



        Person per1 = new Person("Anna", "Vorobyova", new Address("Minsk", "Bedy", 4));
        Person per2 = new Person("Vanya", "Ivanov", new Address("Mogilev", "Nepokorennyh", 67));
        Person per3 = new Person("Petya", "Petrov", new Address("Grodno", "Lenina", 14));
        Person per4 = new Person(null, "Grichkov", new Address("Vitebsk", "Pushkina", 7));
        Person per5 = new Person("Nikita", null, new Address("Brest", "Grodnenskaya", 83));
        Person per6 = new Person("Sasha", "Kalitka", null);

        List<Person> list = new ArrayList<>();

        list.add(per1);
        list.add(per2);
        list.add(per3);
        list.add(per4);
        list.add(per5);
        list.add(per6);

    }
}
