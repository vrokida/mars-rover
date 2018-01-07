
public class RoverWestState implements RoverDirectionState {

    @Override
    public Position move(Position position) {
        position.moveBackInX();
        return position;
    }

    @Override
    public Direction turnRight() {
        return Direction.NORTH;
    }

    @Override
    public Direction turnLeft() {
        return Direction.SOUTH;
    }
}
