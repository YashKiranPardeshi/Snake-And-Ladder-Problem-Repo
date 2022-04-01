package com.infogalaxy.snake;

import java.util.Random;

public class SnakeAndLadderSimulator {
    //UC-1-single play position
    public void playerposition() {
        System.out.println("** Welcome To Snake And Ladder Game **");
        int playerposition = 0;
        System.out.println(" Player Position : " + playerposition);
    }
    //UC-2-use Random Number  Get A NUmber Between 1 TO 6
    public void rollsDie() {
        Random random = new Random();
        int rollsDie = (int) ((Math.random()*(6-1)))+1;
        System.out.println("Rolls Die Number IS : " + rollsDie);
    }
    public static void main(String[] args) {
        SnakeAndLadderSimulator snake = new SnakeAndLadderSimulator();
        snake.playerposition();
        snake.rollsDie();
    }

}





