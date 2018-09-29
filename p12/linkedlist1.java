public void removeduplicate() {
		Node current = head;
		Node next = head.next;

		while (true) {
			if (next == null) {
				tail = current;
				tail.next = null;
				break;
			}
			if (current.data == next.data) {
				next = next.next;
			} else {
				current.next = next;
				current = next;
				next = next.next;
			}
		}

	}
}