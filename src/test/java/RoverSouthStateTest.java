import location.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RoverSouthStateTest {

    @Test
    public void shouldReduceInOneYPosition() {
        Rover rover = new Rover(0, 2, CardinalPoint.SOUTH);
        South roverSouthState = new South();
        int expectedY = 1;

        Position position = roverSouthState.move(rover.getPosition());

        Assert.assertEquals(position.getX(), rover.getX());
        Assert.assertEquals(position.getY(), expectedY);
    }


    @Test
    public void shouldReturnWestDirection() {
        South roverSouthState = new South();

        Direction actualDirection = roverSouthState.turn("R");

        assertTrue(actualDirection instanceof West);
    }

    @Test
    public void shouldReturnEastDirection() {
        South roverSouthState = new South();

        Direction actualDirection = roverSouthState.turn("L");

        assertTrue(actualDirection instanceof East);
    }
}