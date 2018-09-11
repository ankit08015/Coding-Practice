import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        Arrays.sort(candidates);
        List<List<Integer>> list= new ArrayList<>();
        combinationSum(list, new ArrayList<>(),candidates, target, 0);
        return list;

    }
    public void combinationSum(List<List<Integer>> list, ArrayList<Integer> temp, int[] candidates, int sum, int start){
        if(sum<0)return;
        else if(sum==0)list.add(temp);

        else {
            for (int i = start; i < candidates.length; i++) {
                temp.add(candidates[i]);
                combinationSum(list, temp, candidates, sum - candidates[i], i);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
