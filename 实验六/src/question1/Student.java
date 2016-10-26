package question1;

/**
 * Created by Ray on 2016/10/25.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 6
 */
public class Student {
    final private String grade;

    @Override
    public String toString(){
        return "Student";
    }

    public Student(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
}
