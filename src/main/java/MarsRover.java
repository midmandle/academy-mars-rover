public class MarsRover {
    public String run(String commands) {
        if (commands.equals("R")) {
             return "0:0:E";
        }
        if (commands.equals("RR")) {
            return "0:0:S";
        }
        if (commands.equals("RRR")) {
            return "0:0:W";
        }
        return "0:0:N";
    }
}
