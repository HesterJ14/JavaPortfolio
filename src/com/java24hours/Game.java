package com.java24hours;

class Game {
    public static void main (String[] arguments) {
        //program using if statement
        int total = 0;
        int score = 3;
        if (score == 7) {
            System.out.println("You score a touchdown:");
        }
        if (score == 3) {
            System.out.println("You kick a field goal:");
        }
        total = total + score;
        System.out.println("Total score: " + total);
    }
}