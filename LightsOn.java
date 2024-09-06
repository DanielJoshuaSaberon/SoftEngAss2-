package LabAss2_CommandPattern;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class LightsOn implements Command{
    private Lights lights;

    public LightsOn(Lights lights){
        this.lights = lights;
    }
    @Override
    public String execute(){
        Scanner sc = new Scanner(System.in);

        String msg1 =  lights.lightsOn();

        System.out.print("Type to Choose Color of Lights" +
                "\n[red][blue][yellow]: ");
        String color = sc.nextLine();
        String msg2 = "Chosen Color of Lights is " + color.toUpperCase();

        return msg1 += "\n" + msg2;
    }
}
