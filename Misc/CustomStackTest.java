public class CustomStackTest {

    public static void main( String args[]){
        CustomStack cs= new CustomStack(100);
      /*  System.out.println(cs.seek());
        cs.push(23);
        cs.push(43);
        cs.push(76);
        System.out.println(cs.pop());
        System.out.println(cs.getSize());
        System.out.println(cs.pop()); */

      cs.push(90);
      cs.push(80);
      System.out.println(cs.seek());
      System.out.println(cs.pop());
      System.out.println(cs.getSize());
    }
}
