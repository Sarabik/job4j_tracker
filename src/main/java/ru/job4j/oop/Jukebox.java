package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже пешеходы по лужам");
            System.out.println("А вода по асфальту рекой");
            System.out.println("И неясно прохожим в этот день непогожий");
            System.out.println("Почему я веселый такой");
        } else if (position == 2) {
            System.out.println("Спят усталые игрушки, книжки спят.");
            System.out.println("Одеяла и подушки ждут ребят.");
            System.out.println("Даже сказка спать ложится,");
            System.out.println("Чтобы ночью нам присниться.");
            System.out.println("Ты ей пожелай:");
            System.out.println("Баю-бай.");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox play = new Jukebox();
        play.music(1);
        play.music(2);
        play.music(7);
    }
}