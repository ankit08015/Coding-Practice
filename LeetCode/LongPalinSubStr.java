public class LongPalinSubStr {

    public String longestPalindrome(String s) {

        int len = s.length();
        if(len<=1)return s;

        String str =null;

        int[][] dp= new int [len][len];

        for (int i=0;i<len;i++){
            for (int j=0;j<len;j++){
                dp[i][j]=0;
            }
        }

        for(int i=0;i<len;i++){
            dp[i][i]=1;
        }
        int start=0;int end=0;

        for(int i=len-1;i>=0;i--){
            for(int j=i+1;j<len;j++){
                if(s.charAt(i)==s.charAt(j)){
                    if(j-i+1<=3){
                        dp[i][j]=1;
                        if(end-start+1<j-i+1){
                            start=i;
                            end=j;
                        }
                    }
                    else{
                        dp[i][j]=dp[i+1][j-1];
                        if(dp[i][j]==1&&end-start+1<j-i+1){
                            start=i;
                            end=j;
                        }
                    }
                }
                else{
                    dp[i][j]=0;
                }
            }
        }


        System.out.println("Start: "+start);
        System.out.println("End: "+end);


        return s.substring(start,end+1);
    }

    public static void main(String args[]){
        String s="babad";

        LongPalinSubStr l= new LongPalinSubStr();
        System.out.println(l.longestPalindrome(s));
    }
}
