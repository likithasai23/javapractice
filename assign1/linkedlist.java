public class linkedlist{ 

	Node head; 
	static class Node { 

		String data; 
		Node next; 

		Node(String d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	
	public static linkedlist insert(linkedlist  list, String data) 
	{ 
		
		Node new_node = new Node(data); 
		new_node.next = null; 

		
		if (list.head == null) { 
			list.head = new_node; 
		} 
		else { 
			
			Node last = list.head; 
			while (last.next != null) { 
				last = last.next; 
			} 

			
			last.next = new_node; 
		} 

		
		return list; 
	} 

	 
	public static void display(linkedlist list) 
	{ 
		Node currNode = list.head; 

		System.out.print("printing linkedlist : "); 

	
		while (currNode != null) { 
			
			System.out.print(currNode.data + " "); 

		
			currNode = currNode.next; 
		} 
	} 

 
	public static void main(String[] args) 
	{ 
	
		linkedlist l = new linkedlist (); 

		
		// Insert the values 
		l = insert(l, "java"); 
		l = insert(l, "pracitce"); 
		l = insert(l, "eclipse"); 
		l = insert(l, "ll"); 
		

		
		display(l); 
	} 
} 