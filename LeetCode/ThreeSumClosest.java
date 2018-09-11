import java.util.Arrays;

public class ThreeSumClosest {
        public int threeSumClosest(int[] nums, int target) {
            int res= Integer.MAX_VALUE;
            Arrays.sort(nums);

            for(int i=0;i<nums.length-2;i++){
                int sum=0;
                int l=i+1;
                int h=nums.length-1;
                while(l<h){
                    sum= nums[i]+nums[l]+nums[h];

                    if(sum>target)h--;
                    else l++;
                }
                res=(Math.min(Math.abs(sum-target), Math.abs(res-target)));

        }

        return res;
    }
}
