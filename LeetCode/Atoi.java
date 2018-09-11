class Atoi {
    public int myAtoi(String str) {

        int len= str.length();

        int y=0;
        int sign=0;
        String ans="";

        while(y<len){
            if(str.charAt(y)==' ' && ans=="" &&sign==0)y++;
            else if(str.charAt(y)=='-'&& sign==0 && ans=="" ){
                y++;
                sign=1;
            }
            else if(str.charAt(y)=='+'&& sign==0 && ans=="" ){
                y++;
                sign=2;
            }
            else if(str.charAt(y)>=48&&str.charAt(y)<=57){
                ans=ans+str.charAt(y++);

            }
            else{
                break;
            }

        }

        System.out.println(ans + " "+sign);

        if(ans=="")return 0;
        int an=0;

        try{
            an= Integer.parseInt(ans);
            if(sign==1)return (int)an*(-1);
            else return (int)an;
        }catch(Exception e){
            if(sign==1)return Integer.MIN_VALUE;
            else return Integer.MAX_VALUE;
        }





    }

    public static void main(String args[]){
        String s="-91283472332";

        Atoi ai= new Atoi();

        System.out.println(ai.myAtoi(s));
    }
}
