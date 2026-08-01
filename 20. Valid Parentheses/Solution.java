import java.util.Stack;
public class Solution {
    public boolean isValid(String s) {
         Stack <Character> res = new Stack<>();
         for(int i =0 ; i<s.length() ; i++){
            if(s.charAt(i)=='('  || s.charAt(i)=='{' || s.charAt(i)=='[')
                res.push(s.charAt(i));   // push elements to stack

            else if (s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']')
            {
                if(res.isEmpty()) //Checks for Open Parenthesis return false if no open parenthesis
                    return false;
                
                char temp= s.charAt(i); //stores current Parenthesis
                char peek1=res.peek(); // stores top of the stack
                
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
         return res.isEmpty(); //returns true if stack is empty, else false
         }
        }