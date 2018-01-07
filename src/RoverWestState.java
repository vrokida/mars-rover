
public class RoverWestState implements RoverDirectionState {

    @Override
    public Position move(Rover rover) {
        return new Position(rover.getX() - 1, rover.getY());
    }

    @Override
    public char turn() {
        return 'N';
    }
}
