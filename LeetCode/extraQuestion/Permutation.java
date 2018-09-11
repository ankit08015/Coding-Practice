package extraQuestion;

public class Permutation {
    public static void main(String args[]){
        String str="aac";


        Permutation p= new Permutation();
        p.permutation(str);

    }

    public void permutation(String str){
        int len= str.length();

        permute(str, 0, len-1);

    }

    public void permute(String str, int l, int r){
        if(l==r)System.out.println(str);

        else{
            for(int i=l;i<=r;i++){
                str= swap(str, l, i);
                permute(str, l+1, r);
                //str= swap (str, l, i);
            }
        }
    }

    public String swap(String s,int i, int j){
        char [] chArr= s.toCharArray();

        char temp= chArr[i];
        chArr[i] = chArr[j];
        chArr[j]= temp;

        return String.valueOf(chArr);
    }
}
