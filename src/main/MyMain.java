/*   Created by IntelliJ IDEA.
 *   Author: Ompal Singh (Ompal-Singh)
 *   Date: 2/2/2021
 *   Time: 10:23 PM
 *   File: MyMain.java
 */

package main;

import implementation.MyLinkedList;

public class MyMain {
    public static void main(String[] args) {
        MyLinkedList linkedListist = new MyLinkedList();
        linkedListist.addFirst(500);
        linkedListist.traverse();
        linkedListist.addFirst(700);
        linkedListist.addFirst(200);
        linkedListist.traverse();
        System.out.println("size = " + linkedListist.size());

    }
}
