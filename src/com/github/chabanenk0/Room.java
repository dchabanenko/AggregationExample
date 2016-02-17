package com.github.chabanenk0;

/**
 * Created by dmitry on 17.02.16.
 */
public class Room {
    protected String name;
    protected int number;
    protected Furniture[] furnitureArray;
    protected int numberOfFurnitureElements;

    public Room()
    {
        this.furnitureArray = new Furniture[100];
        this.numberOfFurnitureElements = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Furniture[] getFurnitureArray() {
        return furnitureArray;
    }

    public void setFurnitureArray(Furniture[] furniture, int number) {
        this.furnitureArray = furniture;
        this.numberOfFurnitureElements = number;
    }

    public void addFurniture(Furniture furniture)
    {
        this.furnitureArray[this.numberOfFurnitureElements] = furniture;
        this.numberOfFurnitureElements++;
    }

    public String toString()
    {
        String result =  "Room: \n name:" + this.getName()
                + "\n number:" + this.getNumber()+ "\n Furniture:\n";
        for(int i = 0; i < this.numberOfFurnitureElements; i++) {
            result = result + " --- " + this.furnitureArray[i].toString() + "\n";
        }

        return result;
    }

}
