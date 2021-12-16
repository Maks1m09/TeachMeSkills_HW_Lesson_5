package com.teachmeskills.homework_5.homework1;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Start");
        Computer computer1 = new Computer(1450, "LG");

        Computer computer2 = new Computer(1000, "Acer", new HDD[10], new RAM[5]);
        System.out.println(computer2);
        System.out.println(computer1);
        System.out.println("End");
        Computer computer4 = new Computer(123, "sfddsf", new HDD[10], new RAM[1], Type.desktop);
        System.out.println(computer4);
    }
}
