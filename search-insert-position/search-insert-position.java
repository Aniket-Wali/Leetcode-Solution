class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = -1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == target){
                index = i;
                break;                
            }
            if(nums[i] > target){
                index = i;
                break;                
            }
        }
        if(nums[nums.length-1] < target)
            return nums.length;
        return index;
    }
}