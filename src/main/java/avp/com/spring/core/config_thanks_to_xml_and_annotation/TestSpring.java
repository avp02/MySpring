package avp.com.spring.core.config_thanks_to_xml_and_annotation;

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

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic == classicalMusic1);

        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);
        RockMusic rockMusic1 = context.getBean("rockMusic", RockMusic.class);
        System.out.println(rockMusic == rockMusic1);


        context.close();
    }
}
