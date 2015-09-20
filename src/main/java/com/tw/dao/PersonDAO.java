package com.tw.dao;

import com.tw.model.Person;

import java.util.List;

public interface PersonDAO {
    void save(Person p);

    List<Person> list();
}
