package avp.com.spring.core.config_thanks_to_javacode_and_annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music {

//    private RockMusic() {}

//    public static RockMusic getRockMusic() {
//        return new RockMusic();
//    }
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Wind cries Mari");
        songs.add("SecondRock");
        songs.add("ThirdRock");
    }
//    private List<String> addSongs() {
//        List<String> songs = new ArrayList<>();
//        songs.add("Wind cries Mari");
//        songs.add("SecondRock");
//        songs.add("ThirdRock");
//        return songs;
//    }
    @Override
    public List<String> getSong() {

//        return addSongs().parallelStream().findAny().get();
        return songs;
    }
}
