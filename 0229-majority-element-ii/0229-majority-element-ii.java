class Solution {
   
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0;
        int cnt2=0;
        int el1=Integer.MIN_VALUE;
        int el2=Integer.MIN_VALUE;;
        int len=nums.length;
for (int i = 0; i < len; i++) {
            if (cnt1 == 0 && el2 != nums[i]) {
                cnt1 = 1;
                el1 = nums[i];
            } else if (cnt2 == 0 && el1 != nums[i]) {
                cnt2 = 1;
                el2 = nums[i];
            } else if (nums[i] == el1) cnt1++;
            else if (nums[i] == el2) cnt2++;
            else {
                cnt1--; cnt2--;
            }
        }
        
               
            cnt1=0;
        cnt2=0;
        for(int i=0;i<len;i++){
            if(nums[i]==el1){
                cnt1++;
            } else if (nums[i]==el2){
                cnt2++;
            }
        }
    
        List<Integer> ans=new ArrayList<>();
       int mini = (int)(len / 3) + 1;
            if(cnt1>=mini){
                ans.add(el1);
            }
            if(cnt2>=mini){
                ans.add(el2);
            }
        
 return ans;
    }
}
