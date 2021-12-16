package com.teachmeskills.homework_5.homework1;

import java.util.Arrays;

public class Computer {
    public int cost;
    public String model;
    public HDD[] boxArrayHDD;
    public RAM[] boxArrayRAM;
    public Type type;

    public Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
        this.boxArrayHDD = new HDD[10];
        this.boxArrayRAM = new RAM[5];
    }

    public Computer(int cost, String model, HDD[] boxArrayHDD, RAM[] boxArrayRAM) {
        this.cost = cost;
        this.model = model;
        this.boxArrayHDD = boxArrayHDD;
        this.boxArrayRAM = boxArrayRAM;
    }

    public Computer(int cost, String model, HDD[] boxArrayHDD, RAM[] boxArrayRAM, Type type) {
        this.cost = cost;
        this.model = model;
        this.boxArrayHDD = boxArrayHDD;
        this.boxArrayRAM = boxArrayRAM;
        this.type = type;
    }


    @Override
    public String toString() {
        return "Computer{" +
                "cost=" + cost +
                ", model='" + model + '\'' +
                ", boxArrayHDD=" + Arrays.toString(boxArrayHDD) +
                ", boxArrayRAM=" + Arrays.toString(boxArrayRAM) +
                ", type=" + type +
                '}';
    }

    public void isInfo() {
        System.out.println("cost" + cost + "" + model + boxArrayHDD + boxArrayRAM);
    }
}
