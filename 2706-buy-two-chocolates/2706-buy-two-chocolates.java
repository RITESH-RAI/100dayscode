class Solution {
    public int buyChoco(int[] nums, int money) {
        Arrays.sort(nums);
        int s1=nums[0]+nums[1];
        if(s1>money){
            return money;
        }
        
        for(int i=0;i<nums.length;i++){
            int sum=nums[i]+nums[i+1];
            if(sum<=money){
                return money-sum;
            }

        }
        return money;
    }
}