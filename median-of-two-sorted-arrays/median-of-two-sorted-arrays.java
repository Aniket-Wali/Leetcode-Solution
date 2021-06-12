class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1+n2;
        int i = 0, j = 0;
        int arr[] = new int[n];
        int index = 0;
        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]){
                arr[index++] = nums1[i++];
            }
            else if(nums1[i] == nums2[j]){
                arr[index++] = nums1[i++];
                arr[index++] = nums2[j++];
            }
            else
                arr[index++] = nums2[j++];
        }
        if(i < n1){
            while(i < n1)
                arr[index++] = nums1[i++];
        }
        if(j < n2){
            while(j < n2)
                arr[index++] = nums2[j++];
        }
        for(int k = 0; k<index; k++)
            System.out.print(arr[k] + " ");
        if(n%2 == 0)
            return (double)(arr[n/2]+arr[n/2 - 1])/2;
        return (double)arr[n/2];
    }
}