public class WordSearch {
    boolean wordSearch(char[][] board, int i, int j, int wordIndex, String word, boolean[][] visited) {

        if (wordIndex == word.length()) {
            return true;
        }

        if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1
                || word.charAt(wordIndex) != board[i][j] || visited[i][j] == true) {
            return false;
        }

        // char at index matches, so set visited to true to future iterations do not
        // consider even if matches
        visited[i][j] = true;

        if (wordSearch(board, i - 1, j, wordIndex + 1, word, visited)
                || wordSearch(board, i + 1, j, wordIndex + 1, word, visited)
                || wordSearch(board, i, j - 1, wordIndex + 1, word, visited)
                || wordSearch(board, i, j + 1, wordIndex + 1, word, visited)) {
            return true;

        }

        visited[i][j] = false;

        return false;

    }

    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (wordSearch(board, i, j, 0, word, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        char[][] board = {
                { 'a', 'b', 'c', 'e' },
                { 's', 'f', 'c', 's' },
                { 'a', 'd', 'e', 'e' }
        };

        // char[][] board = {
        // { 'a', 'b' },
        // { 'c', 'd' }
        // };

        System.out.println(new WordSearch().exist(board, "abcb"));

    }
}
