package InterviewCake;

import java.util.Stack;

/**
 * Created by rex on 6/29/17.
 */
public class ProblemTwentyNine {

    public static void main(String[] args) {

    }

    public static boolean balancedParenthesis(String parens){
        Stack<Character> openParenthesisStack = new Stack<>();
        Stack<Character> openBracketStack = new Stack<>();
        Stack<Character> openCurlyBracketStack = new Stack<>();

        char[] chars = parens.toCharArray();

        for(int i = 0; i < chars.length; i++){
            switch (chars[i]){
                case '(':
                    openParenthesisStack.push(chars[i]);
                    break;
                case ')':
                    if(openParenthesisStack.isEmpty()){
                        return false;
                    }else{
                        openParenthesisStack.pop();
                        break;
                    }
                case '[':
                    openBracketStack.push(chars[i]);
                    break;
                case ']':
                    if(openBracketStack.isEmpty()){
                        return false;
                    }else{
                        openBracketStack.pop();
                        break;
                    }
                case '{':
                    openCurlyBracketStack.push(chars[i]);
                    break;
                case '}':
                    if(openCurlyBracketStack.isEmpty()){
                        return false;
                    }else{
                        openCurlyBracketStack.pop();
                        break;
                    }

            }
        }
        return openParenthesisStack.isEmpty() && openBracketStack.isEmpty() && openCurlyBracketStack.empty();
    }

}
