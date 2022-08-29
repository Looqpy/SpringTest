package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }
    public void playMusic(MusicGenre genre) {
        if (genre == MusicGenre.CLASSICAL) {
            System.out.println(classicalMusic.getSong());
        } else {
            System.out.println(rockMusic.getSong());
        }
    }
}