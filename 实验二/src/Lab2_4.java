import java.util.Random;
import java.util.Scanner;

/**
 * Created by Ray on 2016/9/20.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 2
 */
public class Lab2_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        long start = System.currentTimeMillis();
        for(int i = 0; i < 5; ++i){
            Random random = new Random();
            int randomA = 10 + random.nextInt((99 - 10)+1);
            int randomB = 10 + random.nextInt((99 - 10)+1);
            System.out.print(randomA + " + " + randomB + " = ");
            if(randomA + randomB == scanner.nextInt()){
                count++;
            }
        }
        long end = System.currentTimeMillis();
        double spendTime = (end - start)/1000.0;
        System.out.println("您答对了" + count + "题,用时" + spendTime + "秒");
    }
}
