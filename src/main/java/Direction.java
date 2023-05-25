public class Direction {

    private final String NORTH = "N";
    private final String EAST = "E";
    private final String SOUTH = "S";
    private final String WEST = "W";

    private String currentDirection;

    public Direction() {
        this.currentDirection = NORTH;
    }

    public void turnLeft(){
        switch (currentDirection) {
            case NORTH -> currentDirection = WEST;
            case WEST -> currentDirection = SOUTH;
            case SOUTH -> currentDirection = EAST;
            default -> currentDirection = NORTH;
        }
    }

    public void turnRight(){
        switch (currentDirection) {
            case NORTH -> currentDirection = EAST;
            case EAST -> currentDirection = SOUTH;
            case SOUTH -> currentDirection = WEST;
            default -> currentDirection = NORTH;
        }
    }

    public String facingTo() {
        return currentDirection;
    }
}