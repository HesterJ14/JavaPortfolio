package com.java24hours;

class Nines {
    public static void main (String[] arguments) {
        //program displays the first 200 multiples of 9
        for (int dex = 1; dex <= 200; dex++) {
            int multiple = 9 * dex;
            System.out.print(multiple + " ");
        }
        System.out.println();
    }
}