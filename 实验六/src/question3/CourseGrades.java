package question3;

/**
 * Created by Ray on 2016/10/25.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 6
 */
public class CourseGrades {
    protected GradedActivity[] grades;

    public CourseGrades(){
        grades = new GradedActivity[3];
    }

    public void setLab(GradedActivity gradedActivity){
        grades[0] = gradedActivity;
    }

    public void setPassFailExam(PassFailExam passFailExam){
        grades[1] = passFailExam;
    }

    public void setFinalExam(FinalExam finalExam){
        grades[2] = finalExam;
    }

    public String toString(){
        String message = "The scores and grades of the exams are:\n";
        message += grades[0].getScore() + "\t" + grades[0].getGrade() + "\n";
        message += grades[1].getScore() + "\t" + grades[1].getGrade() + "\n";
        message += grades[2].getScore() + "\t" + grades[2].getGrade() + "\n";


        return message;
    }

}
