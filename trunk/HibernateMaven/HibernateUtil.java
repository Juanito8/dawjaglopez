package org.proyectosMaven.pruebasHibernate;

import java.io.File;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
private static final SessionFactory sessionFactory;
static {
    try {
        sessionFactory = new AnnotationConfiguration().configure(
            new File("resources/hibernate.cfg.xml")).buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

public static Session getSession() throws HibernateException {
    return sessionFactory.openSession();
}

}