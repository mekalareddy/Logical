package dataStructures;

public class SingleLinkedList {

	Node head;

	boolean add(Object obj) {

		Node n = new Node(obj);
		if(head == null) {
			head = n;
			return true;
		}

		Node t = head;
		while(t.link != null) {
			t = t.link;
		}

		t.link = n;
		return true;
	}

	void display() {
		Node t = head;
		while(t != null) {
			System.out.println(t.data + " --->");
			t = t.link;
		}
		System.out.println();
	}

	public boolean addFirst(Object obj) {
		Node n = new Node(obj);
		Node t = head;
		head = n;
		head.link = t;
		return true;
	}

	boolean add(Object obj1, Object obj2) {
		Node n = new Node(obj2);
		Node t = head;
		while(t != null){
			if(t.data == obj1) {
				break;
			}
			t = t.link;
		}
		if(t == null)
			return false;
		else {
			n.link = t.link;
			t.link = n;
			return true;
		}
	}

	public int search(Object ob) {
		int count = 0;
		Node t = head;
		while(t != null) {
			count++;
			if(t.data == ob) {
				break;
			}
			t = t.link;
		}
		if(t == null)
			return -1;
		else
			return count;
	}

	public boolean delete(Object ob) {
		if(head.data == ob) {
			head = head.link;
			return true;
		}
		Node t = head.link;
		Node p = head;
		while(t != null) {
			if(t.data == ob) {
				break;
			}
			p=t;
			t=t.link;
		}
		if(t != null) {
			p.link = t.link;
			return true;
		}
		else
			return false;
	}
}
