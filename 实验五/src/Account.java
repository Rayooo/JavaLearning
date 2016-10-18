import java.util.Date;

/**
 * Created by Ray on 2016/10/18.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 5
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    //返回月利率
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }

    //从账户提取特定数额
    public boolean withDraw(double money){
        if(balance >= money){
            balance -= money;
            return true;
        }
        else {
            return false;
        }
    }
    //向账户存储特定数额
    public void deposit(double money){
        balance += money;
    }
}
