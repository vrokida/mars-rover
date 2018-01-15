import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class RoverNorthStateTest {

    @Test
    public void shouldIncreaseInOneYPosition() {
        int x = (new Random()).nextInt();
        Rover rover = new Rover(x, 1, Direction.NORTH.getDirection());
        RoverNorthState roverNorthState = new RoverNorthState(rover);
        int expectedY = 2;

        roverNorthState.move();

        assertEquals(rover.getX(), rover.getX());
        assertEquals(rover.getY(), expectedY);
    }

    @Test
    public void shouldReturnRightDirection() {
        Rover rover = getRoverWithNortDirection();
        RoverNorthState roverNorthState = new RoverNorthState(rover);

        roverNorthState.turnRight();

        assertEquals(rover.getDirection(), Direction.EAST.getDirection());
    }

    @Test
    public void shouldReturnWestDirection() {
        Rover rover = getRoverWithNortDirection();
        RoverNorthState roverNorthState = new RoverNorthState(rover);

        roverNorthState.turnLeft();

        assertEquals(rover.getDirection(), Direction.WEST.getDirection());
    }

    private Rover getRoverWithNortDirection() {
        Random random = new Random();
        return new Rover(random.nextInt(), random.nextInt(), Direction.NORTH.getDirection());
    }
}