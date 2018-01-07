import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverWestStateTest {

    @Test
    public void shouldReturnRightDirection() {
        RoverWestState roverWestState = new RoverWestState();

        Direction actualDirection = roverWestState.turnRight();

        assertEquals(actualDirection, Direction.NORTH);
    }

    @Test
    public void shouldReduceInOneXPosition() {
        Rover rover = new Rover(3, 0, "W");
        RoverWestState roverWestState = new RoverWestState();
        int expectedX = 2;

        Position actualPosition = roverWestState.move(rover.getPosition());

        assertEquals(actualPosition.getX(), expectedX);
        assertEquals(actualPosition.getY(), rover.getY());
    }

    @Test
    public void shouldReturnLeftDirection() {
        RoverWestState roverWestState = new RoverWestState();

        Direction actualDirection = roverWestState.turnLeft();

        assertEquals(actualDirection, Direction.SOUTH);
    }
}