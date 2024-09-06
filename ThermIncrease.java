package LabAss2_CommandPattern;

public class ThermIncrease implements Command{
    private Thermostats therm;
    public int temp = 20;

    public ThermIncrease(Thermostats therm){
        this.therm = therm;
    }

    @Override
    public String execute() {
        String msg1 = therm.thermIncrease();

        therm.increaseTemp(2);

        return msg1 += "\nCurrent Temperature: "+therm.getTemp() + "℃";
    }
}
