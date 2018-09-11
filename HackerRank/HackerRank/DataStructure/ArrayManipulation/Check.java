package HackerRank.DataStructure.ArrayManipulation;
import java.util.*;

public class Check {

    public static void main(String args[]){

        ArrayList<Integer> list= new ArrayList<>();

        list.add(3);
        list.add(7);
        list.add(9);
        list.add(2);
        list.add(5);
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(11);

        System.out.println("Original List");

        System.out.println(list);




    /*    String str="hello dear";
        int n= str.value.length;

        char[] ch1= str.value; */



        if(list.size()%2==1)list.remove(list.size()-1);

      /*  for(int k: list){
            System.out.println(k);
        } */

      for(int i=0;i<list.size();i=i+2){
            if(list.get(i)>list.get(i+1)){
                list.remove(i);
                list.remove(i);
            }
        }

        Iterator<Integer> itr= list.iterator();

   /*    while(itr.hasNext()){
           if(itr.next()>itr.next()){
               itr.remove();

           }
       } */

        System.out.println("changed list");

      /*  for(int m: list){
            System.out.println(m);
        } */


        System.out.println(list);




    }
}
