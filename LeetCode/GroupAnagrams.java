import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> list = new ArrayList<>();
        HashMap<String, List> map = new HashMap<>();

        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String newStr = Arrays.toString(c);
            if (map.containsKey(newStr)) {
                map.get(newStr).add(s);
            } else {
                List<String> nl = new ArrayList<>();
                nl.add(s);
                map.put(newStr, nl);
            }
//            int i=0;
//            boolean found=false;
//            for(List<String> l:list){
//               if(l.contains(newStr))
//               {l.add(s);
//               found=true;
//               break;}
//            }
//            if(!found){
//                List<String> nl= new ArrayList<>();
//                nl.add(newStr);
//                nl.add(s);
//                list.add(nl);
//            }
//
//        }
//        for(List<String> l:list){
//            l.remove(0);
//        }
        }

            //System.out.println(map.values());
            return new ArrayList(map.values());

    }

    public static void main(String args[]){
        String[] strs= {"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagrams ga= new GroupAnagrams();

        ga.groupAnagrams(strs);

    }
}
