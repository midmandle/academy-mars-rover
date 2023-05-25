public class MarsRover {

    public static final String TURN_RIGHT = "R";
    public static final String TURN_LEFT = "L";

    public String run(String commands) {
        String coordinates = "0:0:";
        Direction direction = Direction.NORTH;

        for (String command : commands.split("")) {
            if(command.equals(TURN_LEFT)) {
                direction = turnLeft(direction);
            }
            if(command.equals(TURN_RIGHT)) {
                direction = turnRight(direction);
            }
        }

        return coordinates + direction.getValue();
    }

    private static Direction turnLeft(Direction currentDirection){
        switch(currentDirection) {
            case WEST -> {
                return Direction.SOUTH;
            }
            case SOUTH -> {
                return Direction.EAST;
            }
            case EAST -> {
                return Direction.NORTH;
            }
            default ->  {
                return Direction.WEST;
            }
        }
    }

    private static Direction turnRight(Direction currentDirection){
        switch (currentDirection) {
            case EAST -> {
                return Direction.SOUTH;
            }
            case SOUTH -> {
                return Direction.WEST;
            }
            case WEST -> {
                return Direction.NORTH;
            }
            default -> {
                return Direction.EAST;
            }
        }
    }
}
