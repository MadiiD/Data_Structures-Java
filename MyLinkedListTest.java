
	public static void main(String[] args) {
		MyLinkedList mp = new MyLinkedList();
		mp.addNode(new Node("Megan "));
		mp.addNode(new Node("Tina"));
		mp.addNode(new Node("Zach"));
		mp.addNode(new Node("Emily"));
		mp.addNode(new Node("Lucy"));
		mp.printList();
	
		
		mp.removeNode(4);
		mp.printList();
		mp.insertBefore(1,new Node("Emily"));
		mp.printList();
		mp.insertAfter(4, new Node ("Tina"));;
		mp.printList();
	}
}
