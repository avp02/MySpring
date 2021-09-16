package avp.com.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int age;

    public MusicPlayer(){}

    @Autowired
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void playMusicList() {
        for (Music music : musicList) {
            System.out.println("Playing " + music.getSong());
        }
    }
}
