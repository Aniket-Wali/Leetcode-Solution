class Solution {
    public void sortColors(int[] nums) {
//             Using Dutch Flag Algorithm
        int n = nums.length;
        int low = 0, mid = 0, high = n-1;
        int temp = 0;
        while(mid <= high){
            if(nums[mid] == 0){
                temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }
            else if(nums[mid] == 1)
                mid++;
            else{
                temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}