//Reverse a linked list

class question_21 { 
    static Node head; 
    static class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
    Node reverse(Node node) 
    { 
        Node prev = null; 
        Node current = node; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        node = prev; 
        return node; 
    }   
     
    void printList(Node node) 
    { 
        while (node != null) { 
            System.out.print(node.data + " <-- "); 
            node = node.next; 
        } 
    } 
  
    public static void main(String[] args) 
    { 
    	question_21 list = new question_21(); 
        question_21.head = new Node(85); 
        question_21.head.next = new Node(15); 
        question_21.head.next.next = new Node(4); 
        question_21.head.next.next.next = new Node(20); 
  
        System.out.println("Given Linked list"); 
        list.printList(head); 
        head = list.reverse(head); 
        System.out.println(""); 
        System.out.println("Reversed linked list "); 
        list.printList(head); 
    } 
} 