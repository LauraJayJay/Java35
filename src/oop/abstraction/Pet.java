package oop.abstraction;

public abstract class Pet {
    protected String color;
    protected String eat;
    protected String place;
    protected int avarangeAge;

    public Pet (String color,String eat,String place , int avarangeAge){
        this.color =color;
        this.eat =eat;
        this. place = place;
        this.avarangeAge =avarangeAge;
    }
    public abstract void printPetInfo();
}
