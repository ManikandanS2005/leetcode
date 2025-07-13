class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> a=new ArrayList<Integer>();
        Set<Integer> s=new HashSet<>();
        
        for(int i=0;i<n;i++){
            if(!s.contains(nums[i])){
               s.add(nums[i]);
            }
        }
        for(int i=1;i<=n;i++){
              if(!s.contains(i)){
               a.add(i);
            }
        }
        return a;
       
      
        
        
    }
}