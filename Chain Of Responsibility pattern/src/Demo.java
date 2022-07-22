import java.util.HashMap;
import java.util.Map;

public class Demo {


    public static void main(String[] args) {
        OlExamFilter olExamFilter=new OlExamFilter();
        ALexamFilter aLexamFilter=new ALexamFilter();
        AptitudeExamFilter aptitudeExamFilter=new AptitudeExamFilter();
        olExamFilter.setNextExam(aLexamFilter);
        aLexamFilter.setNextExam(aptitudeExamFilter);

            Student student1=loadStudent();
            olExamFilter.filter(student1);


    }

    private static Student loadStudent(){
        Map<String,Grade> olResults=new HashMap<>();
        olResults.put("English",Grade.C);
        olResults.put("Sinhala",Grade.S);
        olResults.put("Buddhism",Grade.B);
        olResults.put("Science",Grade.C);
        olResults.put("Maths",Grade.C);
        olResults.put("History",Grade.B);

        Map<String,Grade> alResults=new HashMap<>();
        alResults.put("ICT",Grade.S);
        alResults.put("Physics",Grade.C);
        alResults.put("Maths",Grade.B);

        Map<String,Grade> aptitudeExam=new HashMap<>();
        aptitudeExam.put("T1",Grade.B);

        Student student = new Student();
        student.setOlExam(olResults);
        student.setAlExam(alResults);
        student.setAptitudeExam(aptitudeExam);

        return student;

    }
}
