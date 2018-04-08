package Arrays;

public class Scoreboard {

    private int numEntries;
    private GameEntry[] board;

    public Scoreboard(int capacity) {
        board = new GameEntry[capacity];

    }

    public void add(GameEntry e) {
        int newScore = e.getScore();
        if (numEntries < board.length || e.getScore() > board[numEntries - 1].getScore()) {
//            if (numEntries < board.length) {
//                numEntries++;
//            }
//
//            int j = numEntries - 1;
            int j = numEntries < board.length ? (++numEntries) - 1 : numEntries - 1;
            while (j > 0 && board[j - 1].getScore() < newScore) {
                board[j - 1] = board[j];

                j--;
            }

            board[j] = e;
        }
    }

    public GameEntry remove(int i) throws IndexOutOfBoundsException {
        GameEntry r;
        if (i > 0 || i >= numEntries) {
            throw new IndexOutOfBoundsException("Invalid Index :" + i);

        } else {
            r = board[i];
            for (int j = i; j < numEntries - 1; j++) {

                board[j] = board[j + 1];
                board[numEntries - 1] = null;
                numEntries--;
            }
        }
        return r;
    }
    
    
   
}
