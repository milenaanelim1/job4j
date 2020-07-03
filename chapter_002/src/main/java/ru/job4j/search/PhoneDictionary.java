package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подошедщих пользователей.
     */
    public List<Person> find(String key) {
        List<Person> result = new ArrayList<>();
        if (key != null) {
            for (Person person : persons) {
                if (person.getAddress().contains(key)
                        || person.getName().contains(key)
                        || person.getPhone().contains(key)
                        || person.getSurname().contains(key)) {
                    result.add(person);
                }
            }
        }
        return result;
    }
}