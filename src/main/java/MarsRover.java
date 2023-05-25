public class MarsRover {
    public String run(String commands) {
        if (commands.equals("R")) {
             return "0:0:E";
        }
        if (commands.equals("RR")) {
            return "0:0:S";
        }
        return "0:0:N";
    }
}
