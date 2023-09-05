import java.util.Set;
import java.util.TreeSet;

public class collections {
    public static void main(String[] args) {

        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(5);
        nums.add(6);
        nums.add(4);
        nums.add(3);

        // System.out.println(nums.get(2));

        for (int n : nums) {

            System.out.println(n);
        }
    }

}
