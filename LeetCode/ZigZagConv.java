public class ZigZagConv {
    public String convert(String s, int numRows) {
        if(numRows<2)return s;

        char[][] table= new char[numRows][s.length()];
        String res="";

        int i=0, j=0;

        int k=0;



        while(k<s.length()){
            if(i<numRows&&j%(numRows-1)==0){
                table[i++][j]=s.charAt(k++);
            }
            else if(i==numRows){
                i-=2;
                j++;
            }
            else if(i>0){
                table[i--][j++]=s.charAt(k++);
            }
            else if(i<0){
                j--;
                i=0;
            }
        }

        for(int m=0;m<numRows;m++){
            for(int  n=0;n<s.length();n++){
               System.out.print(table[m][n]);
                if(table[m][n]!='\u0000')
                res=res+table[m][n];
            }
            System.out.println();
        }

return res;

    }

    public static void main(String args[]){
        String s= "ABCD";
        ZigZagConv z= new ZigZagConv();

        String res= z.convert(s, 2);
        System.out.println(res);

    }
}
