public class MarsRover {

    public static final String TURN_RIGHT = "R";
    public static final String TURN_LEFT = "L";

    public String run(String commands) {
        String coordinates = "0:0:";
        Direction direction = Direction.NORTH;

        if (commands.equals(TURN_LEFT+TURN_LEFT+TURN_RIGHT)) {
            return coordinates + Direction.WEST.getValue();
        }
        if (commands.equals(TURN_RIGHT+TURN_RIGHT+TURN_LEFT)) {
            return coordinates + Direction.EAST.getValue();
        }

        if(commands.contains(TURN_LEFT)) {
            for (int i = 0; i < commands.length(); i++) {
                direction = turnLeft(direction);
            }
        }

        if(commands.contains(TURN_RIGHT)) {
            for (int i = 0; i < commands.length(); i++) {
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
