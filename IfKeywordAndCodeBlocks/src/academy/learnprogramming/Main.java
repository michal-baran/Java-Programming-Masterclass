package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000){
//            System.out.println("Twój wynik jest mniejszy niż 5000 i większy niż 1000");
//        } else if (score < 1000) {
//            System.out.println("Twój wynik jest mniejszy niż 1000");
//        } else {
//            System.out.println("Twój wynik jest większy bądź równy 5000 lub mniejszy bądź równy 1000");
//        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Twój końcowy wynik to " + finalScore);
            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            finalScore = score + (levelCompleted * bonus);
            System.out.println("Twój końcowy wynik to " + finalScore);
        }
        System.out.println("Score = " + score);
    }
}
