package avp.com.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("applicationContext.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusicList(MusicGenre.RAP);
        musicPlayer.playMusicList(MusicGenre.CLASSICAL);
        musicPlayer.playMusicList(MusicGenre.ROCK);
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getAge());

        context.close();
    }
}
