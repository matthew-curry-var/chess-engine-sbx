
public class Main {
    public static void main(String[] args) {
        Board b = new Board();
        GUI g = new GUI(b);
        while (true) {
            g.dispBoard();
        }
    }
}
