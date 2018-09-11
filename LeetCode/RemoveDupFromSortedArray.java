public class RemoveDupFromSortedArray {
        public int removeDuplicates(int[] nums) {

            int len=0;

            int i=0;int j=1;

            while(j<nums.length){
                if(nums[i]==nums[j]){
                    j++;
                }
                else{
                    nums[i+1]=nums[j];
                    i++;
                    j++;
                    len++;
                }
            }

            return len+1;
        }

        public static void main(String args[]){
            int[] nums={0,0,1,1,1,2,2,3,3,4};

            RemoveDupFromSortedArray rs= new RemoveDupFromSortedArray();

            System.out.println(rs.removeDuplicates(nums));

            for(int i=0;i<nums.length;i++){
                System.out.print(nums[i]+" ");
            }
        }
    }
