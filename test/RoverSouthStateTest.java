import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverSouthStateTest {

    @Test
    public void shouldReduceInOneYPosition() {
        Rover rover = new Rover(0, 2, "S");
        RoverSouthState roverSouthState = new RoverSouthState();
        int expectedY = 1;

        Position position = roverSouthState.move(rover.getPosition());

        Assert.assertEquals(position.getX(), rover.getX());
        Assert.assertEquals(position.getY(), expectedY);
    }

    @Test
    public void shouldReturnRightDirection() {
        RoverSouthState roverSouthState = new RoverSouthState();

        Direction actualDirection = roverSouthState.turnRight();

        assertEquals(actualDirection, Direction.WEST);
    }

    @Test
    public void shouldReturnLeftDirection() {
        RoverSouthState roverSouthState = new RoverSouthState();

        Direction actualDirection = roverSouthState.turnLeft();

        assertEquals(actualDirection, Direction.EAST);
    }

}