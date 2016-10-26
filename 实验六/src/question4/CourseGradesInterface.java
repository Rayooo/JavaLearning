package question4;

import question3.CourseGrades;
import question3.GradedActivity;

/**
 * Created by Ray on 2016/10/25.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 6
 */
public class CourseGradesInterface extends CourseGrades implements Analyzable {

    @Override
    public double getAverage() {
        double a = grades[0].getScore();
        double b = grades[1].getScore();
        double c = grades[2].getScore();
        return (a+b+c)/3.0;
    }

    @Override
    public GradedActivity getHighest() {
        GradedActivity g = grades[0];
        if(grades[1].getScore() > g.getScore()){
            g = grades[1];
        }
        if(grades[2].getScore() > g.getScore()){
            g = grades[2];
        }
        return g;
    }

    @Override
    public GradedActivity getLowest() {
        GradedActivity g = grades[0];
        if(grades[1].getScore() < g.getScore()){
            g = grades[1];
        }
        if(grades[2].getScore() < g.getScore()){
            g = grades[2];
        }
        return g;
    }
}
