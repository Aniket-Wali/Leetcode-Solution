class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        res[0] = findLeftIndex(nums, target);
        res[1] = findRightIndex(nums, target);
        return res;
    }
    
    public int findLeftIndex(int[] nums, int target){
        int index = -1;
        int start = 0, end = nums.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target) index = mid;
            if(nums[mid] >= target) end = mid-1;
            else    start = mid+1;
        }
        return index;
    }
    
    public int findRightIndex(int[] nums, int target){
        int index = -1;
        int start = 0, end = nums.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target) index = mid;
            if(nums[mid] <= target) start = mid+1;
            else    end = mid-1;
        }
        return index;
    }
}