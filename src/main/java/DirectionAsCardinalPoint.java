import location.CardinalPoint;

public class DirectionAsCardinalPoint {

    private Direction direction;

    public DirectionAsCardinalPoint(CardinalPoint car){
        this.direction = RoverDirectionStatePrototype.prototype(car);

    }

    public Direction getDirection() {
        return direction;
    }
}
