package com.java24hours;

import java.util.*;
//this class is imported in order for program to refer to the random class

class Dice {
    public static void main(String[] arguments) { 
        //program generates a random number
        Random generator = new Random();
        int value = generator.nextInt();
        System.out.println("The random number is "
                + value);
    }
}