import location.*;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LocationPrototypeTest {

    @Test
    public void shouldReturnRoverNorthStateWhenReceiveNorthAsCardinalPoint() {
        RoverDirectionStatePrototype roverDirectionStatePrototype = new RoverDirectionStatePrototype();

        Direction direction = roverDirectionStatePrototype.prototype(CardinalPoint.NORTH);

        assertTrue(direction instanceof North);
    }

    @Test
    public void shouldReturnRoverSouthStateWhenReceiveSouthAsCardinalPoint() {
        RoverDirectionStatePrototype roverDirectionStatePrototype = new RoverDirectionStatePrototype();

        Direction direction = roverDirectionStatePrototype.prototype(CardinalPoint.SOUTH);

        assertTrue(direction instanceof South);
    }

    @Test
    public void shouldReturnRoverEastStateWhenReceiveEastAsCardinalPoint() {
        RoverDirectionStatePrototype roverDirectionStatePrototype = new RoverDirectionStatePrototype();

        Direction direction = roverDirectionStatePrototype.prototype(CardinalPoint.EAST);

        assertTrue(direction instanceof East);
    }

    @Test
    public void shouldReturnRoverWestStateWhenReceiveWestAsCardinalPoint() {
        RoverDirectionStatePrototype roverDirectionStatePrototype = new RoverDirectionStatePrototype();

        Direction direction = roverDirectionStatePrototype.prototype(CardinalPoint.WEST);

        assertTrue(direction instanceof West);
    }
}