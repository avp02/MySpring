package avp.com.spring.core;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{

//    private RockMusic() {}

//    public static RockMusic getRockMusic() {
//        return new RockMusic();
//    }
    @Override
    public String getSong() {
        return "Wind cries Mari";
    }
}
