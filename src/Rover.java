public class Rover {

    private Position position;
    private Direction direction;
    private RoverDirectionState state;

    public Rover(int x, int y, String direction) {
        this.position = new Position(x, y);
        this.direction = Direction.fromString(direction);
        this.state = new RoverDirectionStatePrototype(this).getState(this.direction);
    }

    public Position getPosition() {
        return position;
    }

    public int getX() {
        return position.getX();
    }

    public int getY() {
        return position.getY();
    }

    public String getDirection() {
        return direction.getDirection();
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setState(RoverDirectionState state) {
        this.state = state;
    }

    public void followInstructions(String instructions) {
        String[] instructionsKeys = instructions.split("");
        for (String instructionKey : instructionsKeys) {
            if (instructionKey.equals("M")) {
                move();
            } else {
                turn(instructionKey);
            }
        }
    }

    private void turn(String instruction) {
        if (instruction.equals("R")) {
            state.turnRight();
        } else {
            state.turnLeft();
        }
    }

    private void move() {
        state.move();
    }
}
