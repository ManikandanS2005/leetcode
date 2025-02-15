class Solution {
public:
    constexpr static inline bool partition(int x, int target) {
        if (x==target) return 1;
        if (x==0) return target==0; 
        for (int m=10; m<=x; m*=10) {
            if (partition(x/m, target-x%m)) return 1;
        }
        return 0;
    }
    static consteval auto isValid(){
        array<int, 1001> ans={0};
        for(int i=1; i<=1000; i++){
            const int x=i*i;
            ans[i]=partition(x, i)*x;
            ans[i]+=ans[i-1];// prefix sum
        }
        return ans;
    }
    
    static int punishmentNumber(int n) {
        constexpr auto ans=isValid();// all done in compile-time
        return ans[n];// looking up ans[n] in table
    }
};
 