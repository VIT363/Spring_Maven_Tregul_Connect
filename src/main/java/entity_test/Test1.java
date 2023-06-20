package entity_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        Employee emp = new Employee("Vit", "Zemtsov", "IT", 600);
        session.beginTransaction();
        session.save(emp);
        session.getTransaction().commit();
    }
}