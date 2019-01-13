/******************************************************************************
 *  Compilation:  javac -d bin  NewNode.java
 *  Execution:    java -cp bin com.bridgelabz.datastructureprograms. NewNode n
 *  
 *  Purpose: Creates a linked list
 *
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   02-01-2019
 *
 ******************************************************************************/

package com.bridgelabz.util;



class NewNode<T> {
    private T value;
    NewNode<T> nextRef;
    /**
	 * Constructors to initialize the instance variables
	 */
    public NewNode(){
        value=null;
        nextRef=null;
    }
    /**
	 * Parameterized Constructors to initialize instance and 
	 * local variables
	 * 
	 * @param data the data to store in the node of a linked list
	 * @param next the address of the next node
	 */
    public NewNode(T data, NewNode<T> next){
        this.value=data;
        this.nextRef=next;
    }
    /**
	 * Getter method to get the data
	 * 
	 * @return
	 */
    public T getValue() {

        return value;
    }
    /**
	 * Setter method to set the data
	 * 
	 * @param data the data to be set
	 */
    public void setValue(T value) {
        this.value = value;
    }
    /**
	 * Getter method to get the link of the next node
	 * 
	 * @return the link of the next node
	 */
    public NewNode<T> getNextRef() {
        return nextRef;
    }
    /**
	 * Setter Method to set the link of the next node
	 * 
	 * @param next the link that has the address of the next node
	 */
    public void setNextRef(NewNode<T> ref) {
        this.nextRef = ref;
    }
}