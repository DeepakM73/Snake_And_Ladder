package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {
    public static final int START = 0;
    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static final int WIN_POSITION = 100;

    public static void main(String[] args) {
        int start=0;
        System.out.println("Welcome to Snake And Ladder game");
        System.out.println("\nStarting the game with Point= " + START);

        int position = 0;
        int newPosition = 0;

        while (position != WIN_POSITION) {

            int dice = (int) (Math.random() * 6) + 1;
            System.out.println("Dice roll: " + dice);
            int checkOption = (int) (Math.random() * 3);

            switch (checkOption) {
                case NO_PLAY:
                    System.out.println("No Play");
                    break;

                case LADDER:
                    newPosition = dice;
                    position += newPosition;
                    System.out.println("Ladder");
                    if (position > WIN_POSITION) {
                        position -= newPosition;
                    }
                    break;

                case SNAKE:
                    newPosition = dice;
                    position -= newPosition;
                    System.out.println("Snake");
                    if (position < START) {
                        position = START;
                    }
                    break;
            }
            System.out.println("Position: " + position);
        }
    }
}
