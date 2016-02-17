package com.github.chabanenk0;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello");
        Room r = new Room();
        Furniture f = new Furniture();
        f.setName("Table");
        r.addFurniture(f);
        f = new Furniture();
        f.setName("Table2");
        r.addFurniture(f);
        f = new Furniture();
        f.setName("Table3");
        r.addFurniture(f);
        System.out.println(r.toString());

    }
}
