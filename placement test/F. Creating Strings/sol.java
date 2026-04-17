/*
 this is hard problem if you don't know recursion and backtracking so if you didn't study this topic skip the question for now
*/
import java.util.*;

public class Main {
    static List<String> res = new ArrayList<>();
    static StringBuilder curr = new StringBuilder();
    static boolean[] used;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] s = input.toCharArray();
        Arrays.sort(s);
        used = new boolean[s.length];

        backtrack(s);

        System.out.println(res.size());
        StringBuilder output = new StringBuilder();
        for (String str : res) {
            output.append(str).append("\n");
        }
        System.out.print(output);
    }

    static void backtrack(char[] s) {
        if (curr.length() == s.length) {
            res.add(curr.toString());
            return;
        }

        for (int i = 0; i < s.length; i++) {
            if (used[i]) continue;
            if (i > 0 && s[i] == s[i - 1] && !used[i - 1]) continue;

            used[i] = true;
            curr.append(s[i]);
            backtrack(s);
            
            // Backtrack
            curr.deleteCharAt(curr.length() - 1);
            used[i] = false;
        }
    }
}
