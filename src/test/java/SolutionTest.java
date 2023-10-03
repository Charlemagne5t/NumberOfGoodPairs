import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void numIdenticalPairsTest1() {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int expected = 4;
        int actual = new Solution().numIdenticalPairs(nums);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numIdenticalPairsTest2() {
        int[] nums = {1, 1, 1, 1};
        int expected = 6;
        int actual = new Solution().numIdenticalPairs(nums);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numIdenticalPairsTest3() {
        int[] nums = {1, 2, 3};
        int expected = 0;
        int actual = new Solution().numIdenticalPairs(nums);

        Assert.assertEquals(expected, actual);
    }
}
