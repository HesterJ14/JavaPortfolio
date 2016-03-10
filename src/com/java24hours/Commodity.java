package com.java24hours;

class Commodity {
    public static void main(String[] arguments) {
        //program using switch statment
        String command = "BUY";
        int balance = 550;
        int quantity = 42;
        
        switch (command) {
        case "BUY":
            quantity += 5;
            balance -= 20;
            break;
        case "Sell":
            quantity -= 5;
            balance += 15;
    }
        System.out.println("Balance: " + balance + "\n"
        + "Quantity: " + quantity);
    }
}