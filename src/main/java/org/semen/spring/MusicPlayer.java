package org.semen.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private final ClassicalMusic classicalMusic;

    @Autowired// анатация которая внедряет зависимости использование конструктор,метод,поля, а с полями приват
    //раьотает через рефликсию
    public MusicPlayer(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
    }

    public void playMusic() {
        System.out.println("Playing: " + classicalMusic.getSong());
    }



//    private List<Music> musicList = new ArrayList<>();

//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }


//    public void playMusicList() {
//        for(Music music : musicList) {
//            System.out.println("Playing: " + music.getSong());
//        }
//    }
}
