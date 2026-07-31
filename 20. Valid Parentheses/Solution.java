import java.util.Stack;
public class Solution {
    public boolean isValid(String s) {
         Stack <Character> res = new Stack<>();
         for(int i =0 ; i<s.length() ; i++){
            if(s.charAt(i)=='('  || s.charAt(i)=='{' || s.charAt(i)=='[')
                res.push(s.charAt(i));    
            else if (s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']')
            {
                char temp= s.charAt(i);
                if(res.isEmpty())
                    return false;
                char peek1=res.peek();
                if (peek1=='(' && temp==')')
                    res.pop();
                else if (peek1=='{' && temp=='}')
                    res.pop();
                else if (peek1=='[' && temp==']')
                    res.pop();
                else 
                 return false;
            }
            }
         return res.isEmpty();
         }
        }