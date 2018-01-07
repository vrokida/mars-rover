import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverWestStateTest {

    @Test
    public void shouldReturnWestDirection() {
        RoverWestState roverWestState = new RoverWestState();

        char actualDirection = roverWestState.turn();

        assertEquals(actualDirection, 'N');
    }

    @Test
    public void shouldReduceInOneXPosition() {
        Rover rover = new Rover(3, 0, 'W');
        RoverWestState roverWestState = new RoverWestState();
        int expectedX = 2;

        Position actualPosition = roverWestState.move(rover);

        assertEquals(actualPosition.getX(), expectedX);
        assertEquals(actualPosition.getY(), rover.getY());
    }
}