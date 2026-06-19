package com.example.orderdemo;











import java.util.List;







import org.hibernate.Session;



import org.hibernate.SessionFactory;



import org.hibernate.Transaction;











public class OrderDAO {







    private SessionFactory sessionFactory;







    public OrderDAO() {



        sessionFactory = Utility.getSessionFactory();



    }







    private Session getSession() {



        return sessionFactory.openSession();



    }







    public void save(Order s) {



        Session session = getSession();



        Transaction tx = session.beginTransaction();







        session.persist(s);







        tx.commit();



        session.close();



    }







    public List<Order> findAll() {



        Session session = getSession();







        List<Order> employees =



                session.createQuery("from order", Order.class).list();







        session.close();







        return employees;



    }







    public Order findById(int id) {



        Session session = getSession();







        Order Employee = session.get(Order.class, id);







        session.close();







        return Employee;



    }







    public void update(Order s) {



        Session session = getSession();



        Transaction tx = session.beginTransaction();







        session.merge(s);







        tx.commit();



        session.close();



    }







    public void delete(int id) {



        Session session = getSession();



        Transaction tx = session.beginTransaction();







        Order employee = session.get(Order.class, id);







        if (employee != null) {



            session.remove(employee);



        }







        tx.commit();



        session.close();



    }



}


