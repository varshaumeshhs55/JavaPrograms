package com.bridgelabz.util;


	public class StackLinkedList <T>{

	    private NewNode<T> top;
	    private int size;
	  
	    public StackLinkedList(){
	        top=null;
	        size=0;
	    }
	  
	    public boolean isEmpty(){
	        return top==null;
	    }
	  
	    public int getSize(){
	        return size;
	    }
	  
	    public void push(T data){
	        NewNode<T> tnode=new NewNode<T>(data,null);
	        if(top==null)
	            top=tnode;
	        else{
	            tnode.setNextRef(top);
	             top = tnode;
	        }
	        size++;
	    }
	  
	    public T pop(){
	        if(isEmpty()){
	            System.out.println("No elements");
	            return null;
	        }
	        NewNode<T> tnode=top;
	        top=tnode.getNextRef();
	        size--;
	        return tnode.getValue();
	    }
	}


		


