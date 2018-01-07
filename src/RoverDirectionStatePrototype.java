import java.util.HashMap;
import java.util.Map;

public class RoverDirectionStatePrototype {

    private Map<Character, RoverDirectionState> prototypes;


    public RoverDirectionStatePrototype() {
        this.prototypes = new HashMap();
        this.prototypes.put('N', new RoverNorthState());
        this.prototypes.put('S', new RoverSouthState());
        this.prototypes.put('E', new RoverEastState());
        this.prototypes.put('W', new RoverWestState());
    }

    public RoverDirectionState prototype(char direction) {
        return prototypes.get(direction);
    }
}
