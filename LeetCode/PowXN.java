public class PowXN {
        public double myPow(double x, int n) {
            double result = 1.0;
            for(int i = n; i != 0; i /= 2, x *= x) {
                if( i % 2 != 0 ) {
                    result *= x;
                }
            }
            return n < 0 ? 1.0 / result : result;



//            if(n==0)return 1;
//            boolean isNeg=false;
//            if(n<0)isNeg=true;
//            n=n*(-1);
//
//            double ans=1;
//            for(int i=0;i<n;i++){
//                ans=ans*x;
//
//        }
//
//
//        if(isNeg)return 1/ans;
//            else return ans;
    }

    public static void main(String args[]){
            double x= 2.0000;
            int n= -2;

            PowXN pow= new PowXN();

            System.out.println(pow.myPow(x,n));
    }
}
