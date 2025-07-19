package org.example;

import org.example.setup.HibernateUtil;
import org.hibernate.Session;

public class Main {

    public static void main(String[] args) {
        // Hibernate setup
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.close();
    }
}
