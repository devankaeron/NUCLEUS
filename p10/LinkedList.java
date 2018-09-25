package sep23;

public class LinkedList {
	private class Node {
		int data;
		Node next;
	}

	Node head;
	Node tail;
	int size;

	public void addLast(int val) {
		// 1. create
		Node node = new Node();

		// 2. update data and next
		node.data = val;
		node.next = null;

		// 3. link
		if (size > 0) {
			tail.next = node;
			tail = node;
		} else {
			head = node;
			tail = node;
		}

		size++;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(".");
	}

	public int getFirst() {
		if (size == 0) {
			System.out.println("List is empty");
			return -1;
		}

		return head.data;
	}

	public int getLast() {
		if (size == 0) {
			System.out.println("List is empty");
			return -1;
		}

		return tail.data;
	}

	public int getAt(int idx) {
		if (idx < 0 || idx >= size) {
			System.out.println("Index out of bound");
			return -1;
		}

		Node temp = head;
		int i = 0;

		while (i != idx) {
			temp = temp.next;
			i++;
		}

		return temp.data;
	}

	private Node getNodeAt(int idx) {
		if (idx < 0 || idx >= size) {
			System.out.println("Index out of bound");
			return null;
		}

		Node temp = head;
		int i = 0;

		while (i != idx) {
			temp = temp.next;
			i++;
		}

		return temp;
	}

	public void addFirst(int val) {
		Node n = new Node();
		n.data = val;
		n.next = head;
		head = n;

		if (size == 0) {
			tail = n;
		}

		size++;
	}

	public int removeFirst() {
		if (size == 0) {
			System.out.println("List is empty");
			return -1;
		}

		int rv = head.data;

		head = head.next;
		if (size == 1) {
			tail = null;
		}

		size--;

		return rv;
	}

	public int removeLast() {
		if (size == 0) {
			System.out.println("List is empty");
			return -1;
		} else if (size == 1) {
			int data = tail.data;
			head = tail = null;
			size = 0;
			return data;
		} else {
			int data = tail.data;
			Node sl = getNodeAt(size - 2);
			tail = sl;
			tail.next = null;
			size--;
			return data;
		}
	}

	public void addAt(int idx, int val) {
		if (idx < 0 || idx > size) {
			System.out.println("Index out of bound");
			return;
		} else if (idx == 0) {
			addFirst(val);
			return;
		} else if (idx == size) {
			addLast(val);
			return;
		} else {
			Node nm1 = getNodeAt(idx - 1);
			Node n = nm1.next;

			Node nn = new Node();
			nn.data = val;

			nm1.next = nn;
			nn.next = n;
			size++;
		}
	}

	public int removeAt(int idx) {
		if (idx < 0 || idx >= size) {
			System.out.println("Index out of bound");
			return -1;
		} else if (idx == 0) {
			return removeFirst();
		} else if (idx == size - 1) {
			return removeLast();
		} else {
			Node nm1 = getNodeAt(idx - 1);
			Node n = nm1.next;
			Node np1 = n.next;

			nm1.next = np1;
			size--;

			return n.data;
		}
	}

	// on^2
	public void reverseDataIterative() {
		int li = 0;
		int ri = size - 1;

		while (li < ri) {
			Node left = getNodeAt(li);
			Node right = getNodeAt(ri);

			int temp = left.data;
			left.data = right.data;
			right.data = temp;

			li++;
			ri--;
		}
	}

	// on
	public void reversePointerIterative() {
		Node p = null;
		Node c = head;
		Node n = c.next;

		while (c != null) {
			c.next = p;
			p = c;
			c = n;

			if (n != null) {
				n = n.next;
			}
		}
		
		Node temp = head;
		head = tail;
		tail = temp;
	}

}
