public class Solution {
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || (i + j == n - 1)) {
                    list.add(nums[i][j]);
                }
            }
        }

        Collections.sort(list, Collections.reverseOrder());
        for (int num : list) {
            if (isPrime(num)) {
                return num;
            }
        }
        return 0;
    }
   public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}