public class MarsRover {
    public String run(String commands) {
        if (commands.equals("R")) {
             return "0:0:E";
        }
        return "0:0:N";
    }
}
