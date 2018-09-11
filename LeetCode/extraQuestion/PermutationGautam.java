package extraQuestion;

import java.util.ArrayList;
import java.util.List;

public class PermutationGautam {

    public static void main(String args[]){
        List<Integer> list= new ArrayList<>();

        PermutationGautam p= new PermutationGautam();

        int[] nums= {1,2,3};

        p.permute(nums);


    }

    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        resPer(nums, temp, result,0 );

        System.out.println(result);
        return result;
    }

    public void resPer(int[]  nums, List<Integer> temp, List<List<Integer>> result, int start){

        if(temp.size()==nums.length){
            result.add(new ArrayList<>(temp));
        }


        for(int i=0;i<nums.length;i++){
            if(temp.size()!=i+1)continue;
            temp.add(nums[i]);
            resPer(nums, temp, result, i+1);
            temp.remove(temp.size()-1);
        }
    }
}
