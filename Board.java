public class Board {
    private static int boardLen = 8;
    private Tile[][] boardPieces;

    public Board() {
        this.boardPieces = new Tile[Board.boardLen][Board.boardLen];
        initBoard();

    }

    private void initBoard() {
        for (int i = 0; i < Board.boardLen; i++) {
            for (int j = 0; j < Board.boardLen; j++) {
                this.boardPieces[i][j] = new Tile(i, j);
            }
        }
    }


}
