public abstract class ExamFilter {


    protected ExamFilter nextExamFilter;

    public void setNextExam(ExamFilter nextExamFilter){
        this.nextExamFilter = nextExamFilter;
    }

    public abstract void filter(Student student);

}
