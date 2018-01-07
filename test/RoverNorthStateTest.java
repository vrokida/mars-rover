import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverNorthStateTest {

    @Test
    public void shouldIncreaseInOneYPosition() {
        Rover rover = new Rover(0, 1, "N");
        RoverNorthState roverNorthState = new RoverNorthState();
        int expectedY = 2;

        Position actualPosition = roverNorthState.move(rover.getPosition());

        assertEquals(actualPosition.getX(), rover.getX());
        assertEquals(actualPosition.getY(), expectedY);
    }

    @Test
    public void shouldReturnRightDirection() {
        RoverNorthState roverNorthState = new RoverNorthState();

        Direction actualDirection = roverNorthState.turnRight();

        assertEquals(actualDirection, Direction.EAST);
    }

    @Test
    public void shouldReturnWestDirection() {
        RoverNorthState roverNorthState = new RoverNorthState();

        Direction actualDirection = roverNorthState.turnLeft();

        assertEquals(actualDirection, Direction.WEST);
    }
}