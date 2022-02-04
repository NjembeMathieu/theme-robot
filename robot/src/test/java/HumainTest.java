import org.junit.Test;

import static org.junit.Assert.*;

public class HumainTest {

    @Test
    public void fire() {
        Humain mathieu = new Humain("mathieu",10);
        robot robot1 = new robot("robot1",10);
        mathieu.fire(robot1);
        assertEquals(8,robot1.getHp());
    }
}