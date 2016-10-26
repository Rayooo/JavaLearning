package question3;

/**
 * Created by Ray on 2016/10/25.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 6
 */
public class CourseGradesApp {
    public static void main(String[] args){
        GradedActivity gradedActivity = new GradedActivity();
        gradedActivity.setScore(80);
        PassFailExam passFailExam = new PassFailExam(10,3,70);
        FinalExam finalExam = new FinalExam(50,2);

        CourseGrades courseGrades = new CourseGrades();
        courseGrades.setLab(gradedActivity);
        courseGrades.setPassFailExam(passFailExam);
        courseGrades.setFinalExam(finalExam);
        System.out.println(courseGrades.toString());

    }

}
