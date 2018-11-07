package Game;

public class Board {
    Room[][] map;

    public Board(Room[][] map) {
        this.map = map;
    }

    public Board(int height, int width) {
        map = new Room[height][width];
    }

    public void printBoard() {
        for (Room[] i : map) {
            for (Room j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
