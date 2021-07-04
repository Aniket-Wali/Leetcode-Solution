class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        if(n == 0)
            return 0;
        int left = 0, right = n-1;
		int maxLeft = 0, maxRight = 0;
		int totalWater = 0;
		while(left < right){
			if(arr[left] < arr[right]){
				if(arr[left] >= maxLeft)
					maxLeft = arr[left];
				else
					totalWater += maxLeft - arr[left];
				left++;
			}
			else{
				if(arr[right] >= maxRight)
					maxRight = arr[right];
				else
					totalWater += maxRight - arr[right];
				right--;
			}
		}
		return totalWater;
    }
}