package com.xpinjection.tdd.db.hibernate;

/**
 * @author Sofiia on 10.01.2016.
 */
public interface AgileGuruDao {
    AgileGuru add(AgileGuru guru);

    AgileGuru findByName(String name);
}
