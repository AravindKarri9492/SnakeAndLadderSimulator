package com.bridgelabz;

public class SnakeAndLadder
{
    //constants
    public static final int NO_PLAY = 1;
    public static final int LADDER = 2;
    public static final int SNAKE = 3;
    public static final int START_POSITION = 0;
    public static final int WIN=100;

    public static void main(String[] args)
    {
        int playerPosition = 0;
        int dicePlayed = 0;
        while (playerPosition <WIN)
        {
            dicePlayed++;
            int ROLL_DICE = (int) (Math.random() * 6 ) + 1;
            System.out.println("After Rolling Dice We Get ::"+ROLL_DICE);
            int playerCheckOption;
            playerCheckOption = (int)(Math.random() *3 ) + 1;

            switch(playerCheckOption)
            {
                case NO_PLAY:
                    System.out.println("It's No Play, Your position is not changed, You are at :" + playerPosition);
                    break;

                case LADDER:
                    playerPosition = playerPosition + ROLL_DICE;
                    System.out.println("Congratulations !! You Got the ladder your position will be increased by " + ROLL_DICE);
                    break;

                case SNAKE:
                    playerPosition = playerPosition - ROLL_DICE;
                    System.out.println("Oops !! You just got bitten by snake your position will be increased by " + ROLL_DICE);
                    if(playerPosition <= 0)
                    {
                        playerPosition = START_POSITION;
                    }
                    break;

                default:
                    System.out.println("Something went wrong!!");
            }
            System.out.println("Player current position is "+ playerPosition);
            if(playerPosition > WIN)
            {
                playerPosition = playerPosition - ROLL_DICE;
            }
            else if (playerPosition == WIN)
            {
                System.out.println("Player won");
                System.out.println("We just make "+dicePlayed+" Number of dice to win the game");
            }
        }
    }
}
