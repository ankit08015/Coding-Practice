import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length-2; i++) {
            int l = i + 1;
            int h = nums.length - 1;
            int sum=0-nums[i];
            while (l < h) {
                if (nums[l] + nums[h] ==sum) {
                    ArrayList<Integer> temp= new ArrayList<>(Arrays.asList(nums[l], nums[h], nums[i]));
                    if(!res.contains(temp))res.add(temp);
                    l++;
                    h--;
                } else if (nums[l] + nums[h] <sum) l++;
                else h--;

            }


        }

        return res;
    }

    public static void main(String args[]){
        ThreeSum ts= new ThreeSum();
        int[] nums= {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        System.out.println(ts.threeSum(nums));
    }
}

