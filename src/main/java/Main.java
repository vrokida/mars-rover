import location.CardinalPoint;

/**
 * Created by juanultimate on 07/01/18.
 */
public class Main {
    public static void main(String[] args) {
        Rover rover = new Rover(0,0, CardinalPoint.SOUTH);
        rover.followInstructions("MM");


        Rover rover2 = new Rover(0,0, CardinalPoint.EAST);
        rover2.followInstructions("MMMMMMM");
    }
}
