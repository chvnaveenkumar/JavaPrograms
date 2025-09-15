package ds.linkedlist;
public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue){
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    
    public void insertInLinkedList(int nodeValue, int location) {
    	Node node = new Node();
    	node.value = nodeValue;
    	if(head == null) {
    		createSinglyLinkedList(nodeValue);
    	} else if(location == 0) {
    		node.next = head;
    		head = node;
    		size++;
    	} else if(location >= size) {
    		node.next = null;
    		tail.next = node;
    		tail = node;
    		size++;
    	} else {
    		Node nodeNext = head;
    		int index = 0;
    		while(index < location - 1) {
    			nodeNext = nodeNext.next;
    			index++;
    		}
    		Node nextNode = nodeNext.next;
    		nodeNext.next = node;
    		node.next = nextNode;
    		size++;
    	}
    }
    
    public boolean searchNode(int nodeValue) {
    	if(head != null) {
    		Node tempNode = head;
    		for(int i=0;i<size;i++) {
    			if(tempNode.value == nodeValue) {
    				System.out.println("we have found the node "+ i);
    				return true;
    			}
    			tempNode = tempNode.next;
    		}
    	}
    	return false;	
    }
    
    public void deleteSLL() {
    	head = null;
    	tail = null;
    	System.out.println("Deleted single linked List");
    }
    
    public void deleteNode(int location) {
    	if(head == null) {
    		System.out.println("There is no elements in the linked list");
    	} else if(location == 0) {
    		head = head.next;
    		size--;
    		if(size == 0) {
    			tail = null;
    		}
    	}
    }
}