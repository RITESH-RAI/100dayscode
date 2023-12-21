class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        int min = Math.abs(arr[0]-arr[1]);
        for(int i = 2; i<arr.length; i++){
            min = Math.min(arr[i]-arr[i-1],min);
        }
        for(int i = 1; i<arr.length; i++){
            if(min == arr[i]-arr[i-1]){
                res.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }
        return res;
    }
}