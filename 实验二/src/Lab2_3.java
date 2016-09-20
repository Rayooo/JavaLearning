import java.util.Random;
import java.util.Scanner;

/**
 * Created by Ray on 2016/9/20.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 2
 */
public class Lab2_3 {
    public static void main(String[] args){
        Random random = new Random();
        int randomNum = random.nextInt(100 + 1);
//        System.out.print(randomNum);
        System.out.println("Guess a magic number between 0 and 100");
        Scanner scanner = new Scanner(System.in);
        int guessNum = 0;
        do {
            System.out.print("Enter your guess:");
            guessNum = scanner.nextInt();
            if(guessNum < randomNum){
                System.out.println("Your guess is too low");
            }
            else if(guessNum > randomNum){
                System.out.println("Your guess is too high");
            }
            else if(guessNum == randomNum){
                System.out.println("Yes,the number is "+ randomNum);
            }
            else {
                System.out.println("Error input");
            }
        }while (guessNum != randomNum);

    }
}
