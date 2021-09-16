package avp.com.spring.core;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Hungary rhapsody");
        songs.add("classic music");
        songs.add("bethovin's music");
    }

//    private List<String> addSongs() {
//        List<String> songs = new ArrayList<>();
//        songs.add("Hungary rhapsody");
//        songs.add("classic music");
//        songs.add("bethovin's music");
//        return songs;
//    }

    @Override
    public List<String> getSong() {
//        return addSongs().parallelStream().findAny().get();
        return songs;
    }
}
