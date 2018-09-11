import java.util.Stack;

public class NextPermutation {
        public void nextPermutation(int[] nums) {

//            int len= nums.length;
//
//            boolean done= false;
           // int i=len-1;
          //  len=len-2;
            int start=0;
            int end= nums.length;
            if(nums.length<=1)return;
            if(nums.length==2){
                int t= nums[0];
                nums[0]=nums[1];
                nums[1]=t;
                return;
            }
//            while(done==false&&len>=0){
//
//                if(nums[len]<nums[i]){
//                    int temp = nums[i];
//                    nums[i]= nums[len];
//                    nums[len]=temp;
//                    done = true;
//                    start=len+1;
//                }
//                else if(i-len==1){
//                    len--;
//                }
//                else{
//                    i--;
//                    len=i-1;
//                }
//            }
            int l= nums.length;

            while(l>1) {
                if (nums[l - 2] < nums[l - 1]) {

                    start=l-1;
                    break;
                }
                else l--;
            }
            //System.out.println(l);
            int loc=0;

           int small= 0;
            if(l-2<0)small=0;
            else {
                small=nums[l-2];
                int min=Integer.MAX_VALUE;

                for(int i= l-1;i<nums.length;i++){
                    if(nums[i]-small>0){
                        if(nums[i]-small<min){
                            min=nums[i]-small;
                            loc=i;
                        }
                    }
                }


                int temp=nums[l-2];
                nums[l-2]=nums[loc];
                nums[loc]=temp;
            }

//            Stack<Integer> s = new Stack<Integer>();
//            for(int i=l-1;i<nums.length;i++ ){
//             if(nums[i]>max){
//                 if(s.isEmpty()) {
//                     s.push(nums[i]);
//                     loc = i;
//                 }
//                 }
//                 else{
//                     int element= s.peek();
//                     if(element>nums[i]){
//                         s.pop();
//                         s.push(nums[i]);
//                          loc=i;
//                     }
//                 }
//             }



            sort(nums,start, end);



    }

    public static void sort(int[] nums, int start, int end){


        for (int i = start+1; i < end; i++)
        { // Insert a[i] among a[i-1], a[i-2], a[i-3]... ..
            for (int j = i; j > start &&  nums[j]<nums[j-1]; j--) {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
            }
        }
    }

    public static void main(String args[]){
            int[] nums= {1,2,3};
            NextPermutation np= new NextPermutation();

            // {4,2,0,2,3,2,0};

            np.nextPermutation(nums);

            for(int i:nums){
                System.out.print(i+" ");
            }
    }
}
