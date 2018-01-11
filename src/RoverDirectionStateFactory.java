public class RoverDirectionStateFactory {


    public RoverDirectionState getState(Rover rover) {

        if (rover.getDirection().equals(Direction.NORTH.getDirection())) {
            return new RoverNorthState(rover);
        } else if (rover.getDirection().equals(Direction.SOUTH.getDirection())) {
            return new RoverSouthState(rover);
        } else if (rover.getDirection().equals(Direction.EAST.getDirection())) {
            return new RoverEastState(rover);
        } else {
            return new RoverWestState(rover);
        }
    }
}
