package ds.linkedlist;

public class Main{
    public static void main(String args[]){
    SingleLinkedList sll = new SingleLinkedList();
    sll.createSinglyLinkedList(8);
    sll.insertInLinkedList(5, 0);
    sll.insertInLinkedList(6, 1);
    sll.insertInLinkedList(2, 2);
    sll.insertInLinkedList(9, 1);
	
   Node nextNode = sll.head;
	for(int i=0;i<sll.size;i++) {
    	System.out.println(nextNode.value);
    	nextNode = nextNode.next;
    }
	System.out.println(sll.searchNode(6));
    }
}