package avp.com.spring.core.config_thanks_to_javacode_and_annotation;

import avp.com.spring.core.config_thanks_to_javacode_and_annotation.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusicList(MusicGenre.RAP);
//        musicPlayer.playMusicList(MusicGenre.CLASSICAL);
//        musicPlayer.playMusicList(MusicGenre.ROCK);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic == classicalMusic1);

        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);
        RockMusic rockMusic1 = context.getBean("rockMusic", RockMusic.class);
        System.out.println(rockMusic == rockMusic1);

        musicPlayer.playMusic();

        context.close();
    }
}
