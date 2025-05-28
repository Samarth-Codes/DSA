class Solution {
    public int[] twoSum(int[] nums, int target) {
        int count=0;
    
       for(int i=0;i<nums.length;i++){
          count=target-nums[i];
          for(int j=0;j<i;j++){
          
            if(count==nums[j]){
                return new int[] {i, j};

  
            }

          }
       }
     return new int[] {};
    
    }
   
}
