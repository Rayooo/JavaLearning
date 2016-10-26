package question4;

import question3.CourseGrades;
import question3.FinalExam;
import question3.GradedActivity;
import question3.PassFailExam;

/**
 * Created by Ray on 2016/10/25.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 6
 */
public class CourseGradesInterfaceApp {
    public static void main(String[] args){
        GradedActivity gradedActivity = new GradedActivity();
        gradedActivity.setScore(80);
        PassFailExam passFailExam = new PassFailExam(10,3,70);
        FinalExam finalExam = new FinalExam(50,2);

        CourseGradesInterface courseGradesInterface = new CourseGradesInterface();
        courseGradesInterface.setLab(gradedActivity);
        courseGradesInterface.setPassFailExam(passFailExam);
        courseGradesInterface.setFinalExam(finalExam);
        System.out.println(courseGradesInterface.toString());

        System.out.println("The average score is: " + courseGradesInterface.getAverage());
        System.out.println("The highest score is: " + courseGradesInterface.getHighest().getScore());
        System.out.println("The lowest score is: " + courseGradesInterface.getLowest().getScore());

    }
}
