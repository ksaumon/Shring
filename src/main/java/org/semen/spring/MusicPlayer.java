package org.semen.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private Music music;
    private Music music1;
    private Music music2;
    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music, @Qualifier("classicalMusic")Music music1,
                       @Qualifier("popMusic")Music music2) {
        this.music = music;
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
        return "Playing: " + music.getSong() + "," + music1.getSong() + "," + music2.getSong();
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
