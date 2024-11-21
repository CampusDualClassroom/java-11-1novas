package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());
        System.out.println(redRemote.turnOn());
        redRemote.channelUp();
        redRemote.channelDown();
        //Aquí ya es 0
        System.out.println(redRemote.channel);
        redRemote.channelDown();
        //Aquí sigue siendo 0
        System.out.println(redRemote.channel);
        redRemote.volumeUp();
        redRemote.volumeDown();
        redRemote.volume = 0;
        //Aquí ya es 0
        System.out.println(redRemote.volume);
        redRemote.volumeDown();
        //Aquí sigue siendo 0
        System.out.println(redRemote.volume);
        System.out.println(redRemote.turnOff());
    }
}

