package com.bridgelabz.util;

public class MyGenericsStack<T extends Object> {
 
    private int stackSize;
    private T[] stackArr;
    private int top;
    private int size=0;
     
    /**
     * constructor to create stack with size
     * @param size
     */
    @SuppressWarnings("unchecked")
    public MyGenericsStack(int s) {
        this.stackSize = s;
        this.stackArr = (T[]) new Object[stackSize];
        this.top = -1;
    }
 
    /**
     * This method adds new entry to the top
     * of the stack
     * @param entry
     * @throws Exception
     */
    public void push(T entry){
        if(this.isStackFull()){
            System.out.println(("Stack is full. Increasing the capacity."));
            this.increaseStackCapacity();
        }
       
        this.stackArr[++top] = entry;
        size++;
        
    }
 public int size()
 {
	 return size;
 }
    /**
     * This method removes an entry from the
     * top of the stack.
     * @return
     * @throws Exception
     */
    public T pop() throws Exception {
        if(this.isStackEmpty()){
            throw new Exception("Stack is empty. Can not remove element.");
        }
        T entry = this.stackArr[top--];
       
        return entry;
    }
     
    /**
     * This method returns top of the stack
     * without removing it.
     * @return
     */
    public T peek() {
        return stackArr[top];
    }
 
    private void increaseStackCapacity(){
         
        @SuppressWarnings("unchecked")
        T[] newStack = (T[]) new Object[this.stackSize*2];
        for(int i=0;i<stackSize;i++){
            newStack[i] = this.stackArr[i];
        }
        this.stackArr = newStack;
        this.stackSize = this.stackSize*2;
    }
     
    /**
     * This method returns true if the stack is
     * empty
     * @return
     */
    public boolean isStackEmpty() {
        return (top == -1);
    }
 
    /**
     * This method returns true if the stack is full
     * @return
     */
    public boolean isStackFull() {
        return (top == stackSize - 1);
    }
}
	