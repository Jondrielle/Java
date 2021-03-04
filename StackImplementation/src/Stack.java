class Stack {
    private int top = -1;
    int stack[] = new int[30];

    public void push(int item){
        top++;
        stack[top] = item;
    }

    public void pop(){
        while(top != 0){
            top--;
        }
    }

    public int peek(){
       if(top == -1)
           return 0;
       else
          return top;
    }

    public int isEmpty(){
        return top = -1;
    }
}
