/**
 * Created by Ray on 2016/11/15.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 7
 */
public class TestScoresWithException {
    public static void main(String[] args){
        double[] scores = {20, 70, 90, 88, 60, 88};
        TestScores testScores = new TestScores(scores);
        double average = testScores.getAverage();
        if(average != -1){
            System.out.println(average);
        }
    }
}
