/*   Created by IntelliJ IDEA.
 *   Author: Ompal Singh (Ompal-Singh)
 *   Date: 2/2/2021
 *   Time: 9:55 PM
 *   File: MyLinkedList.java
 */

package implementation;

import myinterface.MySinglyLinkedList;

public class MyLinkedList implements MySinglyLinkedList {
    //head reference or start of Linked List or reference of first node
    private Node head;
    //tail reference or end of Linked List or reference of last node
    private Node tail;
    //store total number of elements in linked list
    private int size;
    //constructor
    public MyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    @Override
    public int size(){

        return size;
    }
    @Override
    public boolean isEmpty(){

        return head == null;
    }
    @Override
    public void addFirst(int element){
        Node node = new Node(element);
        if(isEmpty()){
            head = node;
            tail = node;
            size++;
    }
    else{
        node.setNext(head);
        head = node;
        size++;

    }
}
//traverse
public void traverse() {
    if (!isEmpty()) {
        Node temp = head;
        System.out.println("head__>");
        while (temp != null) {
            System.out.println(temp.getData() + "__>");
            //updating temp value to refer next node of sequence
            temp = temp.getNext();
        }
        System.out.println("null");
    } else {
        System.out.println("linked list empty");
    }
  }
}
