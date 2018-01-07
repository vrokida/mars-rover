import java.util.HashMap;
import java.util.Map;

public class RoverDirectionStatePrototype {

    private Map<Character, Direction> prototypes;


    public RoverDirectionStatePrototype() {
        this.prototypes = new HashMap();
        this.prototypes.put('N', new North());
        this.prototypes.put('S', new South());
        this.prototypes.put('E', new East());
        this.prototypes.put('W', new West());
    }

//    public Direction prototype(char direction) {
//        return prototypes.get(direction);
//    }
}
