import location.*;
import movement.LunarNavigator;
import movement.Motioner;

public class Rover {

    Locator locator;
    Motioner mover;

    public Rover(int x, int y, CardinalPoint dir) {
        Position position = new Position(x, y);
        Locator locator = new MapLocator(RoverDirectionStatePrototype.prototype(dir, position));
        this.locator = locator;
        mover = new LunarNavigator();
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
            System.out.println(nextLocation);
            mover.move(nextLocation);
        }
    }
}
