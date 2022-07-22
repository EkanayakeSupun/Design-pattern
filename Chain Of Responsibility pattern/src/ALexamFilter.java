import java.util.HashMap;
import java.util.Map;

public class ALexamFilter extends ExamFilter {


    @Override
    public void filter(Student student) {
        Exam exam=student.getAlExam();
        if(exam.getResults().size()>=3){
            if(checkHave3Passes(exam)){
                System.out.println("You have passed the A/L exam & 2nd verification is done. Wait for the next.");
                nextExamFilter.filter(student);
            }else{
                System.out.println("You are not eligible to enroll. You have no 3 passes.");
            }
        }else{
            System.out.println("You are not eligible to enroll. You have no participated for all subjects of the A/L exam.");
        }
    }

    private boolean checkHave3Passes(Exam exam) {
        Map<String, Grade> results = exam.getResults();
        int passCount=results.size();
        for(Map.Entry<String,Grade> filter:results.entrySet()){
            switch (filter.getValue()){
                case F: passCount--; break;
            }
        }
        return passCount==3;
    }
}
