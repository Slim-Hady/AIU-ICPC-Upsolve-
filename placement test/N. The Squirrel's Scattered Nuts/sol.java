// check sol2.java file 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int N = sc.nextInt();
            int maxOdd = -1;
            int maxEven = -1;

            for (int i = 0; i < N; i++) {
                int val = sc.nextInt();
                if (val % 2 == 0) {
                    if (val > maxEven) maxEven = val;
                } else {
                    if (val > maxOdd) maxOdd = val;
                }
            }

            if (maxOdd != -1 && maxEven != -1) {
                System.out.println((long)maxOdd + maxEven);
            } else {
                System.out.println(-1);
            }
        }
    }
}
