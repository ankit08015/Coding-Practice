import java.util.ArrayList;
import java.util.HashMap;

public class TwoSums {


        public int[] twoSum(int[] nums, int target) {

            int [] res=new int[2];

            HashMap<Integer, Integer> one= new HashMap<>();

            for(int i=0;i<nums.length;i++){
                if(one.containsKey(target-nums[i])){
                    res[0]=i;
                    res[1]=one.get(target-nums[i]);
                    break;
                }
                else{
                    one.put(nums[i], i);
                }
            }



            return res;
        }
    }

