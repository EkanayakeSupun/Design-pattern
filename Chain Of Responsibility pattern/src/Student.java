import java.util.Map;

public class Student {
    private final Exam olExam=new Exam();
    private final Exam alExam=new Exam();
    private final Exam aptitudeExam=new Exam();

    public Exam getOlExam() {
        return olExam;
    }

    public Exam getAlExam() {
        return alExam;
    }

    public Exam getAptitudeExam() {
        return aptitudeExam;
    }
    public void setOlExam(Map<String,Grade> result){
        for(Map.Entry<String, Grade> set:result.entrySet()){
            this.olExam.addResult(set.getKey(),set.getValue());
        }
    }
    public void setAlExam(Map<String,Grade> result){
        for(Map.Entry<String, Grade> set:result.entrySet()){
            this.alExam.addResult(set.getKey(),set.getValue());
        }
    }
    public void setAptitudeExam(Map<String,Grade> result){
        for(Map.Entry<String, Grade> set:result.entrySet()){
            this.aptitudeExam.addResult(set.getKey(),set.getValue());
        }
    }
}
