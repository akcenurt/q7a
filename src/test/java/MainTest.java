import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testDivWithRemOk() {
        Main main = new Main();
        main.divisionWithRemainder(8, 5);
        assertEquals(3, main.divisionWithRemainder(8, 5));

    }

    @Test
    public void testDivWithRemFail(){
        Main main = new Main();
        main.divisionWithRemainder(8, 8);
        assertEquals(0, main.divisionWithRemainder(8, 8));

    }
}
