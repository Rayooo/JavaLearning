import java.util.Random;
import java.util.Scanner;

/**
 * Created by Ray on 2016/9/20.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 2
 */
public class Lab2_2 {
    public static void main(String[] args){
        Random random = new Random();
        int randomNum = 10 + random.nextInt((99 - 10)+1);
//        System.out.print(randomNum);
        System.out.print("Enter your lottery pick(two digits):");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num >= 10 && num <= 99){
            int money = 0;
            String words = "Sorry:";
            if(num == randomNum){
                money = 10000;
                words = "Match the order:";
            }
            else if(num == (randomNum/10)+(randomNum%10*10)){
                money = 3000;
                words = "Match two digit:";
            }
            else if(num/10 == randomNum/10 || num/10 == randomNum%10 || num%10 == randomNum/10 || num%10 == randomNum%10){
                money = 1000;
                words = "Match one digit:";
            }
            System.out.println("The lottery number is "+randomNum);
            System.out.println(words + "you win $" + money);
        }
        else{
            System.out.println("error input");
        }

    }
}
