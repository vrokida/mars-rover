import java.util.HashMap;
import java.util.Map;

public class RoverDirectionStatePrototype {

    private Map<Direction, RoverDirectionState> prototypes;


    public RoverDirectionStatePrototype(Rover rover) {
        this.prototypes = new HashMap();
        this.prototypes.put(Direction.NORTH, new RoverNorthState(rover));
        this.prototypes.put(Direction.SOUTH, new RoverSouthState(rover));
        this.prototypes.put(Direction.EAST, new RoverEastState(rover));
        this.prototypes.put(Direction.WEST, new RoverWestState(rover));
    }

    public RoverDirectionState getState(Direction direction) {

        return prototypes.get(direction);
    }
}
