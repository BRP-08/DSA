import java.util.Set;
import java.util.HashSet;

public class Solution {
    private static final Set<Integer> powers = new HashSet<>();
    static {
        long val = 1;
        while (val <= Integer.MAX_VALUE) {
            powers.add((int) val);
            val *= 3;
        }
    }
    public boolean isPowerOfThree(int n) {
        return powers.contains(n);
    }
}
