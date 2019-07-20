package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        String playerName = "Lamu";
        int playerScore = 500;

        displayHighScorePostion(playerName, playerScore);
        int playerScorePostion = calculateHighSchoolPosition(playerScore);
        System.out.println("The position in high table for the student is " + playerScorePostion);


        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighSchoolPosition(1500);
        displayHighScorePostion("Tim", highScorePosition);

        highScorePosition = calculateHighSchoolPosition(900);
        displayHighScorePostion("Tom", highScorePosition);

        highScorePosition = calculateHighSchoolPosition(400);
        displayHighScorePostion("Jill", highScorePosition);

        highScorePosition = calculateHighSchoolPosition(50);
        displayHighScorePostion("John", highScorePosition);

        highScorePosition = calculateHighSchoolPosition(1000);
        displayHighScorePostion("Louise", highScorePosition);

        highScorePosition = calculateHighSchoolPosition(500);
        displayHighScorePostion("Carol", highScorePosition);

        highScorePosition = calculateHighSchoolPosition(100);
        displayHighScorePostion("Frank", highScorePosition);







    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus );
            finalScore += 2000;

            return finalScore;
        }else return -1;

    }

    //Challenge problem
    public static void  displayHighScorePostion(String playerName, int playerScore){
        System.out.println("The player " + playerName + " managed to get into position " + playerScore + " on the high score table");

    }

    public static int calculateHighSchoolPosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        }else if(playerScore >= 500 && playerScore < 1000){
            return 2;

        }else if(playerScore >= 100 && playerScore < 500){
            return 3;
        }else{
            return 4;
        }
    }
}
