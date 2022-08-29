package example;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

//Test Spring

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic(MusicGenre.CLASSICAL);
        musicPlayer2.playMusic(MusicGenre.ROCK);

        context.close();
    }
}