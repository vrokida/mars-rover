import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class PositionTest {

    @Test
    public void shouldMoveForwardInX() {
        Random random = new Random();
        int x = 3;
        int expectedX = 4;
        int expectedY = random.nextInt();
        Position position = new Position(x, expectedY);

        position.moveForwardInX();

        assertEquals(position.getX(), expectedX);
        assertEquals(position.getY(), expectedY);
    }

    @Test
    public void shouldMoveBackInX() {
        Random random = new Random();
        int x = 3;
        int expectedX = 2;
        int expectedY = random.nextInt();
        Position position = new Position(x, expectedY);

        position.moveBackInX();

        assertEquals(position.getX(), expectedX);
        assertEquals(position.getY(), expectedY);
    }

    @Test
    public void shouldMoveForwardInY() {
        Random random = new Random();
        int y = 2;
        int expectedY = 3;
        int expectedX = random.nextInt();
        Position position = new Position(expectedX, y);

        position.moveForwardInY();

        assertEquals(position.getX(), expectedX);
        assertEquals(position.getY(), expectedY);
    }

    @Test
    public void shouldMoveBackInY() {
        Random random = new Random();
        int y = 3;
        int expectedY = 2;
        int expectedX = random.nextInt();
        Position position = new Position(expectedX, y);

        position.moveBackInY();

        assertEquals(position.getX(), expectedX);
        assertEquals(position.getY(), expectedY);
    }

}