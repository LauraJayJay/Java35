package oop;

public class Country {

    //fields
    private String name;
    private int population;
    private String capital;
    private String currency;
    private boolean inEu;

    //Setter methods

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setInEu(boolean inEu) {
        this.inEu = inEu;
    }

    //Getter methods


    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String getCapital() {
        return capital;
    }

    public String getCurrency() {
        return currency;
    }

    public boolean isInEu() {
        return inEu;
    }

    public void countryInfo(){
        System.out.println("Country: " + name);
        System.out.println("Population: " + population);
        System.out.println("Capital: " + capital);
        System.out.println("Currency: " + currency);
        System.out.println("Is in EU: " + inEu);
    }
    public void isThisCountyInEU(){
        if(inEu){
            System.out.println(name + "is in Eu");
        }else{
            System.out.println(name + " is not in EU");
        }
    }

}
