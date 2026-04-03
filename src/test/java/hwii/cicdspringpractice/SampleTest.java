package hwii.cicdspringpractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void successTest() {
        assertEquals(1, 1);
        System.out.println("@@successTest");

    }

    @Test
    void failTest() {
        assertEquals(1, 2); // 일부러 실패
        System.out.println("@@failTest");
    }

}