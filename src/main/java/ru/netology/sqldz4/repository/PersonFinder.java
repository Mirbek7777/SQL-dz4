package ru.netology.sqldz4.repository;

import ru.netology.sqldz4.model.Person;

import java.util.List;

public interface PersonFinder {

    List<Person> getPersonsByCity(String city);
}
