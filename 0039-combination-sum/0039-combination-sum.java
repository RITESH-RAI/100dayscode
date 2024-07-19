class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<Integer> temp=new ArrayList<>();
     int sum=0;   
        List<List<Integer>> ans=new ArrayList<>();
           Arrays.sort(candidates);
        help(0,sum,target,candidates,ans,temp);
        return ans;
    }
    public void help(int i,int sum,int b,int arr[],List<List<Integer>>ans,List<Integer>temp){
        if(sum==b){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(sum>b)
            return;
        
        if(i>=arr.length)
            return;
    
        //skip the element
      help(i + 1, sum, b, arr, ans, temp);
            //pick 
            sum+=arr[i];
        temp.add(arr[i]);
        help(i, sum, b, arr, ans, temp);
        temp.remove(temp.size()-1);
        sum-=arr[i];
    }
    }
