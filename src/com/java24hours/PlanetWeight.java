package com.java24hours;

class PlanetWeight {
    public static void main(String[] arguments) {
        //tells you weight on earth
        System.out.print("Your weight on Earth is ");
        double weight = 178;
        System.out.println(weight);
        
        //tells you weight on Mercury
        System.out.print("Your weight on Mercury is ");
        double mercury = weight * .378;
        System.out.println(mercury);
        
        //tells you weight on The Moon
        System.out.print("Your weight on the Moon is ");
        double moon = weight * .166;
        System.out.println(moon);
        
        //tells you weight on Jupiter
        System.out.print("Your weight on Jupiter is ");
        double jupiter = weight * 2.364;
        System.out.println(jupiter);
    }
}