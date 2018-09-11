package HackerRank.DataStructure;

public class HashCodeTest {

    private int i;
    private double k;
    private char l;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HashCodeTest that = (HashCodeTest) o;

        if (i != that.i) return false;
        if (Double.compare(that.k, k) != 0) return false;
        if (l != that.l) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = i;
        temp = Double.doubleToLongBits(k);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) l;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public static String mystery(String str){
        int N= str.length();
        if(N<=1) return str;

        String a= str.substring(0,N/2);
        String b= str.substring(N/2, N);
        System.out.println("a: "+a+ " b: "+b);
        return mystery(a)+mystery(b);

    }

    public static void main(String args[]){
        HashCodeTest ht= new HashCodeTest();

        System.out.println(mystery("hello"));

    }
}
