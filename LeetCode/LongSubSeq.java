import java.util.HashMap;

import static java.lang.Math.max;

public class LongSubSeq {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        int len= s.length();
        HashMap<Character, Integer> hm= new HashMap<>();

        /*
        for(int i=0,j=0;j<len;j++){
            if(hm.containsKey(s.charAt(j))){
                ans=Math.max(ans,j-i+1);
                i=hm.get(s.charAt(j))+1;
                hm.put(s.charAt(j),j);
               // i=j;
            }
            else{
                hm.put(s.charAt(j),j);
                ans=Math.max(ans,(j+1)-i);
            }
        } */

        int start = 0, end = 0, max = 0;

        for(int i=0; i<len; i++)
        {
            if(hm.containsKey(s.charAt(i)))
            {
                int ind = hm.get(s.charAt(i));
                start = ind + 1;
                hm.put(s.charAt(i), i);
            }

            else{

                hm.put(s.charAt(i), i);
                end = i;

                if(end - start + 1 > max)
                    max = end - start + 1;
            }
        }




        return max;
    }

    public static void main(String args[]){
        String s="tmmzuxt";

        LongSubSeq l= new LongSubSeq();
        System.out.println(l.lengthOfLongestSubstring(s));
    }
}
