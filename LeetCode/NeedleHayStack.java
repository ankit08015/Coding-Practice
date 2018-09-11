public class NeedleHayStack {
        public int strStr(String haystack, String needle) {

            int len= haystack.length();

            int i=0,j=0,start=0;

            while(i<len){
                if(j==needle.length())return start;
                if(haystack.charAt(i)==needle.charAt(j)&&j<needle.length()){
                    if(j==0)start=i;
                    i++;
                    j++;
                }
                else{
                    i++;
                    j=0;
                }
        }
        return -1;
    }

    public static void main(String args[]){
            String haystack="helollo";
            String needle="holl";

            NeedleHayStack nh= new NeedleHayStack();

            System.out.println(nh.strStr(haystack,needle));
    }
}
