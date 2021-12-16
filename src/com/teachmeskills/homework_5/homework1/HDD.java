package com.teachmeskills.homework_5.homework1;

public class HDD {
    public String name;
    public int volume;

    public HDD() {
    }

    public HDD(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
