package movement;

import location.Location;

/**
 * Created by juanultimate on 07/01/18.
 */
public class LunarNavigator implements Motioner{

    @Override
    public void move(Location nextLocation) {
        System.out.println("Traveling to: "+ nextLocation);
    }
}
