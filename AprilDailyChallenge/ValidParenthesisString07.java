package AprilDailyChallenge;

/*
Given a string s containing only three types of characters: '(', ')' and '*', return true if s is valid.

The following rules define a valid string:
Any left parenthesis '(' must have a corresponding right parenthesis ')'.
Any right parenthesis ')' must have a corresponding left parenthesis '('.
Left parenthesis '(' must go before the corresponding right parenthesis ')'.
'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".

Example 1:              Example 2:              Example 3:
Input: s = "()"         Input: s = "(*)"        Input: s = "(*))"
Output: true            Output: true            Output: true

Constraints: 1 <= s.length <= 100 || s[i] is '(', ')' or '*'.
*/

import java.util.Stack;

public class ValidParenthesisString07 {
    public boolean checkValidString(String s) {
        int omin=0;
        int omax=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                omax++;
                omin++;
            }
            else if(s.charAt(i)==')'){
                omax--;
                omin--;
            }
            else{
                omax++;
                omin--;
            }
            if(omax<0){
                return false;
            }
            omin=Math.max(0,omin);
        }
        return omin==0;
    }
}

   /* public boolean checkValidString(String s) {
        Stack<Integer> open = new Stack<>();
        Stack<Integer> star = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                open.push(i);
            }else if(s.charAt(i) == '*'){
                star.push(i);
            }else{
               if(!open.isEmpty()){
                   open.pop();
               }else if(!star.isEmpty()){
                   star.pop();
               }else {
                   return false;
               }
            }
        }

        while(!open.isEmpty()){
            if(star.isEmpty()){
                return false;
            }else if(open.peek() < star.peek()){
                open.pop();
                star.pop();
            }else{ // --> open.peek() > star.peek()
                return false;
            }
        }
        return true;
    }*/


