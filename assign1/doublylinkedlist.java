public class doublylinkedlist{    
	  
   
    class Node{    
        String data;    
        Node prev;    
        Node next;    
  
        public Node(String data) {    
            this.data = data;    
        }    
    }    
  
    
    Node head = null;  
    Node tail = null;    
  
      
    public void insert(String data) {    
     
        Node newNode = new Node(data);    
  
        
        if(head == null) {  
              
            head = newNode;  
            tail = newNode;  
              
            head.prev = null;      
            tail.next = null;    
        }  
        
        else {    
  
           
            tail.next = newNode;    
            
            newNode.prev = tail;    
            
            tail = newNode;    
           
            tail.next = null;    
        }    
    }    
  
       
    public void display() {  
           
        Node current = head;    
       
        if(head == null) {  
            
            System.out.println("List is empty");    
            return;    
        }  
      
        System.out.println("Here goes the Doublylinkedlist: ");    
        
        while(current != null) {    
            System.out.print(current.data + "\n");    
            current = current.next;    
        }    
    }    
  
    public static void main(String[] args) {    
  
    	doublylinkedlist dl = new doublylinkedlist();    
  
        
        dl.insert("Apple");    
        dl.insert("orange");    
        dl.insert("custard apple");    
          
  
          
        dl.display();    
    }    
}  