package oop.abstraction;

public class Fish extends Pet{

    private int waterChangesInWeek;

    public Fish (String color,String eat,String place, int avarange, int waterChangesInWeek){
        super(color,eat,place,avarange);
        this.waterChangesInWeek =waterChangesInWeek;
    }
   public void printPetInfo(){
       System.out.println("Color: " + color);
       System.out.println("Eat: " + eat);
       System.out.println("Place " + place);
       System.out.println("Lifespan: " + avarangeAge);
       System.out.println("Water changes in a week: " +waterChangesInWeek);

    }
}
