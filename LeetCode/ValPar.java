import java.util.Stack;

public class ValPar {
        public boolean isValid(String s) {
            if(s.length()%2==1)return false;

//            int start=0,end=s.length()-1;
//
//            while(start<end){
//                if(s.charAt(start)=='('&&s.charAt(end)==')'){
//                    start++;
//                    end--;
//            }
//            else      if(s.charAt(start)=='['&&s.charAt(end)==']'){
//                    start++;
//                    end--;
//                }
//                else      if(s.charAt(start)=='{'&&s.charAt(end)=='}'){
//                    start++;
//                    end--;
//                }
//                else return false;
//
//        }
//        return true;
//            int count=s.length()/2+1;

//            while(!s.equals("")&&count>0){
//                if(s.contains("()")){
//                    s=s.replace("()","");
//                }
//                if(s.contains("[]")){
//                    s=s.replace("[]","");
//                }
//                if(s.contains("{}")){
//                    s=s.replace("{}","");
//                }
//                count--;
//            }
//
//            if(s.equals(""))return true;
//            else return false;

            Stack<Character> stack= new Stack<>();

            for(char c:s.toCharArray()){
                if(c=='(')stack.push(')');
                else if(c=='[')stack.push(']');
                else if(c=='{')stack.push('}');
                else{
                    if(stack.isEmpty()||stack.pop()!=c)return false;
                }
            }
            return stack.isEmpty();
    }

    public static void main(String args[]){
            String s="()([])";

            ValPar vp= new ValPar();
            System.out.println(vp.isValid(s));
    }
}
