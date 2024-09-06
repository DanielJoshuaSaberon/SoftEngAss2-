package LabAss2_CommandPattern;
import java.util.*;

public class CentralHub {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        RemoteControl rc = new RemoteControl();

        Tv tv = new Tv();
        Lights lights = new Lights();
        SoundSystem music = new SoundSystem();
        Thermostats therm = new Thermostats();
        int x = 2, y = 2;
        while (true) {
            System.out.println("1. Turn TV On");
            System.out.println("2. Turn TV Off");
            System.out.println("3. Switch Lights On");
            System.out.println("4. Switch Lights Off");
            System.out.println("5. Sound System Music On");
            System.out.println("6. Sound System Music Off");
            System.out.println("7. Increase Thermostats Temperature");
            System.out.println("8. Decrease Thermostats Temperature");
            System.out.print("Select an option:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    rc.setCommand(new TurnOn(tv));
                    break;
                case 2:
                    rc.setCommand(new TurnOff(tv));
                    break;
                case 3:
                    rc.setCommand(new LightsOn(lights));
                    break;
                case 4:
                    rc.setCommand(new LightsOff(lights));
                    break;
                case 5:
                    rc.setCommand(new OnMusic(music));
                    break;
                case 6:
                    rc.setCommand(new OffMusic(music));
                    break;
                case 7:
                    rc.setCommand(new ThermIncrease(therm));
                    break;
                case 8:
                    rc.setCommand(new ThermDecrease(therm));
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
            System.out.println();
            System.out.println(rc.clickButton());
            System.out.println();
        }
    }
}

