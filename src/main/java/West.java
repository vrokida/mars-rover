import location.CardinalPoint;

public class West extends BaseDirection  implements Direction {

    @Override
    public CardinalPoint getCardinalPoint() {
        return CardinalPoint.WEST;
    }

    @Override
    public Position move(Position position) {
        return new Position(position.getX() - 1, position.getY());
    }

    @Override
    public Direction turn(String instruction) {

        return instruction.equals("R") ? new North() : new South();
    }


}
