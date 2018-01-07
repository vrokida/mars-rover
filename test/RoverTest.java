import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class RoverTest {

    @Test
    public void shouldSetRightPosition() {
        int expectedX = getRandomInt();
        int expectedY = getRandomInt();

        Rover rover = new Rover(expectedX, expectedY, 'N');

        assertEquals(rover.getX(), expectedX);
        assertEquals(rover.getY(), expectedY);
        assertEquals(rover.getDirection(), 'N');
    }

    @Test
    public void shouldMoveOneStepNorth() {
        int expectedX = getRandomInt();
        int expectedY = 1;
        Rover rover = new Rover(expectedX, 0, 'N');

        rover.followInstructions("M");

        assertPositionRover(rover, expectedX, expectedY, 'N');
    }

    @Test
    public void shouldMoveOneStepSouth() {
        int expectedX = getRandomInt();
        int expectedY = -1;
        Rover rover = new Rover(expectedX, 0, 'S');

        rover.followInstructions("M");

        assertPositionRover(rover, expectedX, expectedY, 'S');
    }

    @Test
    public void shouldMoveOneStepWest() {
        int expectedY = getRandomInt();
        int expectedX = -1;
        Rover rover = new Rover(0, expectedY, 'W');

        rover.followInstructions("M");

        assertPositionRover(rover, expectedX, expectedY, 'W');
    }

    @Test
    public void shouldMoveOneStepEast() {
        int expectedY = getRandomInt();
        int expectedX = 0;
        Rover rover = new Rover(-1, expectedY, 'E');

        rover.followInstructions("M");

        assertPositionRover(rover, expectedX, expectedY, 'E');
    }


    @Test
    public void shouldTurnEast() {
        int expectedX = getRandomInt();
        int expectedY = getRandomInt();
        Rover rover = new Rover(expectedX, expectedY, 'N');

        rover.followInstructions("R");

        assertPositionRover(rover, expectedX, expectedY, 'E');
    }

    @Test
    public void shouldTurnSouth() {
        int expectedX = getRandomInt();
        int expectedY = getRandomInt();
        Rover rover = new Rover(expectedX, expectedY, 'E');

        rover.followInstructions("R");

        assertPositionRover(rover, expectedX, expectedY, 'S');
    }

    @Test
    public void shouldTurnWest() {
        int expectedX = getRandomInt();
        int expectedY = getRandomInt();
        Rover rover = new Rover(expectedX, expectedY, 'S');

        rover.followInstructions("R");

        assertPositionRover(rover, expectedX, expectedY, 'W');
    }

    @Test
    public void shouldTurnNorth() {
        int expectedX = getRandomInt();
        int expectedY = getRandomInt();
        Rover rover = new Rover(expectedX, expectedY, 'W');

        rover.followInstructions("R");

        assertPositionRover(rover, expectedX, expectedY, 'N');
    }

    private void assertPositionRover(Rover actualRover, int expectedX, int expectedY, char expectedDirection){
        assertEquals(actualRover.getX(), expectedX);
        assertEquals(actualRover.getY(), expectedY);
        assertEquals(actualRover.getDirection(), expectedDirection);
    }

    private int getRandomInt() {
        Random random = new Random();
        return random.nextInt();
    }
}