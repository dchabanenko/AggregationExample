package com.github.chabanenk0;

/**
 * Created by dmitry on 17.02.16.
 */
public class Furniture {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString()
    {
        return "Furniture: \n name:" + this.getName();
    }
}
