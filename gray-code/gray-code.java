class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        if (n == 0) {
            result.add(0);
            return result;
        }
        result.add(0);
        result.add(1);
        for (int i = 2; i <= n; i++) {
            for (int j = result.size() - 1; j >= 0; j--) {
                result.add(result.get(j) + pow(2, i - 1));
            }
        }
        return result;
    }
    private int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
}