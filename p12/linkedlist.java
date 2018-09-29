	public void reversedisplay() {

		// displayReverseHelper(head);
		// reversepointerrecursive();
		// display();
		// reversedatarecursive();
		// display();
		// System.out.println(ispalindrone());
		// fold();
		// display();
		// unfold();
		// display();
	}

	private void displayReverseHelper(Node node) {
		if (node == null) {
			return;
		}
		displayReverseHelper(node.next);
		System.out.println(node.data + " ");
	}

	public void reversepointerrecursive() {

		reversehelperiterative(head);

		Node temp = head;
		head = tail;
		tail = temp;
		tail.next = null;

	}

	private void reversehelperiterative(Node node) {
		if (node == tail) {
			return;
		}
		reversehelperiterative(node.next);
		node.next.next = node;
	}

	public void reversedatarecursive() {
		left = head;

		reversedatarecursive(head, 0);

		left = null;
	}

	Node left;

	private void reversedatarecursive(Node right, int floor) {
		if (right == null) {
			return;
		}
		reversedatarecursive(right.next, floor + 1);
		if (floor >= size / 2) {
			int temp = left.data;
			left.data = right.data;
			right.data = temp;
			left = left.next;

		}
	}

	public boolean ispalindrone() {
		left = head;
		if (palindrone(head, 0) == true)
			return true;
		else {
			return false;
		}

	}

	private boolean palindrone(Node right, int floor) {

		if (right == null) {
			return true;
		}

		boolean rans = palindrone(right.next, floor + 1);
		if (rans == false) {
			return false;
		} else {
			if (floor >= size / 2) {
				if (left.data == right.data) {
					left = left.next;
					return true;
				} else {
					return false;
				}
			} else {
				return rans;
			}
		}
	}

	public void fold() {
		left = head;
		fold(head, 0);
		left = null;
	}

	private void fold(Node right, int floor) {
		if (right == null) {
			return;
		}
		fold(right.next, floor + 1);
		if (floor >= size / 2) {
			Node temp = left.next;
			left.next = right;
			right.next = temp;
			left = temp;
			if (floor == size / 2) {

				this.tail = right;
				tail.next = null;
			}
		}
	}