package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = context.getBean("myPet", Dog.class);
       // myDog.setName("Белка");
        Dog youDog = context.getBean("myPet", Dog.class);
       // youDog.setName("Стрелка");
       // System.out.println(myDog.getName());
       // System.out.println(youDog.getName());

        System.out.println("переменные ссылаются на один  и тот же объект? " + (myDog == youDog));
        System.out.println(myDog);
         System.out.println(youDog);
        context.close();

    }
}
