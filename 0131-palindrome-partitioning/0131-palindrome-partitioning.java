
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        solve(0, s, result, new ArrayList<>());
        return result;
    }

    public void solve(int idx, String s, List<List<String>> result, List<String> temp) {
        if (idx == s.length()) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = idx; i < s.length(); i++) {
            String str = s.substring(idx, i + 1);
            if (isPalindrome(str)) {
                temp.add(str);
                solve(i + 1, s, result, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String r) {
        int i = 0;
        int j = r.length() - 1;
        while (i < j) {
            if (r.charAt(i) != r.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}