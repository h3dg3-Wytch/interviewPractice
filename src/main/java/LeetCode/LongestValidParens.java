package LeetCode;

import java.util.Stack;

/**
 * Created by h3dg3wytch on 8/3/17.
 */
public class LongestValidParens {

    public static void main(String[] args) {

        System.out.println(longestValidParentheses("(()()"));

    }
    public  static int longestValidParentheses(String s) {

        int validParents = 0;

        Stack<Character> stack = new Stack();
        for(int i = 0; i <s.length(); i++){

            if(s.charAt(i) == '('){
                stack.push('(');
            }

            if(s.charAt(i) == ')'){
                if (!stack.isEmpty()){
                    stack.pop();
                    int temp = 1;
                    while (!stack.isEmpty()){
                        stack.pop();
                        temp++;

                    }

                    validParents = Math.max(temp, validParents);
                }
            }

        }
        return validParents;
    }

}
