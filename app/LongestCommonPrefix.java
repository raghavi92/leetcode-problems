public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String currentPrefix = "";
        int cursorPosition = 1;
        boolean matches = true;
        if(strs.length == 1) {
            return strs[0];
        }
        while(matches) {
            if(cursorPosition > strs[0].length()) {
                cursorPosition--;
                break;
            }
            currentPrefix = strs[0].substring(0, cursorPosition);
            for (int i = 0; i < strs.length; i++) {
                if(!strs[i].startsWith(currentPrefix)) {
                    matches = false;
                    cursorPosition--;
                    break;
                }
            }
            if(!matches) {
                break;
            }
            cursorPosition++;
        }
        return currentPrefix.substring(0, cursorPosition);
    }

    public static void main(String[] args) {
        LongestCommonPrefix p = new LongestCommonPrefix();
        System.out.println(p.longestCommonPrefix(new String[]{"", "hel", "he"}));
    }
}
