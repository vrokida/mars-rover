import location.CardinalPoint;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class RoverNorthStateTest {


    @Test
    public void shouldIncreaseInOneYPosition() {
        Rover rover = new Rover(0, 1, CardinalPoint.NORTH);
        North roverNorthState = new North();
        int expectedY = 2;

        Position actualPosition = roverNorthState.move(rover.getPosition());

        assertEquals(actualPosition.getX(), rover.getX());
        assertEquals(actualPosition.getY(), expectedY);
    }

    @Test
    public void shouldReturnEastDirection() {
        North roverNorthState = new North();

        Direction actualDirection = roverNorthState.turn("R");

        assertTrue(actualDirection instanceof East);
    }

    @Test
    public void shouldReturnWestDirection() {
        North roverNorthState = new North();

        Direction actualDirection = roverNorthState.turn("L");

        assertTrue(actualDirection instanceof  West);
    }

}