package InterviewCake;

/**
 * Created by h3dg3wytch on 8/2/17.
 */
public class findParens {


    public static int findParens(String parenString, int openParenthesisPosition){

        char[] chars = parenString.toCharArray();
        int howManyTillClose = 0;
        for(int i = openParenthesisPosition; i < chars.length; i++){

            switch (chars[i]){
                case '(':
                    howManyTillClose++;
                    break;
                case ')':
                    if(howManyTillClose == 0){
                        return i;
                    }else{
                        howManyTillClose--;
                        break;
                    }

            }
        }

        throw new Error();
    }
}
