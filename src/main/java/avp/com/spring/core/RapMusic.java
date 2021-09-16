package avp.com.spring.core;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.ArrayList;
import java.util.List;

@Component
public class RapMusic implements Music{

    private List<String> songs = new ArrayList<>();

    {
        songs.add("firstRapchic");
        songs.add("SecondRapchic");
        songs.add("ThirdRapchic");
    }

//    private List<String> addSongs() {
//        List<String> songs = new ArrayList<>();
//        songs.add("firstRapchic");
//        songs.add("SecondRapchic");
//        songs.add("ThirdRapchic");
//        return songs;
//    }
    @Override
    public List<String> getSong() {
//        return addSongs().parallelStream().findAny().get();
        return songs;
    }
    @PostConstruct
    private void doMyInit() { //может быть любой модификатор доступа
        System.out.println("Doing my init method");
    }
    @PreDestroy
    protected void doMyDestroy() {
        System.out.println("Doing my destroy method");
    }
}
