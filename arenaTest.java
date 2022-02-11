import org.junit.Test;

import static org.junit.Assert.*;

public class arenaTest {

    @Test
    public void fight() {
        robot robot1 = new robot("robot1",10);
        robot robot2 = new robot("robot2",10);
        assertEquals("D2R2",robot1.getName());//Comme le robot 1 attaque en premier , il est sensé etre vainquer
    }

    @Test
    public void getWinner() {
    }

    @Test
    public void setWinner() {
    }
}