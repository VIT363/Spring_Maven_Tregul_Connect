package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
   // @Autowired
   // @Qualifier("dog")
    private Pet pet;
    private String surname;
    private int age;

    @Autowired
     public Person(@Qualifier("catBean") Pet pet) {
       System.out.println("Person bean is created");
       this.pet = pet;
     }
    //public Person() {
    //    System.out.println("Person bean is created");

   // }

    public String getSurname() {
        System.out.println("Class Person:set surname");
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person:set age");
        this.age = age;
    }



   // @Autowired
   // @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Class Person:set pet");
        this.pet = pet;
    }

    public void callYouPet() {
        System.out.println("Hello my lovely Pet");
        pet.say();

    }
}
