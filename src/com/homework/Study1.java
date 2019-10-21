package com.homework;

public class Study1 {

    public static void main(String[] args) {
        int value1 = 123;
        int num1 = value1 / 100;
        int num2 = (value1 / 10) % 10;
        int num3 = value1 % 10;
        int res = num3*100 + num2*10 + num1;

        System.out.println(res);
        System.out.println( + (value1 - res));
    }

}



