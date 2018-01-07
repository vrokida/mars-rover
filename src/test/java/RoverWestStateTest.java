import location.CardinalPoint;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RoverWestStateTest {

    @Test
    public void shouldReduceInOneXPosition() {
        Rover rover = new Rover(3, 0, CardinalPoint.WEST);
        West roverWestState = new West();
        int expectedX = 2;

        Position actualPosition = roverWestState.move(rover.getPosition());

        assertEquals(actualPosition.getX(), expectedX);
        assertEquals(actualPosition.getY(), rover.getY());
    }

    @Test
    public void shouldReturnWestDirection() {
        West roverWestState = new West();

        Direction newDirection = roverWestState.turn("R");

        assertTrue(newDirection instanceof North);
    }

    @Test
    public void shouldReturnSouthDirection() {
        West roverWestState = new West();

        Direction newDirection = roverWestState.turn("L");

        assertTrue(newDirection instanceof  South);
    }



}