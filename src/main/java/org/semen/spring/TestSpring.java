package org.semen.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        Music music = context.getBean("classicalMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        Music music1 = context.getBean("popMusic", Music.class);
        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
        musicPlayer1.playMusic();

        Music music2 = context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
        musicPlayer2.playMusic();
        context.close();
    }

//    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
//        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());
//
////        MusicPlayer ferstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
////        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
////
////        boolean comparison = ferstMusicPlayer == secondMusicPlayer;
////        System.out.println(comparison);
////        System.out.println(ferstMusicPlayer);
////        System.out.println(secondMusicPlayer);
////
////        ferstMusicPlayer.setVolume(10);
////        System.out.println(ferstMusicPlayer.getVolume());
////        System.out.println(secondMusicPlayer.getVolume());
////
//////        System.out.println(musicPlayer.getName());
//////        System.out.println(musicPlayer.getVolume());
//        context.close();
//    }


//    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
//        MusicPlayer ferstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparison = ferstMusicPlayer == secondMusicPlayer;
//        System.out.println(comparison);
//        System.out.println(ferstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        ferstMusicPlayer.setVolume(10);
//        System.out.println(ferstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());
//
////        System.out.println(musicPlayer.getName());
////        System.out.println(musicPlayer.getVolume());
//        context.close();
//    }



//    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//            "applicationContext.xml");
////        Music music = context.getBean("musicBean", Music.class);//Внедрение зависимости вручную и содание обьекта new
////        MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusicList();
//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//        context.close();
//    }
}
