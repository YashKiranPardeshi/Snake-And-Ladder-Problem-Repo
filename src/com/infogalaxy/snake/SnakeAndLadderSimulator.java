package com.infogalaxy.snake;
import java.util.Random;
public class SnakeAndLadderSimulator {
    //UC-1-Position of player
  int position = 0;
  //Define Constant For Options
    final int NO_PLAY = 1;
    final int LADDER = 2;
    final int SNAKE = 3;
  // Showing The player current position
    public void showPosition(){
        System.out.println("Player position :" +position);
    }
    //-2-Rolling The Die To Position
    public void rollDie() {
        while (position != 100) {
            System.out.println("_________________________________");
            Random random = new Random();
            int dieNo = (int) ((Math.random() * (7 - 1)) + 1);
            System.out.println("DieNO :" + dieNo);
            //uc-3- Checking for option to play
            int option = (int) ((Math.random() * (4 - 1)) + 1);
            System.out.println("Option No :" + option);
            switch (option) {
                case NO_PLAY:
                    System.out.println("NO PLAY Arrived. stay on same position");
                    break;
                case LADDER:
                    System.out.println("HURRAY !!! YOU get LADDER");
                    position = position + dieNo;
                    break;
                case SNAKE:
                    System.out.println("OOP !!! YOU Get Snake");
                    position = position - dieNo;
                    break;
            }
            System.out.println("Position:"+position);
        }
    }
    public static void main (String[] args){
        //Creating player1 object
        SnakeAndLadderSimulator player1 = new SnakeAndLadderSimulator();
        // showing player1 position
         player1.showPosition();
         //Rolling The Die
        player1.rollDie();
        //Rolling The Die
        player1.showPosition();
    }
}





