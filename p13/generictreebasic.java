public class generictree {
	private class node {
		int data;
		ArrayList<node> children = new ArrayList<>();
	}

	node root;
	private int size;

	public generictree(int[] arr) {
		Stack<node> stack = new Stack<>();

		for (int val : arr) {
			if (val != -1) {
				node n = new node();
				n.data = val;

				size++;
				if (stack.size() > 0) {
					stack.peek().children.add(n);
				} else {
					root = n;
				}
				size++;
				stack.push(n);
			} else {
				stack.pop();
			}
		}
	}

	public int size() {
		return size;
	}

	public boolean isempty() {
		return size == 0;
	}

	public void display() {
		displayhelper(root);
	}

	private void displayhelper(node N) {
		String str = N.data + "->";
		for (node child : N.children) {
			str += child.data + " ";
		}
		System.out.println(str + " ");
		for (node child : N.children) {
			displayhelper(child);
		}
	}