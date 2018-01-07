
public interface RoverDirectionState {

    Position move(Position position);

    Direction turnRight();

    Direction turnLeft();
}
