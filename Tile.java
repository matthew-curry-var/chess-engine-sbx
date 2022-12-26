public class Tile {

    private Piece pi;
    private int xPos;
    private int yPos;

    public Tile(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }

    public Tile(Piece p, int x, int y) {
        this.pi = p;
        this.xPos = x;
        this.yPos = y;
    }
}
