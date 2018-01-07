import java.util.HashMap;
import java.util.Map;

public class RoverDirectionStatePrototype {

    private Map<Direction, RoverDirectionState> prototypes;


    public RoverDirectionStatePrototype() {
        this.prototypes = new HashMap();
        this.prototypes.put(Direction.NORTH, new RoverNorthState());
        this.prototypes.put(Direction.SOUTH, new RoverSouthState());
        this.prototypes.put(Direction.EAST, new RoverEastState());
        this.prototypes.put(Direction.WEST, new RoverWestState());
    }

    public RoverDirectionState prototype(Direction direction) {
        return prototypes.get(direction);
    }
}
