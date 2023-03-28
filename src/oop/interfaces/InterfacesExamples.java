package oop.interfaces;

interface Bug {
    public static final String name = "Test";
    public void bugSound();
    public void bugSize();
}

interface Location {
    public void location();
}
class  Ant implements Bug,Location{

    public void bugSound() {
        System.out.println("tsss");
    }

    public void bugSize() {
        System.out.println("Small");
    }

    public void location() {
        System.out.println("Forest");
    }
}

public class InterfacesExamples {
    public static void main(String[] args) {

    }
}

