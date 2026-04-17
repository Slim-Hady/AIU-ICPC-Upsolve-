#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define vi vector<int>
#define vll vector<long long>
#define pb push_back
#define mp make_pair
#define pii pair<int, int>
#define pll pair<long long, long long>
#define all(x) (x).begin(), (x).end()
#define sz(x) ((int)(x).size())
#define MOD 1000000007
#define endl '\n'
#define debug(x) cerr << #x << " = " << x << endl;
#define INF 1e9
#define ld long double;

void solve() {
    ll n ; cin >> n;
    vector<int> v(n);
    for(auto &i : v) cin >> i;
    int cnt = 0;
    for(int i = 0 ; i < n ;i++){
        if(v[i]%5==0){
            cnt++;
        }
    }
    int ans = 0;
    for(int i = 0; i < n; i++){
        if((v[i]*5)%15 ==0){
            ans++;
            cnt--;
        }
        if(cnt == 0) break;
    }
    cout << ans;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);cout.tie(NULL);

    #ifndef ONLINE_JUDGE
        freopen("in.txt", "r", stdin);
        freopen("out.txt", "w", stdout);
    #endif

    int t = 1;
    //cin >> t;
    while (t--) {
       solve();
    }
    return 0;
}
