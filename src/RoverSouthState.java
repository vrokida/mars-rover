public class RoverSouthState implements RoverDirectionState {

    @Override
    public Position move(Position position) {
        position.moveBackInY();
        return position;
    }

    @Override
    public Direction turnRight() {
        return Direction.WEST;
    }

    @Override
    public Direction turnLeft() {
        return Direction.EAST;
    }
}
