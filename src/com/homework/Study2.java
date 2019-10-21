package com.homework;

public class Study2 {

    public static void main(String[] args) {

        double fn = 25;
        int kg = (int) (fn * (453.6 / 1000));
        int g = (int) ((fn * (453.6) / 1000 - kg) * 1000);

        System.out.println(kg);
        System.out.println(g);
    }

}
