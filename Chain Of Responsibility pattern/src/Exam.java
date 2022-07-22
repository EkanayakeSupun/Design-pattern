import java.util.HashMap;
import java.util.Map;

public class Exam {
    private final Map<String,Grade> results=new HashMap<>();

    public Map<String, Grade> getResults() {
        return results;
    }
    public void addResult(String subject,Grade grade){
        this.results.put(subject,grade);
    }

    public Grade getSpecificResult(String subject){
        return this.results.get(subject);
    }
}
