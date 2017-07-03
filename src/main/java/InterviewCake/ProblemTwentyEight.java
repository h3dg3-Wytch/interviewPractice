package InterviewCake;

import java.util.Stack;

/**
 * Created by rex on 6/29/17.
 */
public class ProblemTwentyEight {


    public static void main(String[] args) {
        String string = "()";
        System.out.println(parenthesisIndex(string,0));
    }

//    public static boolean balancedParenthesis(String parens){
//        Stack<Character> openParenthesisStack = new Stack<>();
//        char[] chars = parens.toCharArray();
//
//        for(int i = 0; i < chars.length; i++){
//            switch (chars[i]){
//                case '(':
//                    openParenthesisStack.push(chars[i]);
//                    break;
//                case ')':
//                    if(openParenthesisStack.isEmpty()){
//                        return false;
//                    }else{
//                        openParenthesisStack.pop();
//                        break;
//                    }
//            }
//        }
//        return openParenthesisStack.isEmpty();
//    }

    public static boolean parenthesisIndex(String parens, int position){
        Stack<Character> openParenthesisStack = new Stack<>();
        char[] chars = parens.toCharArray();

        int index = position;

        for(int i = position; i < chars.length; i++){
            switch (chars[i]){
                case '(':
                    openParenthesisStack.push(chars[i]);
                    position++;
                    break;
                case ')':
                    if(openParenthesisStack.isEmpty()){
                        return false;
                    }else{
                        openParenthesisStack.pop();
                        break;
                    }
            }
        }
        return openParenthesisStack.isEmpty();
    }
}
