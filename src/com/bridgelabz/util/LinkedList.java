package com.bridgelabz.util;

import java.util.Scanner;

public class LinkedList<T> {
	
	

	    private NewNode<T> first;
	    private NewNode<T> last;

	    public boolean isEmpty(){
	        return first==null;
	    }
	    public void add(T t) {

	    	 NewNode<T> nd = new  NewNode<T>();
	        nd.setValue(t);
	        if (first == null) {
	            first = nd;
	            last = nd;
	        } else {
	            last.setNextRef(nd);
	            last = nd;
	        }
	    }

	    public int print() {

	    	 NewNode<T> tmp = first;
	        int i = 0;
	        while (true) {
	            if (tmp == null) {
	                break;
	            }
	            if(tmp.getValue()!=null)
	            {
	                System.out.println(tmp.getValue());
	                i++;
	            }
	            tmp = tmp.getNextRef();
	        }
	        return i;
	    }
	    public void clear() {

	    	 NewNode<T> tmp = first;
	        while (true) {
	            if (tmp == null) {
	                break;
	            }
	            if(tmp.getValue()!=null)
	            {
	                tmp.setValue(null);
	            }
	            tmp = tmp.getNextRef();
	        }
	    }
	    public void printNew() {

	    	 NewNode<T> tmp = first;
	        while (true) {
	            if (tmp == null) {
	                break;
	            }
	            if(tmp.getValue()!=null)
	            {
	                System.out.print(tmp.getValue()+" ");
	            }
	            tmp = tmp.getNextRef();
	        }
	    }
	    public LinkedList<Integer> getValue() {

	    	 NewNode<T> tmp = first;
	        LinkedList<Integer> node=new LinkedList<Integer>();
	        while (true) {
	            if (tmp == null) {
	                break;
	            }
	            if(tmp.getValue()!=null)
	            {
	                node.add((Integer) tmp.getValue());
	            }
	            tmp = tmp.getNextRef();
	        }
	        return node;
	    }
	    public int size() {

	    	 NewNode<T> tmp = first;
	        int i = 0;
	        while (true) {
	            if (tmp == null) {
	                break;
	            }
	            if(tmp.getValue()!=null)
	            {
	                i++;
	            }
	            tmp = tmp.getNextRef();
	        }
	        return i;
	    }

	    public boolean printValue(int length, String key, LinkedList<String> li) {
	    	 NewNode<T> nd2 = first;
	        while (true) {
	            if (nd2 == null) {
	                break;
	            }
	            if (key.compareToIgnoreCase(String.valueOf(nd2.getValue())) == 0) {
	                //                    int index=li.index(key);
	                //                    li.remove(index);
	                nd2.setValue(null);
	                return true;
	            }
	            nd2 = nd2.getNextRef();
	        }
	        li.add(key);
	        li.print();
	        return false;
	    }
	    public int index(T data){
	    	 NewNode<T> curr=first;
	        int count=0;
	        while(curr!=null){
	            if((String.valueOf(curr.getValue())).compareToIgnoreCase(String.valueOf(data))==0){
	                curr.getNextRef();
	                return count;
	            }
	            count++;
	            curr=curr.getNextRef();
	        }
	        assert(false);
	        return 0;
	    }

	    public void remove(int index){
	        if(isEmpty())
	            return;
	        NewNode<T> temp=first;
	        if(index==0){
	            first=temp.getNextRef();
	            return;
	        }
	        for(int i=0;temp!=null && i<index-1;i++){
	            temp=temp.getNextRef();
	        }
	        if (temp == null || temp.getNextRef() == null)
	            return;
	        @SuppressWarnings("unused")
	        NewNode<T> next = temp.getNextRef().getNextRef();

	        next=temp.getNextRef();
	    }
	    public int [] convInteger(LinkedList<Integer> li,int len)
	    {
	    	 NewNode<Integer> nd2 = li.first;
	        int [] arr=new int[len];
	        int i=0;
	        while (true) {
	            if (nd2 == null) {
	                break;
	            }
	            if(nd2.getValue()!=null)
	            {
	                arr[i++]=(int) nd2.getValue();
	                //                    i++;
	            }
	            nd2 = nd2.getNextRef();
	        }
	        return arr;
	    }

	    public int[] sortArray(int [] arr) {
	        int length = arr.length;
	        for (int i = 1; i < length; i++) {
	            int key = arr[i];
	            int j = i - 1;
	            while (j >= 0 && arr[j]>key) {
	                arr[j + 1] = arr[j];
	                j--;
	            }
	            arr[j + 1] = key;
	        }
	        return arr;
	    }

	    public boolean findIntegerValue(int length, int key, LinkedList<Integer> li2) {
	    	 NewNode<T> nd2 = first;
	        while (true) {
	            if (nd2 == null) {
	                break;
	            }
	            if (String.valueOf(key).compareToIgnoreCase(String.valueOf(nd2.getValue())) == 0)
	            {
	                nd2.setValue(null);
	                return true;
	            }
	            nd2 = nd2.getNextRef();
	        }
	        li2.add(key);
	        length=li2.size();
	        int [] arr=li2.convInteger(li2,length);
	        int [] arr2=li2.sortArray(arr);
	        System.out.println("after sorting:");
	        li2.clear();
	        for(int i:arr2)
	        {
	            li2.add(i);
	        }
	        return false;

	    }
	    public boolean search(T key){
	    	 NewNode<T> temp=first;
	        while(temp.getNextRef()!=null){
	            if( String.valueOf(key).compareToIgnoreCase(String.valueOf(temp.getValue())) == 0){
	                return true;
	            }
	            temp=temp.getNextRef();
	        }
	        return false;
	    }

	    public String [] convString(LinkedList<T> li,int len)
	    {
	    	 NewNode<T> nd2 = li.first;
	        String [] str=new String[len];
	        int i=0;
	        while (true) {
	            if (nd2 == null) {
	                break;
	            }
	            if(nd2.getValue()!=null)
	            {
	                str[i++]=(String) nd2.getValue();
	                //                    i++;
	            }
	            nd2 = nd2.getNextRef();
	        }
	        return str;
	    }
	    public int [] convertInt(LinkedList<Integer> li,int len)
	    {
	    	 NewNode<Integer> nd2 = li.first;
	        int [] str=new int[len];
	        int i=0;
	        while (true) {
	            if (nd2 == null) {
	                break;
	            }
	            if(nd2.getValue()!=null)
	            {
	                str[i++]=(Integer) nd2.getValue();
	                //                    i++;
	            }
	            nd2 = nd2.getNextRef();
	        }
	        return str;
	    }

static Scanner scanner=new Scanner(System.in); //scanner class declaration

//method for scanner class of integer type
public static int readInteger() {
      return scanner.nextInt();}

//method for scanner class of double type
public static double readdouble() {
                return scanner.nextDouble();}
/**
 * static function to read boolean input from the user
 * @return boolean values that are read
 */
public static boolean readBoolean(){
		return scanner.nextBoolean();
}

    
//method for scanner class of String type
public static String readString() {
                return scanner.next();}
}
