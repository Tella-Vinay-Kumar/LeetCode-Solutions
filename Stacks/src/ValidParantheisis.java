import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{' )
            {
                stack.push(s.charAt(i));
            }
            else if(stack.isEmpty())
            {
                return false;
            }
            else 
            {
                char popped = stack.pop();
                if(popped=='(' && s.charAt(i)!=')' ||popped=='[' && s.charAt(i)!=']' || popped=='{' && s.charAt(i)!='}' )
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
