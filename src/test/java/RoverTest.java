import location.*;
import org.junit.Test;

import java.util.Random;

import static location.CardinalPoint.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RoverTest {

    @Test
    public void shouldSetRightPosition() {
        int expectedX = getRandomInt();
        int expectedY = getRandomInt();

        Rover rover = new Rover(expectedX, expectedY, NORTH);

        assertEquals(rover.getX(), expectedX);
        assertEquals(rover.getY(), expectedY);
        assertEquals(rover.getLocation() , new North());
    }

    @Test
    public void shouldMoveOneStepNorth() {
        int expectedX = getRandomInt();
        int expectedY = 1;
        Rover rover = new Rover(expectedX, 0, NORTH);

        rover.followInstructions("M");

        assertRover(rover, expectedX, expectedY, new North());
    }

    @Test
    public void shouldMoveOneStepSouth() {
        int expectedX = getRandomInt();
        int expectedY = -1;
        Rover rover = new Rover(expectedX, 0, SOUTH);

        rover.followInstructions("M");

        assertRover(rover, expectedX, expectedY, new South());
    }

    @Test
    public void shouldMoveOneStepWest() {
        int expectedY = getRandomInt();
        int expectedX = -1;
        Rover rover = new Rover(0, expectedY, WEST);

        rover.followInstructions("M");

        assertRover(rover, expectedX, expectedY, new West());
    }

    @Test
    public void shouldMoveOneStepEast() {
        int expectedY = getRandomInt();
        int expectedX = 0;
        Rover rover = new Rover(-1, expectedY, EAST);

        rover.followInstructions("M");

        assertRover(rover, expectedX, expectedY, new East());
    }


    @Test
    public void shouldTurnEastWhenActualDirectionIsNorthAndInstructionIsR() {
        int expectedX = getRandomInt();
        int expectedY = getRandomInt();
        Rover rover = new Rover(expectedX, expectedY, NORTH);

        rover.followInstructions("R");

        assertRover(rover, expectedX, expectedY, new East());
    }

    @Test
    public void shouldTurnSouthWhenActualDirectionIsEastAndInstructionIsR() {
        int expectedX = getRandomInt();
        int expectedY = getRandomInt();
        Rover rover = new Rover(expectedX, expectedY, EAST);

        rover.followInstructions("R");

        assertRover(rover, expectedX, expectedY, new South());
    }

    @Test
    public void shouldTurnWestWhenActualDirectionIsSouthAndInstructionIsR() {
        int expectedX = getRandomInt();
        int expectedY = getRandomInt();
        Rover rover = new Rover(expectedX, expectedY, SOUTH);

        rover.followInstructions("R");

        assertRover(rover, expectedX, expectedY, new West());
    }

    @Test
    public void shouldTurnNorthWhenActualDirectionIsWestAndInstructionIsR() {
        int expectedX = getRandomInt();
        int expectedY = getRandomInt();
        Rover rover = new Rover(expectedX, expectedY, WEST);

        rover.followInstructions("R");

        assertRover(rover, expectedX, expectedY, new North());
    }

    @Test
    public void shouldTurnWestWhenActualDirectionIsNorthAndInstructionIsL() {
        int expectedX = getRandomInt();
        int expectedY = getRandomInt();
        Rover rover = new Rover(expectedX, expectedY, NORTH);

        rover.followInstructions("L");

        assertRover(rover, expectedX, expectedY, new West());
    }

    @Test
    public void shouldTurnSouthWhenActualDirectionIsWestAndInstructionIsL() {
        int expectedX = getRandomInt();
        int expectedY = getRandomInt();
        Rover rover = new Rover(expectedX, expectedY, WEST);

        rover.followInstructions("L");

        assertRover(rover, expectedX, expectedY, new South());
    }

    @Test
    public void shouldTurnEastWhenActualDirectionIsSouthAndInstructionIsL() {
        int expectedX = getRandomInt();
        int expectedY = getRandomInt();
        Rover rover = new Rover(expectedX, expectedY, SOUTH);

        rover.followInstructions("L");

        assertRover(rover, expectedX, expectedY, new East());
    }

    @Test
    public void shouldTurnNorthWhenActualDirectionIsEastAndInstructionIsL() {
        int expectedX = getRandomInt();
        int expectedY = getRandomInt();
        Rover rover = new Rover(expectedX, expectedY, EAST);

        rover.followInstructions("L");

        assertRover(rover, expectedX, expectedY, new North());
    }

    @Test
    public void shouldMoveOneStepAndTurnLeft() {
        int expectedY = 6;
        int expectedX = getRandomInt();
        Rover rover = new Rover(expectedX, 5, NORTH);

        rover.followInstructions("ML");

        assertRover(rover, expectedX, expectedY, new West());

    }

    private void assertRover(Rover actualRover, int expectedX, int expectedY, Direction expectedDirection){
        assertEquals(actualRover.getX(), expectedX);
        assertEquals(actualRover.getY(), expectedY);
        assertEquals(expectedDirection, actualRover.getLocation());
    }

    private int getRandomInt() {
        Random random = new Random();
        return random.nextInt();
    }
}