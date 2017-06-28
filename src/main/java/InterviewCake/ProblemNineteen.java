package InterviewCake;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by rex on 6/27/17.
 */
public class ProblemNineteen {

    public static void main(String[] args) {
        StackQueue stackQueue = new StackQueue();

        for(int i = 0; i < 100; i++){
            stackQueue.enqueue(i);
        }

        for(int i = 0; i < 50; i++){
            System.out.println(stackQueue.dequeue());
        }

        stackQueue.enqueue(5);
        for(int i = 0; i < 50; i++){
            System.out.println(stackQueue.dequeue());
        }


        System.out.println(stackQueue.dequeue());
    }


    public static class StackQueue{

        private Stack<Integer> firstStack;
        private Stack<Integer> secondStack;

        private boolean onFirstStack;

        public StackQueue(){
            this.firstStack = new Stack<>();
            this.secondStack = new Stack<>();
            this.onFirstStack = true;
        }

        public void enqueue(int n){


            if(onFirstStack){
                firstStack.add(n);
            }else{
                while (!secondStack.empty()){
                    int i = secondStack.pop();
                    firstStack.push(i);
                }
                firstStack.push(n);
                onFirstStack = true;
            }

        }

        public int dequeue() {

            int i = 0;

            if (onFirstStack) {


                while (!firstStack.empty()) {
                    i = firstStack.pop();
                    secondStack.push(i);
                }
                onFirstStack = false;
                return secondStack.pop();
            } else {
                return !secondStack.empty()? secondStack.pop(): -1;
            }
        }
    }
}
