import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RoverDirectionStateFactoryTest {

    @Test
    public void shouldReturnRoverNorthStateWhenReceiveNAsKey() {
        Rover rover = new Rover(0, 1, "N");
        RoverDirectionStateFactory roverDirectionStateFactory = new RoverDirectionStateFactory();

        RoverDirectionState roverDirectionState = roverDirectionStateFactory.getState(rover);

        assertTrue(roverDirectionState instanceof RoverNorthState);
    }

    @Test
    public void shouldReturnRoverSouthStateWhenReceiveSAsKey() {
        Rover rover = new Rover(0, 1, "S");
        RoverDirectionStateFactory roverDirectionStateFactory = new RoverDirectionStateFactory();

        RoverDirectionState roverDirectionState = roverDirectionStateFactory.getState(rover);

        assertTrue(roverDirectionState instanceof RoverSouthState);
    }

    @Test
    public void shouldReturnRoverEastStateWhenReceiveEAsKey() {
        Rover rover = new Rover(0, 1, "E");
        RoverDirectionStateFactory roverDirectionStateFactory = new RoverDirectionStateFactory();

        RoverDirectionState roverDirectionState = roverDirectionStateFactory.getState(rover);

        assertTrue(roverDirectionState instanceof RoverEastState);
    }

    @Test
    public void shouldReturnRoverWestStateWhenReceiveEAsKey() {
        Rover rover = new Rover(0, 1, "W");
        RoverDirectionStateFactory roverDirectionStateFactory = new RoverDirectionStateFactory();

        RoverDirectionState roverDirectionState = roverDirectionStateFactory.getState(rover);

        assertTrue(roverDirectionState instanceof RoverWestState);
    }

}