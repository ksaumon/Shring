package org.semen.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {

    @Autowired
    private ClassicalMusic classicalMusic;
    private PopMusic popMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, PopMusic popMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.popMusic = popMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic() {
        System.out.println("Playing: " + classicalMusic.getSong());
        System.out.println("Playing: " + popMusic.getSong());
        System.out.println("Playing: " + rockMusic.getSong());
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
