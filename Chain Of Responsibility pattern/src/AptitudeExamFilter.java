public class AptitudeExamFilter extends ExamFilter {



    @Override
    public void filter(Student student) {
        Exam exam=student.getAptitudeExam();
        if(exam.getResults().size()>=1){
            if(exam.getResults().get("T1")==Grade.A || exam.getResults().get("T1")==Grade.B || exam.getResults().get("T1")==Grade.C){
                System.out.println("You have '"+exam.getResults().get("T1")+"' pass for the aptitude test & you are eligible to enroll.");

            }else{
                System.out.println("You have no credit pass to the aptitude test. You are not eligible to enroll.");
            }
        }else{
            System.out.println("You didn't participate to the aptitude test. You are not eligible to enroll.");
        }
    }
}
