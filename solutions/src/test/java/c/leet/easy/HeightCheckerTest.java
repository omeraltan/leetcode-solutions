package c.leet.easy;

import com.leet.easy.HeightChecker;
import jdk.jfr.Description;
import org.junit.Assert;
import org.junit.Test;

public class HeightCheckerTest {

    @Test
    @Description("Must give the number of students whose height rankings were made and whose places were subsequently changed.")
    public void test() {
        int[] heights = new int[]{5, 1, 2, 3, 4};
        int value = new HeightChecker().heightChecker(heights);

        Assert.assertEquals(5, value);
    }
}
