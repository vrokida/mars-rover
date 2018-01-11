import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class RoverEastStateTest {

    @Test
    public void shouldIncreaseInOneXPosition() {
        int y = (new Random()).nextInt();
        Rover rover = new Rover(1, y, Direction.EAST.getDirection());
        RoverEastState roverEastState = new RoverEastState(rover);
        int expectedX = 2;

        roverEastState.move();

        assertEquals(rover.getX(), expectedX);
        assertEquals(rover.getY(), rover.getY());
    }

    @Test
    public void shouldReturnRightDirection() {
        Rover rover = getRoverWithEastDirection();
        RoverEastState roverEastState = new RoverEastState(rover);

        roverEastState.turnRight();

        assertEquals(rover.getDirection(), Direction.SOUTH.getDirection());
    }

    @Test
    public void shouldReturnLeftDirection() {
        Rover rover = getRoverWithEastDirection();
        RoverEastState roverEastState = new RoverEastState(rover);

        roverEastState.turnLeft();

        assertEquals(rover.getDirection(), Direction.NORTH.getDirection());
    }

    private Rover getRoverWithEastDirection() {
        Random random = new Random();
        return new Rover(random.nextInt(), random.nextInt(), Direction.EAST.getDirection());
    }
}