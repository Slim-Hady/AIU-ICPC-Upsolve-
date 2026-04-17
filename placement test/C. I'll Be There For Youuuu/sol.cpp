#include <bits/stdc++.h>

using namespace std;

void solve() {
    int N, K, M;
    cin >> N >> K >> M;

    int totalClaps = 0;
    int lastClap = -1;

    for (int i = 1; i <= N; i += K) {
        if (i % M != 0) {
            totalClaps++;
            lastClap = i;
        }
    }

    if (totalClaps == 0) {
        cout << "0 -1" << endl;
    } else {
        cout << totalClaps << " " << lastClap << endl;
    }
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int T;
    cin >> T;
    while (T--) {
        solve();
    }
    return 0;
}
