import java.util.Random;

public class HeikinCKadai {
    public static void main(String[] args){
        int studentNum = 100;
        int scoreLimit = 100;
        int passScore = 80;
        int scoreSum = 0;

        int[] scoreArray = scoreArray = new int[studentNum];
        Random randNum = new Random();

        for(int i = 0; i < scoreArray.length; i++){
            scoreArray[i] = randNum.nextInt(scoreLimit);
            scoreSum += scoreArray[i];
        }

        System.out.println("平均点は" + scoreSum / studentNum + "点");
        System.out.println("以下は合格者の点数です。");

        for(int i = 0; i < scoreArray.length; i++){
            if(scoreArray[i] >= passScore){
                System.out.println(scoreArray[i]);
            }
        }
    }
}
