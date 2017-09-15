package com.example.user.practice;

import java.util.Random;

public class RandomGenerator {
    private int n;
    public int getNumber(){
        Random random = new Random();
        n = random.nextInt(7);
        return n;
    }
}