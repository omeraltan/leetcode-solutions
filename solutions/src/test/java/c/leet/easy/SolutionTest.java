package c.leet.easy;

import com.leet.easy.Solution;
import jdk.jfr.Description;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    @Description("Should give a sum of two elements and then it equals the target element.")
    public void test() {
        int target = 9;
        int[] nums = {2,7,11,15};

        int[] result = Solution.twoSum(nums, target);
        int de = 0;
        for(int s : result){
            de = de+nums[s];
        }
        Assert.assertEquals(9, de);
    }
}
