import static org.junit.Assert.*;
import org.junit.*;

public class DemoTester {
    @Test 
    public void test() {
        int[] test = Demo.toArray(1, 2, 3);
        assertEquals(1, test[0]);
        assertEquals(2, test[1]);
        assertEquals(3, test[2]);
    }
}
