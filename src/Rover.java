public class Rover {

    private Position position;

    private Direction direction;

    private RoverDirectionState state;

    public Rover(int x, int y, String direction) {
        this.position = new Position(x, y);
        this.direction = Direction.fromString(direction);
        this.state = new RoverDirectionStatePrototype().getState(this.direction);
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

    public void followInstructions(String instructions) {
        String[] instructionsKeys = instructions.split("");
        for (String instructionKey : instructionsKeys) {
            if (instructionKey.equals("M")) {
                move();
            } else {
                turn(instructions);
            }
        }
    }

    private void turn(String instruction) {
        if (instruction.equals("R")) {
            this.direction = state.turnRight();
        } else {
            this.direction = state.turnLeft();
        }
    }

    private void move() {
        this.position = state.move(this.position);
    }
}
