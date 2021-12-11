package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {

    public static void main(String[] args) {
        int start=0;
        System.out.println("Welcome to Snake And Ladder game");
        System.out.println("\nStarting the game with Point= " + start);
        int dice = (int)(Math.random() * 6) + 1;
        System.out.println("number on the dice is :" + dice);
    }
}
