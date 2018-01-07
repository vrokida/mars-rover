import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverNorthStateTest {

    @Test
    public void shouldIncreaseInOneYPosition() {
        Rover rover = new Rover(0, 1, 'N');
        RoverNorthState roverNorthState = new RoverNorthState();
        int expectedY = 2;

        Position actualPosition = roverNorthState.move(rover);

        assertEquals(actualPosition.getX(), rover.getX());
        assertEquals(actualPosition.getY(), expectedY);
    }

    @Test
    public void shouldReturnEastDirection() {
        RoverNorthState roverNorthState = new RoverNorthState();

        char actualDirection = roverNorthState.turn();

        assertEquals(actualDirection, 'E');
    }
}