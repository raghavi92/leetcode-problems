import java.util.Arrays;

public class WordSimilarity {
    
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length())
            return false;

        int[] modifiedList = new int[word1.length()];
        Arrays.fill(modifiedList, -1);
        StringBuilder sb = new StringBuilder(word2);

        for(int i = 0; i < word1.length() ; i++) {
            if(word1.charAt(i) == sb.charAt(i)) {
                continue;
            }
            if(modifiedList[i] >= 0) {
                // already swapped
                return false;
            }
            int idx = sb.indexOf(String.valueOf(word1.charAt(i)), i);
            if(idx >= 0) {
                modifiedList[i] = idx;
                modifiedList[idx] = i;
                char temp = sb.charAt(idx);
                sb.deleteCharAt(idx);
                sb.insert(idx, sb.charAt(i));
                sb.deleteCharAt(i);
                sb.insert(i, temp);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        WordSimilarity ws = new WordSimilarity();
        boolean b = ws.closeStrings("cabbba", "abbccc");
        System.out.println(b);
    }
}
