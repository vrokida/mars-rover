import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RoverDirectionStatePrototypeTest {

    @Test
    public void shouldReturnRoverNorthStateWhenReceiveNAsKey() {
        Rover rover = new Rover(0, 1, "N");
        RoverDirectionStatePrototype roverDirectionStatePrototype = new RoverDirectionStatePrototype(rover);

        RoverDirectionState roverDirectionState = roverDirectionStatePrototype.getState(Direction.NORTH);

        assertTrue(roverDirectionState instanceof RoverNorthState);
    }

    @Test
    public void shouldReturnRoverSouthStateWhenReceiveSAsKey() {
        Rover rover = new Rover(0, 1, "S");
        RoverDirectionStatePrototype roverDirectionStatePrototype = new RoverDirectionStatePrototype(rover);

        RoverDirectionState roverDirectionState = roverDirectionStatePrototype.getState(Direction.SOUTH);

        assertTrue(roverDirectionState instanceof RoverSouthState);
    }

    @Test
    public void shouldReturnRoverEastStateWhenReceiveEAsKey() {
        Rover rover = new Rover(0, 1, "E");
        RoverDirectionStatePrototype roverDirectionStatePrototype = new RoverDirectionStatePrototype(rover);

        RoverDirectionState roverDirectionState = roverDirectionStatePrototype.getState(Direction.EAST);

        assertTrue(roverDirectionState instanceof RoverEastState);
    }

    @Test
    public void shouldReturnRoverWestStateWhenReceiveEAsKey() {
        Rover rover = new Rover(0, 1, "W");
        RoverDirectionStatePrototype roverDirectionStatePrototype = new RoverDirectionStatePrototype(rover);

        RoverDirectionState roverDirectionState = roverDirectionStatePrototype.getState(Direction.WEST);

        assertTrue(roverDirectionState instanceof RoverWestState);
    }

}