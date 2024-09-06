package LabAss2_CommandPattern;

public class TurnOff implements Command{
    private Tv tv;

    public TurnOff(Tv tv) {
        this.tv = tv;
    }
    @Override
    public String execute() {
        return tv.turnOff();
    }
}
