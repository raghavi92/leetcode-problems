import java.util.HashSet;

public class ReverseVowels {
    public String reverseVowels(String s) {
        int i = 0,j = s.length() - 1;
        HashSet<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        StringBuilder sb = new StringBuilder(s);

        while(i < j) {
            if(!vowels.contains(s.charAt(i))) {
                i++;
                continue;
            }
            if(!vowels.contains(s.charAt(j))) {
                j--;
                continue;
            }

            sb.setCharAt(i, s.charAt(j));
            sb.setCharAt(j, s.charAt(i)); 
            i++;
            j--;   
        }

        return sb.toString();

    }
    public static void main(String[] args) {
        ReverseVowels v = new ReverseVowels();
        System.out.println(v.reverseVowels("hello world"));
    }
}
