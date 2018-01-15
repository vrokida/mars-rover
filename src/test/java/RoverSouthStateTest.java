import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class RoverSouthStateTest {

    @Test
    public void shouldReduceInOneYPosition() {
        int x = (new Random()).nextInt();
        Rover rover = new Rover(x, 2, Direction.SOUTH.getDirection());
        RoverSouthState roverSouthState = new RoverSouthState(rover);
        int expectedY = 1;

        roverSouthState.move();

        Assert.assertEquals(rover.getX(), rover.getX());
        Assert.assertEquals(rover.getY(), expectedY);
    }

    @Test
    public void shouldReturnRightDirection() {
        Rover rover = getRoverWithSouthDirection();
        RoverSouthState roverSouthState = new RoverSouthState(rover);

        roverSouthState.turnRight();

        assertEquals(rover.getDirection(), Direction.WEST.getDirection());
    }

    @Test
    public void shouldReturnLeftDirection() {
        Rover rover = getRoverWithSouthDirection();
        RoverSouthState roverSouthState = new RoverSouthState(rover);

        roverSouthState.turnLeft();

        assertEquals(rover.getDirection(), Direction.EAST.getDirection());
    }

    private Rover getRoverWithSouthDirection() {
        Random random = new Random();
        return new Rover(random.nextInt(), random.nextInt(), Direction.SOUTH.getDirection());
    }

}