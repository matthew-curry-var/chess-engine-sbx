import java.util.TreeMap;

public class Tile {

    private int id;
    private String color;
    private Piece resPiece;

    public Tile(int idInput, int col, int row) {
        DefaultTileMap d = new DefaultTileMap();
        this.id = idInput;
        this.color = findColor(col, row);
        this.resPiece = findStartPiece(idInput, d.treeMap());
    }

    private String findColor(int c, int r) {
        if ((c + r) % 2 == 0) {
            return "black";
        } return "white";
    }

    private Piece findStartPiece(int idNum, TreeMap<Integer, String> tm) {
        String s = tm.get(idNum);
        if (s != null) {
            //need to return a piece object
            //return interpretStartingPiece(s);
        } return null;
    }

}
