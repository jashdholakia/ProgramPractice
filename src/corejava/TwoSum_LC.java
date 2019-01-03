package corejava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum_LC {
	
	public int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement)) {
	            return new int[] { map.get(complement), i };
	        }
	        map.put(nums[i], i);
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
    
    public static void main(String args[])
    {
        int[] nums= {1,7,1,11,15,8};
        int target=9;
        System.out.println("into main");
        
        TwoSum_LC s= new TwoSum_LC();
       System.out.println( s.twoSum(nums,target));
    }
}