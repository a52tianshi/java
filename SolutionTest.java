import org.junit.Test;

public class SolutionTest {
    @Test
    public void testCq() {
        Solution s = new Solution();
        boolean a = s.isCircularSentence("Leetcode is cool");
        boolean b = s.isCircularSentence("leetcode exercises sound delightful");
        System.out.println(a);
        System.out.println(b);
        boolean c = s.isCircularSentence("leetcode eool");
        System.out.println(c);
        boolean d = s.isCircularSentence("Leetcode eool");
        System.out.println(d);
    }
}