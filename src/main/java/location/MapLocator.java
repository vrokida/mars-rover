package location;



public class MapLocator implements Locator{


    //el estado
    private Location location;

    public MapLocator(Location location) {
        this.location = location;
    }

    @Override
    public Location nextLocation(String command) {
        System.out.print("Calculating next location ");
        this.location = location.move(command);
        return this.location;
    }

}
