import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RoverEastStateTest {

//    @Test
//    public void shouldIncreaseInOneXPosition() {
//        Rover rover = new Rover(1, 0, new East());
//        East roverEastState = new East();
//        int expectedX = 2;
//
//        Position position = roverEastState.move(rover);
//
//        assertEquals(position.getX(), expectedX);
//        assertEquals(position.getY(), rover.getY());
//    }

    @Test
    public void shouldReturnSouthDirection() {
        East roverEastState = new East();

        Direction newDirection = roverEastState.turn("R");

        assertTrue(newDirection instanceof South);
    }

    @Test
    public void shouldReturnNorthDirection() {
        East roverEastState = new East();

        Direction actualDirection = roverEastState.turn("L");

        assertTrue(actualDirection instanceof North);
    }
}