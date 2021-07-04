class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i<n-3; i++){
            for(int j = i+1; j<n-2; j++){
                int x = target - (nums[i] + nums[j]);
                int left = j+1;
                int right = n-1;
                while(left < right){
                    if(nums[left] + nums[right] == x){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        if(ans.indexOf(temp) == -1)
                            ans.add(temp);
                        left++;
                        right--;
                    }
                    else if(nums[left] + nums[right] < x)
                        left++;
                    else 
                        right--;
                }
            }
        }
        return ans;
    }
}