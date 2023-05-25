public class Coordinates {
    private int YPosition;
    private int XPosition;
    public Coordinates() {
        this.XPosition = 0;
        this.YPosition = 0;
    }
    public void move(String facing) {
        if (facing.equals("E")) {
            XPosition += 1;
        }
        if (facing.equals("W")) {
            XPosition -= 1;
        }
        if(facing.equals("N")) {
            YPosition++;
        }
        if(facing.equals("S")){
            YPosition = YPosition - 1;
        }
    }
    public String currentPosition() {
        return String.format("%d:%d", XPosition, YPosition);
    }
}
