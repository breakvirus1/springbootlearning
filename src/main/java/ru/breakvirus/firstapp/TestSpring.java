package ru.breakvirus.firstapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
/*
        Music = context.getBean("music", Music.class);
        MusicPlayer = new MusicPlayer(music);
*/
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
        context.close();
    }
}
