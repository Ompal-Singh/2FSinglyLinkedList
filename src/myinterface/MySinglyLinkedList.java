package myinterface;

public interface MySinglyLinkedList {
    //insertAtBeginning
    //insertAtHead
    void addFirst(int element);
    //insertAtEnd
    //insertAtTail
    //void addLast(int element);
    boolean isEmpty();// will give true if Linked List is empty
    int size();//will give total number of elements in Linked List
    void addLast();
    void addLastWithOutUsingTail(int element);
    void traverse();
    void addAfterGivenNode(int givenElement, int element);
    //void addBeforeGivenNode(int givenElement, int element);
    int removeFirst();
    int removeLast();
    int removeGivenNode(int givenElement);
    boolean search(int element);


}
