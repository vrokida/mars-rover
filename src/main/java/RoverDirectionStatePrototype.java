import location.*;

import java.util.HashMap;
import java.util.Map;

import static location.CardinalPoint.*;

public class RoverDirectionStatePrototype {

    private static Map<CardinalPoint, Location> prototypes;



    public static Location prototype(CardinalPoint dir, Position position) {

        prototypes = new HashMap();
        prototypes.put(NORTH, new North(position));
        prototypes.put(SOUTH, new South(position));
        prototypes.put(EAST, new East(position));
        prototypes.put(WEST, new West(position));
        return prototypes.get(dir);
    }
}
