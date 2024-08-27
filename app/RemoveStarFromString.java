import java.util.Stack;

public class RemoveStarFromString {

    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();

        for (Character character : s.toCharArray()) {
            if (character == '*') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(character);
            }
        }

        return sb.toString();
    }

    public String removeStars2(String s) {
        Stack<Character> st = new Stack<Character>();

        for (Character character : s.toCharArray()) {
            if (character == '*') {
                if (st.empty()) {
                    continue;
                } else {
                    st.pop();
                }
            } else {
                st.add(character);
            }
        }

        StringBuilder sb = new StringBuilder();

        st.forEach(i -> sb.append(i));

        return sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(new RemoveStarFromString().removeStars("leet**cod*e"));
    }
}
