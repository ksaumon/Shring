package org.semen.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
//        Music music = context.getBean("musicBean", Music.class);//Внедрение зависимости вручную и содание обьекта new
//        MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer ferstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusicList();

        boolean comparison = ferstMusicPlayer == secondMusicPlayer;
        System.out.println(comparison);
        System.out.println(ferstMusicPlayer);
        System.out.println(secondMusicPlayer);

        ferstMusicPlayer.setVolume(10);
        System.out.println(ferstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());

//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
        context.close();
    }
}
