public class ReverseWords {
    public String reverseWords(String s) {
        String words[] = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (i == 0) {
                sb.append(words[i].trim());
            } else {
                sb.append(String.format("%s ", words[i].trim()));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        ReverseWords rw = new ReverseWords();
        System.out.println(rw.reverseWords("a good   example"));
    }
}
