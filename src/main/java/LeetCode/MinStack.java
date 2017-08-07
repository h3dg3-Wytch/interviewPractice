package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Created by h3dg3wytch on 8/4/17.
 */
public class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    private int currentMin;

    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();

        this.currentMin = Integer.MAX_VALUE;

    }

    public void push(int x) {

        if(x <= currentMin){
            minStack.push(currentMin);
            currentMin = x;
        }

        stack.push(x);

    }

    public void pop() {

        if(stack.isEmpty()){
            return;
        }
        int value = stack.pop();

        if(value == currentMin ){
            currentMin = minStack.pop();
        }

    }

    public int top() {

        return stack.peek();

    }

    public int getMin() {

        return currentMin;

        new ArrayList<>().to

    }
}
