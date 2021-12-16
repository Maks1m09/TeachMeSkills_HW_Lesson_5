package com.teachmeskills.homework_5.homework1;

public class RAM {
    public String title;
    public int volume;
    public String type;

    public RAM() {
    }

    public RAM(String title, int volume, String type) {
        this.title = title;
        this.volume = volume;
        this.type = type;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "title='" + title + '\'' +
                ", volume=" + volume +
                ", type='" + type + '\'' +
                '}';
    }
}
