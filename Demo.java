import java.util.HashMap;
import java.util.Map;

public class Demo {

    public static void main(String args[]) {

        Map<String, Integer> student = new HashMap<>();
        student.put("sagar", 95);
        student.put("shristi", 60);
        student.put("paru", 95);

        System.out.println(student.get("shristi"));
        // System.out.println(student);

    }

}
