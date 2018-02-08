public class MyLinkedList {
	private Node head;

	public MyLinkedList() {
		this.head = null;
	}

	public void addNode(Node n) {
		if (head == null) {// lets assign head to null as it is the first node
			head = n;// if thats true -lets assign head to n 
		} else {
			Node n = head;// then current node is the head 
			while (n.next != null) {// while current not equal null 
				n = n.next; // current next 
		
			n.next = n;// current = new node 
		}
	}

	public void printList() {
		Node n = head;
		while (n != null) { // while node is not null 
			System.out.print(n.name + " ");
			n = n.next;
		}
		System.out.println(" ");
	}

	public void insertBefore(int index, Node n) {
		Node n = head;
		int x = 0;               // position 
		while (x < index - 1) {
			if (n.next == null) {
				System.out.println("Not a valid entry");
				return;
			}
			n = n.next;
			x++;
		}

		Node next = n.next;
		n.next = n;
		n.next = next;
	}

	public void insertAfter(int index, Node n) {
		Node current = head;
		int x = 0;
		while (x < index) {
			if (current == null) {
				System.out.println("Can't insert there.");
				return;
			}
			current = current.next;
			x++;
		}
		Node next = current.next;
		current.next = n;
		n.next = next;
	}

	public int indexOf(String str) {
		Node current = head;
		int x = 0;
		while (current.name != str) {
			if (current.next == null) {
				System.out.println("Not found");
				return -1;
			}
			x++;
			current = current.next;
		}
		return x;
	}

	public void removeNode(int index) {
		
		Node current;
		int nodecount=0;
	
		current =head;
		while (current!=null){
			current =current.next;
			nodecount++;
		}
		System.out.println( "Node Count = " + nodecount);
		current =null;
		
		if ( index<=nodecount){
			if (index==0){
				current=head;
			current=current.next;
				head.next=null;
				head=current;
			}else{
				current =head;
				int pos=0;
				while(pos<index-1){
					current = current.next;
					pos++;
				}
				if (current.next.next==null)
					current.next=null;
				else{
					Node temp=current.next.next;
					current.next.next=null;
					current.next=temp;
				
				}
				
			}
		}
	}
		