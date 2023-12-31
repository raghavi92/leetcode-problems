public class App {
    private int getShorterWordLength(String word1, String word2) {
        int length = word1.length();

        if (word2.length() < length) {
            length = word2.length();
        }
        return length;
    }

    public String mergeAlternately(String word1, String word2) {
        int length = getShorterWordLength(word1, word2);
        System.out.println(length);
        String output = "";

        for (int i = 0; i < length; i++) {
            output += word1.charAt(i);
            output += word2.charAt(i);
        }

        String longerWord = word1.length() != word2.length() ? (word1.length() == length ? word2 : word1) : null;

        if (longerWord != null) {
            output += longerWord.substring(length);
        }

        return output;
    }
    public static void main(String[] args) {
        App app = new App();
        String output = app.mergeAlternately("hello", "raghavi");
        System.out.println(output);
    }
}
