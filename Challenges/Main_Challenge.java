public class Main_Challenge{
    public static void main(String[] args) {
        
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        int finalScore = score;
         if (gameOver == true){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
         }
         
         calculateScore(true, 800, levelCompleted,bonus);
 
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;
         if (gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
         }
    }

    
}