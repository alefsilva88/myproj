package com.myproject;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        System.out.println("Este e o meu primeiro projeto");


        Random random = new Random();
        for(int i =0; i <10;i++){
            System.out.println(random.nextInt(0,11));
        }
    }
}
