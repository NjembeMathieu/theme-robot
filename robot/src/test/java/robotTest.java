import org.junit.Test;

import static org.junit.Assert.*;

public class robotTest {


    robot robot1 = null;
    robot robot2 = null;
    robot robot3 =null;
    String success =null;

    @Test
    public void getName() {
        robot1 = new robot("robot1",10);
        assertEquals(" robot1", robot1.getName());
    }
    @Test
    public void setName() {
    }
    @Test
    public void getHp() {

        robot1 = new robot("robot1",10);
        assertEquals(10, robot1.getHp());
    }
    @Test
    public void setHp() {
    }
    @Test
    public void getState() {
    }
    @Test
    public void setState() {

        robot1 = new robot("robot1",10);
        assertEquals(" alive", robot1.getState());
    }

    @Test
    public void fire() {
        robot1 = new robot("robot1",10);
        robot2 = new robot("robot2",10);
        robot1.fire(robot2);
        robot1.fire(robot2);

        // teste le tire sur un robot
        assertEquals(6,robot2.getHp());

        robot3 = new robot("robot3", 0);
        robot1.fire(robot3);
        if(robot3.getState()=="dead"){
            success = "le robot " + robot3.getName() +"  est deja mort , le tir n'est pas effectué";
        }
        else{
            success = "test raté";
        }
        assertEquals("le robot " + robot3.getName() +"  est deja mort , le tir n'est pas effectué",success);
    }
    @Test
    public void isDead() {
    }
}