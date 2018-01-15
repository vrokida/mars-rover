
public class RoverWestState implements RoverDirectionState {

    private Rover rover;

    public RoverWestState(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void move() {
        rover.getPosition().moveBackInX();
    }

    @Override
    public void turnRight() {
        this.rover.setState(new RoverNorthState(rover));
        this.rover.setDirection(Direction.NORTH);
    }

    @Override
    public void turnLeft() {
        this.rover.setState(new RoverSouthState(rover));
        this.rover.setDirection(Direction.SOUTH);
    }
}
