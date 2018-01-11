import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class RoverWestStateTest {

    @Test
    public void shouldReturnRightDirection() {
        Rover rover = getRoverWithWestDirection();
        RoverWestState roverWestState = new RoverWestState(rover);

        roverWestState.turnRight();

        assertEquals(rover.getDirection(), Direction.NORTH.getDirection());
    }

    @Test
    public void shouldReduceInOneXPosition() {
        int y = (new Random()).nextInt();
        Rover rover = new Rover(3, y, Direction.WEST.getDirection());
        RoverWestState roverWestState = new RoverWestState(rover);
        int expectedX = 2;

        roverWestState.move();

        assertEquals(rover.getX(), expectedX);
        assertEquals(rover.getY(), rover.getY());
    }

    @Test
    public void shouldReturnLeftDirection() {
        Rover rover = getRoverWithWestDirection();
        RoverWestState roverWestState = new RoverWestState(rover);

        roverWestState.turnLeft();

        assertEquals(rover.getDirection(), Direction.SOUTH.getDirection());
    }

    private Rover getRoverWithWestDirection() {
        Random random = new Random();
        return new Rover(random.nextInt(), random.nextInt(), Direction.WEST.getDirection());
    }
}