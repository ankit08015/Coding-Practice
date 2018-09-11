import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            List<List<Integer>> list= new ArrayList<>();
            combinationSumII(list, new ArrayList<>(), candidates, target, 0);
            return list;

        }

        public void combinationSumII(List<List<Integer>> list, ArrayList<Integer> temp, int[] candidates, int sum, int start){
            if(sum<0)return;
            else if(sum==0)list.add(new ArrayList<>(temp));
            else{
                for(int i=start;i<candidates.length;i++){
                    if(i>start&&candidates[i]==candidates[i-1])continue; // skip duplicates
                    temp.add(candidates[i]);
                    combinationSumII(list, temp, candidates, sum-candidates[i], i+1);
                    temp.remove(temp.size()-1);
                }
            }
        }
    }

