import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverEastStateTest {

    @Test
    public void shouldIncreaseInOneXPosition() {
        Rover rover = new Rover(1, 0, "E");
        RoverEastState roverEastState = new RoverEastState();
        int expectedX = 2;

        Position position = roverEastState.move(rover.getPosition());

        assertEquals(position.getX(), expectedX);
        assertEquals(position.getY(), rover.getY());
    }

    @Test
    public void shouldReturnRightDirection() {
        RoverEastState roverEastState = new RoverEastState();

        Direction actualDirection = roverEastState.turnRight();

        assertEquals(actualDirection, Direction.SOUTH);
    }

    @Test
    public void shouldReturnLeftDirection() {
        RoverEastState roverEastState = new RoverEastState();

        Direction actualDirection = roverEastState.turnLeft();

        assertEquals(actualDirection, Direction.NORTH);
    }
}