import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverSouthStateTest {

    @Test
    public void shouldReduceInOneYPosition() {
        Rover rover = new Rover(0, 2, 'S');
        RoverSouthState roverSouthState = new RoverSouthState();
        int expectedY = 1;

        Position position = roverSouthState.move(rover);

        Assert.assertEquals(position.getX(), rover.getX());
        Assert.assertEquals(position.getY(), expectedY);
    }

    @Test
    public void shouldReturnWestDirection() {
        RoverSouthState roverSouthState = new RoverSouthState();

        char actualDirection = roverSouthState.turn("R");

        assertEquals(actualDirection, 'W');
    }

    @Test
    public void shouldReturnEastDirection() {
        RoverSouthState roverSouthState = new RoverSouthState();

        char actualDirection = roverSouthState.turn("L");

        assertEquals(actualDirection, 'E');
    }

}