package com.xpinjection.tdd.db.hibernate;

/**
 * @author Sofiia on 10.01.2016.
 */
public class AgileGuru {

    private String name;
    private int level;

    public AgileGuru() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    private Long id;

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public AgileGuru(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
