import java.util.TreeMap;

public class DefaultTileMap {
    private TreeMap<Integer, String> dftMap;

    public DefaultTileMap() {
        this.dftMap = new TreeMap<>();

        //white royalty row
        this.dftMap.put(0, "White Rook");
        this.dftMap.put(1, "White Knight");
        this.dftMap.put(2, "White Bishop");
        this.dftMap.put(3, "White Queen");
        this.dftMap.put(4, "White King");
        this.dftMap.put(5, "White Bishop");
        this.dftMap.put(6, "White Knight");
        this.dftMap.put(7, "White Rook");

        //white pawn row
        this.dftMap.put(8, "White Pawn");
        this.dftMap.put(9, "White Pawn");
        this.dftMap.put(10, "White Pawn");
        this.dftMap.put(11, "White Pawn");
        this.dftMap.put(12, "White Pawn");
        this.dftMap.put(13, "White Pawn");
        this.dftMap.put(14, "White Pawn");
        this.dftMap.put(15, "White Pawn");

        //black pawn row
        this.dftMap.put(48, "Black Pawn");
        this.dftMap.put(49, "Black Pawn");
        this.dftMap.put(50, "Black Pawn");
        this.dftMap.put(51, "Black Pawn");
        this.dftMap.put(52, "Black Pawn");
        this.dftMap.put(53, "Black Pawn");
        this.dftMap.put(54, "Black Pawn");
        this.dftMap.put(55, "Black Pawn");

        //black royal row
        this.dftMap.put(56, "Black Rook");
        this.dftMap.put(57, "Black Knight");
        this.dftMap.put(58, "Black Bishop");
        this.dftMap.put(59, "Black Queen");
        this.dftMap.put(60, "Black King");
        this.dftMap.put(61, "Black Bishop");
        this.dftMap.put(62, "Black Knight");
        this.dftMap.put(63, "Black Rook");

    }

    public TreeMap<Integer, String> treeMap() {
        return this.dftMap;
    }
}
