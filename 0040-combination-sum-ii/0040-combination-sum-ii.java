class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> temp =  new ArrayList<>();
        int sum=0;
        List<List<Integer>> ans= new ArrayList<>() ;
        Arrays.sort(candidates);
        help(0,sum, candidates, target, temp,ans);
        return ans;
        
    }
    public void help(int i , int sum , int candidates[],int target, List<Integer>  temp,List<List<Integer>> ans){
        if(sum== target){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        if(sum> target|| i== candidates.length){
return;
        }
        sum+=candidates[i];
        temp.add(candidates[i]);
        help(i+1,sum,candidates, target, temp,ans);
        
        
        temp.remove(temp.size()-1);
        sum-=candidates[i];
        
            while (i + 1 < candidates.length && candidates[i] == candidates[i + 1]) {
            i++;
        }
         help(i+1,sum,candidates,target, temp,ans);
    }
}