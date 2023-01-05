
public class Board {

    private static final int BLen = 8;
    private Tile[][] tiles;

    public Board() {
        this.tiles = new Tile[Board.BLen][Board.BLen];
        boardCons();
    }

    private void boardCons() {
        int idCount = 0;
        for (int i = 0; i < Board.BLen; i++) {
            for (int j = 0; j < Board.BLen; j++) {
                this.tiles[i][j] = new Tile(idCount, i, j);
                idCount++;
            }
        }
    }

}
