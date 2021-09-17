package avp.com.spring.core.config_thanks_to_javacode_and_annotation.config;

import avp.com.spring.core.config_thanks_to_javacode_and_annotation.ClassicalMusic;
import avp.com.spring.core.config_thanks_to_javacode_and_annotation.MusicPlayer;
import avp.com.spring.core.config_thanks_to_javacode_and_annotation.RapMusic;
import avp.com.spring.core.config_thanks_to_javacode_and_annotation.RockMusic;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("avp.com.spring.core.config_thanks_to_javacode_and_annotation")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    @Scope("prototype")
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic() {
        return new RapMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(classicalMusic(), rockMusic(), rapMusic());
    }
}
