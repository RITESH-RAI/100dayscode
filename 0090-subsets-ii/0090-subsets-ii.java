class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        solve(nums,0,new ArrayList<Integer>(),ans);
        return ans;
    }
    public void solve(int nums[],int i, List<Integer> temp, List<List<Integer>> ans){
        if(i==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        solve(nums,i+1,temp,ans);
        temp.remove(temp.size()-1);
        while(i<nums.length-1&&nums[i]==nums[i+1]){
            i++;
        }
        solve(nums,i+1,temp,ans);
    }
}