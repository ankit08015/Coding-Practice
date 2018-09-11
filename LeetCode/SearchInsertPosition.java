public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if(target<nums[0])return 0;
        if(target>nums[nums.length-1])return nums.length;
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(start<=end){
            mid= (start+end)/2;
            if(nums[mid]==target)return mid;

            else if(nums[mid]>target)end=mid-1;
            else start=mid+1;
        }

//        System.out.println("Start: "+start);
//        System.out.println("End: "+end);
//
//        System.out.println("Mid: "+mid);


        return end+1;

    }
    public static void main(String[] args){
        int[] nums={3,5,7, 66, 99, 900};
        int target= 4;
        SearchInsertPosition sip= new SearchInsertPosition();
        System.out.println(sip.searchInsert(nums,target));
    }
}
