class Solution {
    public int search(int[] nums, int target) {
        int upperbound=nums.length-1;
        int lowerbound=0;
        int middle=0;
      while(lowerbound<=upperbound){
      middle=(upperbound+lowerbound)/2;
       if(nums[middle]<target){
        lowerbound=middle+1;
        
       }
       
       if(nums[middle]>target){
        upperbound=middle-1;
       }
      if(nums[middle]==target){
        return middle;
        
       }
      }
        
        return -1;
        
    }
}
