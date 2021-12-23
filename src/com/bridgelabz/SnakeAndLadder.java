package com.bridgelabz;

public class SnakeAndLadder
{
    public static void main(String[] args)
    {
        int START_POSITION = 0;
        System.out.println(START_POSITION);
        int ROLL_DICE = (int)(Math.floor(Math.random() * 10) % 6) + 1;
        System.out.println("After the rolling dice we get :: " +ROLL_DICE);
    }
}
