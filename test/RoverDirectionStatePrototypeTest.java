import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RoverDirectionStatePrototypeTest {

    @Test
    public void shouldReturnRoverNorthStateWhenReceiveNAsKey() {
        RoverDirectionStatePrototype roverDirectionStatePrototype = new RoverDirectionStatePrototype();

        RoverDirectionState roverDirectionState = roverDirectionStatePrototype.getState(Direction.NORTH);

        assertTrue(roverDirectionState instanceof RoverNorthState);
    }

    @Test
    public void shouldReturnRoverSouthStateWhenReceiveSAsKey() {
        RoverDirectionStatePrototype roverDirectionStatePrototype = new RoverDirectionStatePrototype();

        RoverDirectionState roverDirectionState = roverDirectionStatePrototype.getState(Direction.SOUTH);

        assertTrue(roverDirectionState instanceof RoverSouthState);
    }

    @Test
    public void shouldReturnRoverEastStateWhenReceiveEAsKey() {
        RoverDirectionStatePrototype roverDirectionStatePrototype = new RoverDirectionStatePrototype();

        RoverDirectionState roverDirectionState = roverDirectionStatePrototype.getState(Direction.EAST);

        assertTrue(roverDirectionState instanceof RoverEastState);
    }

    @Test
    public void shouldReturnRoverWestStateWhenReceiveEAsKey() {
        RoverDirectionStatePrototype roverDirectionStatePrototype = new RoverDirectionStatePrototype();

        RoverDirectionState roverDirectionState = roverDirectionStatePrototype.getState(Direction.WEST);

        assertTrue(roverDirectionState instanceof RoverWestState);
    }

}