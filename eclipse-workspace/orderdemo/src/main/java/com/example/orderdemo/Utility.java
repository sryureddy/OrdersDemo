package com.example.orderdemo;







import org.hibernate.SessionFactory;



import org.hibernate.cfg.Configuration;



import org.hibernate.*;



public class Utility {



    



    private static final SessionFactory sessionFactory = new Configuration()



            .configure() // Looks for hibernate.cfg.xml config



            .addAnnotatedClass(Order.class)



            .buildSessionFactory();







    public static SessionFactory getSessionFactory() {



        return sessionFactory;



    }



}