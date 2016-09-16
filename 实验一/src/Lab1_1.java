import java.util.Scanner;

/**
 * Created by Ray on 16/9/16.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 1
 */
public class Lab1_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight:");
        double weight = scanner.nextDouble();

        System.out.print("Enter height:");
        double height = scanner.nextDouble();

        double BMI = weight / height /height;
        System.out.print("BMI is:" + BMI);

    }
}
