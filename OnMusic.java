package LabAss2_CommandPattern;

import java.util.Scanner;

public class OnMusic implements Command{
    private SoundSystem music;

    public OnMusic(SoundSystem music){
        this.music = music;
    }

    @Override
    public String execute() {
        Scanner sc = new Scanner(System.in);

        String msg1 = music.onMusic();

        System.out.print("Choose/Type in Playlist: ");
        String playlist = sc.nextLine();

        return msg1 += "\n" + playlist;
    }
}
