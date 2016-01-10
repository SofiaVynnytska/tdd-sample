package com.xpinjection.tdd.db.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 * @author Sofiia on 10.01.2016.
 */
public class HibernateAgileGuruDao implements AgileGuruDao {

    private final SessionFactory sessionFactory;

    public HibernateAgileGuruDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public AgileGuru add(AgileGuru guru) {

       sessionFactory.openSession().persist(guru);
        return guru;
    }

    @Override
    public AgileGuru findByName(String name) {
        return (AgileGuru)sessionFactory.openSession().createCriteria(AgileGuru.class)
                .add(Restrictions.eq("name", name)).uniqueResult();
    }
}
