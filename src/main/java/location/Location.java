package location;


public interface Location {
    Location move(String command);
    public CardinalPoint facingTo();

}
