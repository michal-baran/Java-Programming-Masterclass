package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 100, 5, 200);

        displayHighScorePosition("Michał", calculateHighScorePosition(highScore));
        displayHighScorePosition("Paweł", calculateHighScorePosition(900));
        displayHighScorePosition("Wojciech", calculateHighScorePosition(400));
        displayHighScorePosition("Krzysztof", calculateHighScorePosition(50));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        return -1;
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }
        int position =4;

        if (playerScore >= 1000) {
            position=1;
        } else if (playerScore >=500) {
            position=2;
        } else if (playerScore >=100); {
            position=3;
        }
        return position;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }
}