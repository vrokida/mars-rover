import location.CardinalPoint;
import location.Direction;

public class DirectionAsCardinalPoint {

    private CardinalPoint cardinal;

    public DirectionAsCardinalPoint(CardinalPoint car){
        this.cardinal= car;

    }

    public Direction getDirectionValue() {
        return RoverDirectionStatePrototype.prototype(this.cardinal);
    }
}
