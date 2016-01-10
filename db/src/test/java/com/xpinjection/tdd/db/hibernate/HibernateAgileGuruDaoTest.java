package com.xpinjection.tdd.db.hibernate;

import com.xpinjection.tdd.db.AbstractDbTest;
import org.junit.Test;
import org.unitils.dbunit.annotation.DataSet;
import org.unitils.dbunit.annotation.ExpectedDataSet;
import org.unitils.spring.annotation.SpringBean;

import static org.unitils.reflectionassert.ReflectionAssert.assertReflectionEquals;


/**
 * @author Sofiia on 10.01.2016.
 */
public class HibernateAgileGuruDaoTest extends AbstractDbTest {
    @SpringBean("agileGuruDao")
    private AgileGuruDao dao;

    @Test
    @ExpectedDataSet
    public void agileGuruMayBeAdded() {
        AgileGuru guru = dao.add(new AgileGuru("Askhat", 100));
        assertNotNull(guru.getId());
    }

    @Test
    @DataSet
    public void agileGuruMayBeFoundByName() {
        AgileGuru expected = new AgileGuru("Sofiia", 50);
        expected.setId(1);
        assertReflectionEquals(expected, dao.findByName("Sofiia"));
    }
}
