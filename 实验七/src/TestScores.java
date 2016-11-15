/**
 * Created by Ray on 2016/11/15.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 7
 */
public class TestScores {
    private double[] scores;

    public TestScores(double[] scores){
        this.scores = scores;
    }

    public double getAverage(){
        try {
            double sum = 0;
            for (double i : scores){
                if(i < 0){
                    throw new InvalidTestScore("Error: score is out of the range " + i);
                }
                else{
                    sum += i;
                }
            }
            return sum/scores.length;
        }catch (InvalidTestScore e){
            System.out.println(e.getMessage());
            //返回-1代表错误
            return -1;
        }

    }

}
