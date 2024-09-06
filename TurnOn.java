package LabAss2_CommandPattern;
import java.util.*;

public class TurnOn implements Command{
    private Tv tv;
    //
    public TurnOn(Tv tv){
        this.tv = tv;
    }
    @Override
    public String execute() {
        Scanner sc = new Scanner(System.in);

        String msg1 = tv.turnOn();

        System.out.print("Choose Channel: ");
        int channel = sc.nextInt();sc.nextLine();
        String msg2 = "Channel Changed to " + channel;

        return msg1 += "\n" +  msg2;
    }
}
