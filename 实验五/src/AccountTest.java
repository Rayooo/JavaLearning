/**
 * Created by Ray on 2016/10/18.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 5
 */
public class AccountTest {

    public static void main(String[] args) {
        Account account = new Account(1122,20000);
        account.setAnnualInterestRate(0.045);

        account.withDraw(2500);
        account.deposit(3000);

        System.out.println("余额：" + account.getBalance());
        System.out.println("月利息：" + account.getMonthlyInterestRate());
        System.out.println("开户日期：" + account.getDateCreated().toString());
    }
}
