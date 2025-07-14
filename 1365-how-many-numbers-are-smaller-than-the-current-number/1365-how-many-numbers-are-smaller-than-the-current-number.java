class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int n=nums.length;
        int[] res=nums.clone();
       
        Arrays.sort(res);
        Map<Integer,Integer> a=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!a.containsKey(res[i])){
              a.put(res[i],i);
            }
        }
        for(int i=0;i<n;i++){

            res[i]=a.get(nums[i]);
        }
        return res;
    }
}