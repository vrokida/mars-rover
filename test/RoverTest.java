import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class RoverTest {

    private static final char N = 'N';
    private static final char S = 'S';
    private static final char W = 'W';
    private static final char E = 'E';

    @Test
    public void shouldSetRightPosition() {
        int expectedX = getRandomInt();
        int expectedY = getRandomInt();

        Rover rover = new Rover(expectedX, expectedY, N);

        assertEquals(rover.getX(), expectedX);
        assertEquals(rover.getY(), expectedY);
        assertEquals(rover.getDirection(), N);
    }

    @Test
    public void shouldMoveOneStepNorth() {
        int expectedX = getRandomInt();
        int expectedY = 1;
        Rover rover = new Rover(expectedX, 0, N);

        rover.followInstructions("M");

        assertRover(rover, expectedX, expectedY, N);
    }

    @Test
    public void shouldMoveOneStepSouth() {
        int expectedX = getRandomInt();
        int expectedY = -1;
        Rover rover = new Rover(expectedX, 0, S);

        rover.followInstructions("M");

        assertRover(rover, expectedX, expectedY, S);
    }

    @Test
    public void shouldMoveOneStepWest() {
        int expectedY = getRandomInt();
        int expectedX = -1;
        Rover rover = new Rover(0, expectedY, W);

        rover.followInstructions("M");

        assertRover(rover, expectedX, expectedY, W);
    }

    @Test
    public void shouldMoveOneStepEast() {
        int expectedY = getRandomInt();
        int expectedX = 0;
        Rover rover = new Rover(-1, expectedY, E);

        rover.followInstructions("M");

        assertRover(rover, expectedX, expectedY, 'E');
    }


    @Test
    public void shouldTurnEastWhenActualDirectionIsNorthAndInstructionIsR() {
        int expectedX = getRandomInt();
        int expectedY = getRandomInt();
        Rover rover = new Rover(expectedX, expectedY, N);

        rover.followInstructions("R");

        assertRover(rover, expectedX, expectedY, E);
    }

    @Test
    public void shouldTurnSouthWhenActualDirectionIsEastAndInstructionIsR() {
        int expectedX = getRandomInt();
        int expectedY = getRandomInt();
        Rover rover = new Rover(expectedX, expectedY, E);

        rover.followInstructions("R");

        assertRover(rover, expectedX, expectedY, S);
    }

    @Test
    public void shouldTurnWestWhenActualDirectionIsSouthAndInstructionIsR() {
        int expectedX = getRandomInt();
        int expectedY = getRandomInt();
        Rover rover = new Rover(expectedX, expectedY, S);

        rover.followInstructions("R");

        assertRover(rover, expectedX, expectedY, W);
    }

    @Test
    public void shouldTurnNorthWhenActualDirectionIsWestAndInstructionIsR() {
        int expectedX = getRandomInt();
        int expectedY = getRandomInt();
        Rover rover = new Rover(expectedX, expectedY, W);

        rover.followInstructions("R");

        assertRover(rover, expectedX, expectedY, N);
    }

    @Test
    public void shouldTurnWestWhenActualDirectionIsNorthAndInstructionIsL() {
        int expectedX = getRandomInt();
        int expectedY = getRandomInt();
        Rover rover = new Rover(expectedX, expectedY, N);

        rover.followInstructions("L");

        assertRover(rover, expectedX, expectedY, W);
    }

    @Test
    public void shouldTurnSouthWhenActualDirectionIsWestAndInstructionIsL() {
        int expectedX = getRandomInt();
        int expectedY = getRandomInt();
        Rover rover = new Rover(expectedX, expectedY, W);

        rover.followInstructions("L");

        assertRover(rover, expectedX, expectedY, S);
    }

    @Test
    public void shouldTurnEastWhenActualDirectionIsSouthAndInstructionIsL() {
        int expectedX = getRandomInt();
        int expectedY = getRandomInt();
        Rover rover = new Rover(expectedX, expectedY, S);

        rover.followInstructions("L");

        assertRover(rover, expectedX, expectedY, E);
    }

    @Test
    public void shouldTurnNorthWhenActualDirectionIsEastAndInstructionIsL() {
        int expectedX = getRandomInt();
        int expectedY = getRandomInt();
        Rover rover = new Rover(expectedX, expectedY, E);

        rover.followInstructions("L");

        assertRover(rover, expectedX, expectedY, N);
    }

    private void assertRover(Rover actualRover, int expectedX, int expectedY, char expectedDirection){
        assertEquals(actualRover.getX(), expectedX);
        assertEquals(actualRover.getY(), expectedY);
        assertEquals(actualRover.getDirection(), expectedDirection);
    }

    private int getRandomInt() {
        Random random = new Random();
        return random.nextInt();
    }
}