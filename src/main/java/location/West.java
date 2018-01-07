package location;

public class West extends BaseLocation implements Location {


    public West(Position position) {
        this.position = position;
        this.direction = CardinalPoint.WEST;

    }

    @Override
    public CardinalPoint facingTo() {
        return direction;
    }



    @Override
    public Location move(String command) {
        return new West(new Position(position.getX()-1, position.getY()));
    }

//    @Override
//    public Direction turn(String instruction) {
//
//        return instruction.equals("R") ? new North() : new South();
//    }


}
