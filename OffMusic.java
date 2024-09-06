package LabAss2_CommandPattern;

public class OffMusic implements Command{
    private SoundSystem music;

    public OffMusic(SoundSystem music){
        this.music = music;
    }

    @Override
    public String execute(){
        return music.offMusic();
    }
}
