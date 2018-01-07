
public class RoverEastState implements RoverDirectionState {

    @Override
    public Position move(Position position) {
        position.moveForwardInX();
        return position;
    }

    @Override
    public Direction turnRight() {
        return Direction.SOUTH;
    }

    @Override
    public Direction turnLeft() {
        return Direction.NORTH;
    }
}
