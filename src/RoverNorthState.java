
public class RoverNorthState implements RoverDirectionState {

    @Override
    public Position move(Position position) {
       position.moveForwardInY();
        return position;
    }

    public Direction turnRight() {
        return Direction.EAST;
    }

    public Direction turnLeft() {
        return Direction.WEST;
    }
}
