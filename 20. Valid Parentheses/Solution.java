import java.util.Stack;
public class Solution {
    public boolean isValid(String s) {
         Stack <Character> res = new Stack<>();
         for(int i =0 ; i<s.length() ; i++){
            if(s.charAt(i)=='('  || s.charAt(i)=='{' || s.charAt(i)=='[')
                res.push(s.charAt(i));    
            else if (s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']')
            {
                if(res.isEmpty())
                    return false;
                char temp= s.charAt(i);
                if (res.peek()=='(' && temp==')')
                    res.pop();
                else if (res.peek()=='{' && temp=='}')
                    res.pop();
                else if (res.peek()=='[' && temp==']')
                    res.pop();
                else 
                 return false;
            }
            }
         return res.isEmpty();
         }
        }