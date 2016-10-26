package question1;

import java.util.Date;

/**
 * Created by Ray on 2016/10/25.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 6
 */
public class Employee extends Person {
    private String office;
    private String money;
    private Date startDate;

    @Override
    public String toString(){
        return "Employee";
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
