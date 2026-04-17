#include <bits/stdc++.h>

using namespace std;

void solve() {
    int N;
    long long K;
    cin >> N >> K;
    vector<long long> a(N);
    for (int i = 0; i < N; i++) cin >> a[i];

    int max_len = 0;
    for (int i = 0; i < N; i++) {
        long long current_min = a[i];
        long long current_max = a[i];
        for (int j = i; j < N; j++) {
            current_min = min(current_min, a[j]);
            current_max = max(current_max, a[j]);
            
            if (current_max - current_min <= K) {
                max_len = max(max_len, j - i + 1);
            } else {
                break; 
            }
        }
    }
    cout << max_len << endl;
}

int main() {
  // fast input and output
    ios_base::sync_with_stdio(false); 
    cin.tie(NULL);
  
    int T;
    cin >> T;
    while (T--) {
        solve();
    }
    return 0;
}
