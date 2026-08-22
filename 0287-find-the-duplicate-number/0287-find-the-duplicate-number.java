class Solution {
    public int findDuplicate(int[] nums) {
         HashSet<Integer> set = new HashSet<Integer>();
         int len =nums.length;
         int res = 0;
         for (int i=0;i<len;i++){
            if(set.contains(nums[i])){
            res = (nums[i]);
  } else{
                set.add(nums[i]);
            }
         }
         return res;
         }
    }
        
    
