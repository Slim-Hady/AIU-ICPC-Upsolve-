import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int t = sc.nextInt();
      
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long m = sc.nextLong();

            long count = 0;
            long lastClap = -1;


            for (long second = 1; second <= n; second += k) {
                if (second % m != 0) {
                    count++;
                    lastClap = second;
                }
            }

            if (count == 0) {
                System.out.println("0 -1");
            } else {
                System.out.println(count + " " + lastClap);
            }
        }
      
    }
}
