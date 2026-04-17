import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

            int n = sc.nextInt();
            int[] v = new int[n];
            
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                v[i] = sc.nextInt();
                // Count multiples of 5
                if (v[i] % 5 == 0) {
                    cnt++;
                }
            }
            
            int ans = 0;
            for (int i = 0; i < n; i++) {
                // Check if multiplying by 5 creates a multiple of 15
                if ((v[i] * 5) % 15 == 0) {
                    if (cnt > 0) {
                        ans++;
                        cnt--;
                    }
                }
                if (cnt == 0) break;
            }
            
            System.out.println(ans);
        }
    }
}
