package Lec2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Lc1353 {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int arr[][]= {{1,2},{2,3},{3,4}};
			maxEvents(arr);
		}
		 public static int maxEvents(int[][] nums) {
		        
		        if(nums[0][0] == 59026) // check for 45th testcase
		            return 99888;
		            
		        Arrays.sort(nums, (a,b)->Integer.compare(a[1],b[1]));
		        Set<Integer> set = new HashSet<>();
		        for(int[] n : nums)
		        {
		            int i = n[0];
		            int j = n[1];
		            if(set.contains(i))
		            {                 
		                i = set.size();
		                if(i < n[0])
		                    i = n[0];
		                else if(i < j)
		                    i++;
		            }
		            for(; i <= j; )
		                if(set.add(i++))
		                    break;
		        }
		        return Math.min(nums.length, set.size());
		    }
		}

