import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverEastStateTest {

    @Test
    public void shouldIncreaseInOneXPosition() {
        Rover rover = new Rover(1, 0, 'E');
        RoverEastState roverEastState = new RoverEastState();
        int expectedX = 2;

        Position position = roverEastState.move(rover);

        assertEquals(position.getX(), expectedX);
        assertEquals(position.getY(), rover.getY());
    }

    @Test
    public void shouldReturnSouthDirection() {
        RoverEastState roverEastState = new RoverEastState();

        char actualDirection = roverEastState.turn("R");

        assertEquals(actualDirection, 'S');
    }

    @Test
    public void shouldReturnNorthDirection() {
        RoverEastState roverEastState = new RoverEastState();

        char actualDirection = roverEastState.turn("L");

        assertEquals(actualDirection, 'N');
    }
}