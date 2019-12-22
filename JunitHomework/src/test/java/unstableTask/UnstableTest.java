package unstableTask;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;

public class UnstableTest {
    @Rule
    public TestRule runAnyTimes = new RunAnyTimes();
    private static int attempt = 2;

    @Test
    @Unstable(3)
    public void randomlyFailingTest() {
        if (attempt == 2) {
            attempt = 1;

        } else {
            Assert.fail("Failed on " + (attempt++) + " attempt");
        }
    }

}
