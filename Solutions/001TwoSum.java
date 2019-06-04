import java.util.Arrays;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
    	int [] rtn = new int[2];
        for (int i=0; i<nums.length-1; i++) {
        	int temp=target-nums[i];
        	for (int j=i+1; j<nums.length; j++) {
        		if(temp==nums[j]) {
        			rtn[0] = i;
        			rtn[1] = j;
        			break;
        		}
        	}
        }
    	return rtn;
    }
	public static void main(String[] args) {
		System.out.println(Arrays.toString(new Solution().twoSum(new int[] {2, 7, 11, 15}, 9)));
	}

}
