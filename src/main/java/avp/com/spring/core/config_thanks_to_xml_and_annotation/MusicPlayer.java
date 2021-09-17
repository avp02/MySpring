package avp.com.spring.core.config_thanks_to_xml_and_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

//    private List<Music> musicList = new ArrayList<>();
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private RapMusic rapMusic;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(){}

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, RapMusic rapMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.rapMusic = rapMusic;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    //    @Autowired
//    public MusicPlayer(List<Music> musicList) {
//        this.musicList = musicList;
//    }
//
//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

//    public void playMusicList() {
//        for (Music music : musicList) {
//            System.out.println("Playing " + music.getSong());
//        }
//    }
    public void playMusicList(MusicGenre musicGenre) {
        Random random = new Random();
        int intRandom = random.nextInt(classicalMusic.getSong().size());
        if (musicGenre == MusicGenre.CLASSICAL) {
            System.out.println(classicalMusic.getSong().get(intRandom));
        }else if(musicGenre == MusicGenre.ROCK) {
            System.out.println(rockMusic.getSong().get(intRandom));
        } else {
            System.out.println(rapMusic.getSong().get(intRandom));
        }
    }
}
