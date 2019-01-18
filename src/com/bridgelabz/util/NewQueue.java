package com.bridgelabz.util;

public class NewQueue<T> {
	
	    public NewNode<T> front,rear;
	    public static int size=0;
	   
	    public NewQueue(){
	        front=null;
	        rear=null;
	        size=0;
	    }
	   
	    public boolean isQueueEmpty(){
	        return front==null;
	    }
	   
	    public int getSize(){
	        return size;
	    }
	   
	    public void enqueue(T data){
	    	 NewNode<T> node=new  NewNode<T>(data,null);
	        if(rear==null){
	            front=node;
	            rear=node;
	        }
	        else{
	            rear.setNextRef(node);
	            rear=rear.getNextRef();
	        }
	        size++;
	    }
	   
	    public T dequeue(){
	        if(isQueueEmpty())
	        {
	            System.out.println("Underflow");
	        }
	        NewNode<T> curr=front;
	        front = curr.getNextRef();       
	        if (front == null){
	            rear = null;
	            size-- ;
	        }
	        return curr.getValue();
	    }
	   
	    public void display(){ 
	        if(isQueueEmpty()){
	            System.out.println("Queue is empty");
	            return;
	        }
	        else{
	        	 NewNode<T> tNode=front;
	            while(tNode!=null){
	                System.out.print(tNode.getValue()+" ");
	                tNode=tNode.getNextRef();
	            }
	           
	        }
	    }
	     
	     
	}


		


