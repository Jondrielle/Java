package com.Jondrielle;
    public class Stack {
        private int top = -1;
        private int[] stack;
        private static final int INITIAL_SIZE = 2;

        public Stack() {
            stack = new int[INITIAL_SIZE];
        }

        public void push(int item){
            if(top == INITIAL_SIZE - 1){
                doubleCapacity();
            }
            top++;
            stack[top] = item;
        }

        public int pop() {
            int popped = 0;
            if(top >= 0) {
                popped = stack[top];
                top--;
            }
            return popped;
        }

        public int peek(){
            if(top == -1)
                return 0;
            else
                return stack[top];
        }

        public void isEmpty(){
            if(top == -1);
        }

        private void doubleCapacity(){
            int newSize = INITIAL_SIZE * 2;
            var newStack = new int[newSize];
            for(int i = 0; i < stack.length; i++)
                newStack[i] = stack[i];
            stack = newStack;
        }

    public static void main(String[] args) {
        // write your code here
        Stack stack = new Stack();
        stack.push(10);
        stack.push(40);
        stack.push(100);
        stack.pop();
        stack.pop();
        stack.peek();
        System.out.println(stack.isEmpty() + " ");
    }

}
