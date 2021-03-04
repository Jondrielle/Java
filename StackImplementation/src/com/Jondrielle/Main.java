package com.Jondrielle;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Stack stack = new Stack();
        stack.push(10);
        stack.push(40);
        stack.push(100);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.peek();
        System.out.println(stack.isEmpty() + " ");
    }

    static class Stack {
        private int top = -1;
        int[] stack = new int[30];

        public void push(int item){
            top++;
            stack[top] = item;
        }

        public void pop(){
            if(top != -1){
                stack[top] = 0;
                top--;
            }
        }

        public int peek(){
            if(top == -1)
                return 0;
            else
                return stack[top];
        }

        public boolean isEmpty(){
            return top == -1;
        }
    }
}
