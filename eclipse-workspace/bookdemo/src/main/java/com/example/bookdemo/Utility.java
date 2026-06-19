package com.example.bookdemo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Utility {

    private static SessionFactory sessionFactory;

    static {
        try {
            System.out.println("Initializing Hibernate...");

            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Book.class)
                    .buildSessionFactory();

            System.out.println("Hibernate initialized successfully!");

        } catch (Exception e) {
            System.out.println("Error creating SessionFactory");
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}