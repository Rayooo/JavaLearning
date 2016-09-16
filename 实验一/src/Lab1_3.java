import java.util.Scanner;

/**
 * Created by Ray on 16/9/16.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 1
 */
public class Lab1_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter investment amount:");
        double investmentAmount = scanner.nextDouble();
        System.out.print("Enter yearinterest rate:");
        double yearInterestRate = scanner.nextDouble();
        System.out.print("Enter number of years:");
        int numberOfYears = scanner.nextInt();

        if(investmentAmount < 0 || yearInterestRate < 0 || numberOfYears < 0){
            System.out.print("输入的所有值均不能小于0");
            return;
        }

        double monthlyInterestRate = yearInterestRate / 100 / 12;
        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate,numberOfYears * 12);
        futureInvestmentValue = (Math.round(futureInvestmentValue * 100)/100.0) ;

        System.out.print("Accumulated value is " + futureInvestmentValue);
    }

}
