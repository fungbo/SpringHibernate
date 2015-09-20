package com.tw;

import com.tw.dao.PersonDAO;
import com.tw.model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringHibernateMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        PersonDAO personDAO = (PersonDAO) context.getBean("personDAO");
        Person person = new Person();
        person.setName("Joel");
        person.setCountry("Aus");
        personDAO.save(person);

        System.out.println("Person: " + person);
        List<Person> list = personDAO.list();
        for (Person p : list) {
            System.out.println("p = " + p);
        }
        context.close();
    }
}
