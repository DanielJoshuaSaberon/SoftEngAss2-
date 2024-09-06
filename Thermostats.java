package LabAss2_CommandPattern;

public class Thermostats {
    public int temp = 20;

    public void increaseTemp(int increment) {
        this.temp += increment;
    }
    public void decreaseTemp(int decrement) {
        this.temp -= decrement;
    }

    public int getTemp() {
        return temp;
    }

    public String thermIncrease(){
        return "Temperature increased" ;
    }
    public String thermDecrease(){
        return "Temperature decreased" ;
    }

}
