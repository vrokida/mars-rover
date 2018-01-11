
public class RoverNorthState implements RoverDirectionState {

    private Rover rover;

    public RoverNorthState(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void move() {
        rover.getPosition().moveForwardInY();
    }

    public void turnRight() {
        this.rover.setState(new RoverEastState(rover));
        this.rover.setDirection(Direction.EAST);
    }

    public void turnLeft() {
        this.rover.setState(new RoverWestState(rover));
        this.rover.setDirection(Direction.WEST);
    }
}
