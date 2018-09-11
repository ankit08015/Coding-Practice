public class CountAndSay {
    public String countAndSay(int n) {
        String ans="1";

        int i=1;

        while(i<n){
            String newAns="";
            int count=0;
            char c=ans.charAt(0);
            for(int j=0;j<ans.length();j++){
                if(c==ans.charAt(j))count++;
                else{
                    newAns=newAns+count+c;
                    count=1;
                    c=ans.charAt(j);
                }
            }
            newAns=newAns+count+c;
            ans=newAns;
            i++;
        }
        return ans;
    }

    public static void main(String args[]){
        CountAndSay cs= new CountAndSay();
        System.out.println(cs.countAndSay(5));


    }
}
