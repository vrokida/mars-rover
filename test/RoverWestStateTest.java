import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverWestStateTest {

    @Test
    public void shouldReturnWestDirection() {
        RoverWestState roverWestState = new RoverWestState();

        char actualDirection = roverWestState.turn("R");

        assertEquals(actualDirection, 'N');
    }

    @Test
    public void shouldReduceInOneXPosition() {
        Rover rover = new Rover(3, 0, 'W');
        RoverWestState roverWestState = new RoverWestState();
        int expectedX = 2;

        Position actualPosition = roverWestState.move(rover.getPosition());

        assertEquals(actualPosition.getX(), expectedX);
        assertEquals(actualPosition.getY(), rover.getY());
    }

    @Test
    public void shouldReturnSouthDirection() {
        RoverWestState roverWestState = new RoverWestState();

        char actualDirection = roverWestState.turn("L");

        assertEquals(actualDirection, 'S');
    }
}