public class MultiplyStrings {
    public String multiply(String num1, String num2) {


        if(num1.equals("0")||num2.equals("0"))return "0";
        int len1=num1.length();
        int len2=num2.length();

        String ans="";
        for(int i=len1-1;i>=0;i--){
            int l=Character.getNumericValue(num1.charAt(i));
            int res=0,carry=0;
            String temp="";
            for(int j= len2-1;j>=0;j--){
                int m= Character.getNumericValue(num2.charAt(j));
                res= (l*m+carry)%10;
                carry=(l*m + carry)/10;
                temp= res+temp;
            }
            if(carry!=0)temp=carry+temp;
            int zero=len1-(i+1);
            while(zero>0){
                temp=temp+'0';
                zero--;
            }
            ans= addString(ans,temp);

        }

        return ans;


    }

    public String addString(String num1,String num2){
        if(num1.equals(""))return num2;

        int len1=num1.length();
        int len2=num2.length();

        String ans="";

        int sum=0,carry=0;
        while(len1>0||len2>0){
            int a=0,b=0;
            if(len1>0)a= Character.getNumericValue(num1.charAt(--len1));
            if(len2>0)b= Character.getNumericValue(num2.charAt(--len2));
            sum=(a+b+carry)%10;
            carry=(a+b+carry)/10;
            ans=sum+ans;

        }
        if(carry!=0)ans=carry+ans;

        return ans;

    }

    public static void main(String args[]){
        MultiplyStrings ms= new MultiplyStrings();

        System.out.println(ms.multiply("123", "456"));
    }
}
