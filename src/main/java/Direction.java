import location.CardinalPoint;

public interface Direction {

    CardinalPoint getCardinalPoint();

    Position move(Position position);

    Direction turn(String instruction);

    boolean equals (Object other);
}
