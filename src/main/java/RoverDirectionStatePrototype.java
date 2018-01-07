import location.CardinalPoint;

import java.util.HashMap;
import java.util.Map;

import static location.CardinalPoint.*;

public class RoverDirectionStatePrototype {

    private static Map<CardinalPoint, Direction> prototypes;


    static {
        prototypes = new HashMap();
        prototypes.put(NORTH, new North());
        prototypes.put(SOUTH, new South());
        prototypes.put(EAST, new East());
        prototypes.put(WEST, new West());
    }

    public static Direction prototype(CardinalPoint dir) {
        return prototypes.get(dir);
    }
}
