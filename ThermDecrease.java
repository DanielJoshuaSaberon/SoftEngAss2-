package LabAss2_CommandPattern;

public class ThermDecrease implements Command{
    private Thermostats therm;

    public ThermDecrease(Thermostats therm){
        this.therm = therm;
    }

    @Override
    public String execute() {
        String msg1 = therm.thermDecrease();

        therm.decreaseTemp(2);

        return msg1 += "\nCurrent Temperature: "+ therm.getTemp()+ "℃";
    }
}
