public class RemoveElement {
    public int removeElement(int[] nums, int val) {

//        int i = 0, j = 0, count = 0;
//        while (j < nums.length && i < nums.length) {
//            if (nums[i] == val) {
//                i++;
//            } else {
//                // while(nums[j]==val&& j<nums.length)j++;
//                nums[j++] = nums[i++];
//
////               if(j<i){
////                   j=i;
////
////               }
//
//            }
//        }
//
////            for(int j=0;j<nums.length;j++){
////                if(nums[j]!=val){
////                    nums[i]=nums[j];
////                    i++;
////                }
////            }
//
//
//            return j;

        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        return n;

    }

    public static void main(String args[]){
        int[] nums={0,1,2,3};
        int val=0;

        //nums = [3,2,2,3], val = 3,

        RemoveElement rs= new RemoveElement();

        int newLen= rs.removeElement(nums,val);

        System.out.println(newLen);

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

        System.out.println();

        for(int i=0;i<newLen;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
