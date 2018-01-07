import location.CardinalPoint;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DirectionPrototypeTest {

    @Test
    public void shouldReturnRoverNorthStateWhenReceiveNAsKey() {
        RoverDirectionStatePrototype roverDirectionStatePrototype = new RoverDirectionStatePrototype();

        Direction direction = roverDirectionStatePrototype.prototype(CardinalPoint.NORTH);

        assertTrue(direction instanceof North);
    }

    @Test
    public void shouldReturnRoverSouthStateWhenReceiveSAsKey() {
        RoverDirectionStatePrototype roverDirectionStatePrototype = new RoverDirectionStatePrototype();

        Direction direction = roverDirectionStatePrototype.prototype(CardinalPoint.SOUTH);

        assertTrue(direction instanceof South);
    }

    @Test
    public void shouldReturnRoverEastStateWhenReceiveEAsKey() {
        RoverDirectionStatePrototype roverDirectionStatePrototype = new RoverDirectionStatePrototype();

        Direction direction = roverDirectionStatePrototype.prototype(CardinalPoint.EAST);

        assertTrue(direction instanceof East);
    }

    @Test
    public void shouldReturnRoverWestStateWhenReceiveEAsKey() {
        RoverDirectionStatePrototype roverDirectionStatePrototype = new RoverDirectionStatePrototype();

        Direction direction = roverDirectionStatePrototype.prototype(CardinalPoint.WEST);

        assertTrue(direction instanceof West);
    }

}