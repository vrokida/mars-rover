import location.CardinalPoint;

public class Rover {

    private Position position;

    private Direction direction;

    public Rover(int x, int y, CardinalPoint dir) {
        this.position = new Position(x, y);
        this.direction = new DirectionAsCardinalPoint(dir).getDirectionValue();

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
        this.direction = this.direction.turn(instruction);
    }

    private void move() {
        this.position = this.direction.move(this.position);
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

    public Direction getDirection() {
        return direction;
    }
}
