public class FirstAndLastSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int start=0;
        int end = nums.length-1;
        int[]ans=new int[2];

        //get start index
        while(start<=end){
            int mid=(start+end)/2;

            if(nums[mid]==target&&(mid==0||nums[mid-1]<target)){
                ans[0]=mid;
                break;
            }
            else if(target>nums[mid])start=mid+1;
            else end=mid-1;
        }

        start=0;
        end=nums.length-1;

        //get end index
        while(start<=end){
            int mid=(start+end)/2;

            if(nums[mid]==target&&(mid==nums.length-1||nums[mid+1]>target)){
                ans[1]=mid;
                break;
            }
            else if(target<nums[mid])end=mid-1;
            else start=mid+1;
        }


        return ans;
    }
    public static void main(String args[]){
        int[] nums={1};
        int target=1;
        FirstAndLastSortedArray fa= new FirstAndLastSortedArray();
        int[] ans= fa.searchRange(nums,target);

        System.out.println("[ "+ans[0]+", "+ans[1]+"]");


    }
}
