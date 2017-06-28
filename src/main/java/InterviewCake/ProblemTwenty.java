package InterviewCake;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by rex on 6/28/17.
 */
public class ProblemTwenty {


    public static void main(String[] args) {
        MaxStack maxStack = new MaxStack();

        for(int i = 0; i < 100; i++){
            maxStack.push(i);
        }



        for(int i = 0; i < 100; i++){
            System.out.println(maxStack.getMax());
            maxStack.pop();
        }
    }

    public static class MaxStack{

        private int max;
        private Stack<Integer> stack;

        private List<Integer> oldMaxes;


        public MaxStack(){
            this.stack = new Stack<>();
            this.oldMaxes = new ArrayList<>();
            this.max = Integer.MIN_VALUE;
        }


        public void push(int n){
            if(max < n){
                oldMaxes.add(max);
                max = n;
            }
            stack.push(n);
        }

        public int pop(){
            int i = stack.pop();
            if(i == max){
               max = oldMaxes.get(oldMaxes.size() - 1);
               oldMaxes.remove(oldMaxes.size() - 1);
            }
            return i;
        }

        public int getMax(){
            return  max;
        }
    }
}
