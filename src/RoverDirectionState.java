
public interface RoverDirectionState {

    Position move(Position position);

    char turn(String instruction);
}
