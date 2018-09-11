public class Reverse {
    public int reverse(int x) {
        if(x/10==0)return (int)x;

        if(x>Integer.MAX_VALUE||x<Integer.MIN_VALUE)return 0;

        while(x%10==0){
            x=x/10;
        }

        int y=x;

        y=Math.abs(y);
        int ans=0;
        while(y>0){
            ans=ans*10+y%10;
            y=y/10;
        }

        if(x<0)ans=ans*(-1);

        return (int)ans;
    }

    public static void main(String args[]){
        int x=1534236469;

        Reverse ra= new Reverse();
        int ans= ra.reverse(x);

        System.out.println(ans);

    }
}
