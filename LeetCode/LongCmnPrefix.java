public class LongCmnPrefix {
    public String longestCommonPrefix(String[] strs) {

        int len= strs.length;

        int start=0;int end=0;

        int i=0;
       while(i<len&&end<strs[0].length()){
           if(end>=strs[i].length())break;
           if(strs[0].charAt(end)==strs[i].charAt(end)&&i!=len-1){
               i++;
               continue;
           }
           else if(strs[0].charAt(end)==strs[i].charAt(end)&&i==len-1){
               i=0;
               end=end+1;

           }
           else break;
       }

       return strs[0].substring(start,end);


    }

    public static void main(String args[]){
        String[] strs= {};

        LongCmnPrefix ls= new LongCmnPrefix();

        System.out.println(ls.longestCommonPrefix(strs));

    }
}
