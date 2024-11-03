import org.junit.Test;

public class SolutionTest {
    @Test
    public void testCq() {
        Solution s = new Solution();
        assert s.rotateString("abcde", "cdeab") == true;
        assert s.rotateString("abcde", "abced") == false;
    }
}