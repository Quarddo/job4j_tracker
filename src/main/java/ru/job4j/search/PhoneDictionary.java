package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> name = (n) -> n.getName().contains(key);
        Predicate<Person> surName = (s) -> s.getSurname().contains(key);
        Predicate<Person> phone = (p) -> p.getPhone().contains(key);
        Predicate<Person> adress = (a) -> a.getAddress().contains(key);
        var combine = name.or(surName).or(phone).or(adress);
        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
