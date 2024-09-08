package recursion;

public class dupstring {
    public static void rdup(String s, int idx, StringBuilder sb, boolean[] map) {
        if (idx == s.length()) {
            System.out.println(sb);
            return;
        }

        char crr = s.charAt(idx);
        if (map[crr - 'a']) {
            rdup(s, idx + 1, sb, map);
        } else {
            map[crr - 'a'] = true;
            rdup(s, idx + 1, sb.append(crr), map);
        }
    }

    public static void main(String[] args) {
        String s = "hritik";
        rdup(s, 0, new StringBuilder(), new boolean[26]);
    }
}
