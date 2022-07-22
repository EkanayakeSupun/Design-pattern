import java.util.Map;

public class OlExamFilter extends ExamFilter {
    @Override
    public void filter(Student student) {
        Exam exam = student.getOlExam();
        if (exam.getResults().size() >= 6) {
            if (checkMinimumPasses(exam)) {
                if (checkEnoughCreditPasses(exam)) {
                    switch (exam.getResults().get("English")) {
                        case F:
                        case S:System.out.println("You are not eligible to enroll. You have no credit pass to English");
                            break;
                        case A:
                        case B:
                        case C:
                            System.out.println("You have passed the O/L exam & 1st verification is done. Wait for the next.");
                            nextExamFilter.filter(student);
                            break;

                            }
                } else {
                    System.out.println("You are not eligible to enroll. You have no 4 credit passes");
                }
            } else {
                System.out.println("You are not eligible. You have no at least 6 passes to the O/L Exam.");
            }
        } else {
            System.out.println("You are not eligible. You have not participated at least 6 subjects to the O/L Exam.");

        }
    }

    private boolean checkMinimumPasses(Exam exam) {
        Map<String, Grade> results = exam.getResults();
        int count=results.size();
        for(Map.Entry<String,Grade> set:results.entrySet()){
            switch (set.getValue()){
                case F: count--;
            }
        }
        return count>=6;
    }

    public boolean checkEnoughCreditPasses(Exam exam){
        int creditPassCount=0;
        Map<String, Grade> results = exam.getResults();
        for (Map.Entry<String, Grade> filter: results.entrySet()){
            switch (filter.getValue()){
                case S:
                case F: break;
                case A:
                case B:
                case C:
                    creditPassCount++; break;

            }

        }
    return creditPassCount>=4;
    }
}

