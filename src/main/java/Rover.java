import location.*;
import movement.Motioner;

public class Rover {

    Locator locator;
    Motioner mover;

    public Rover(int x, int y, CardinalPoint dir) {
        Position position = new Position(x, y);
        Locator locator = new MapLocator(RoverDirectionStatePrototype.prototype(dir, position));
        this.locator = locator;
    }

    public void followInstructions(String instructions) {
        String[] instructionsKeys = instructions.split("");
        for (String instructionKey : instructionsKeys) {
            move(instructionKey);

        }
    }


    private void move(String instruction) {
        if(instruction.equals("M")) {
            Location nextLocation = locator.nextLocation(instruction);
            mover.move(nextLocation);
        }
    }
}
