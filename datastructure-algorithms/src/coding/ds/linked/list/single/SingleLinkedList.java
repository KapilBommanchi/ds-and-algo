package coding.ds.linked.list.single;

public class SingleLinkedList {
	private SLLNode head;
	private SLLNode tail;
	private int size;

	public SLLNode getHead() {
		return head;
	}

	public void setHead(SLLNode head) {
		this.head = head;
	}

	public SLLNode getTail() {
		return tail;
	}

	public void setTail(SLLNode tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public SLLNode createSLL(int value) {
		SLLNode node = new SLLNode();
		node.setValue(value);
		node.setNext(null);
		this.head = node;
		this.tail = node;
		this.size = 1;
		return node;
	}

	public void insertIntoSLL(int value, int location) {
		SLLNode newNode = new SLLNode();
		newNode.setValue(value);
		if (!existsSLL()) {
			System.out.println("SLL doesn't exists");
		} else if (location == 0) {// insert at first location
			newNode.setNext(head);
			head = newNode;
		} else if (location >= size) {// insert at last location
			newNode.setNext(null);
			tail.setNext(newNode);
			tail = newNode;
		} else {// insert in specified location other than above two
			SLLNode tmpNode = head;
			int index = 0;
			while (index < location - 1) {
				tmpNode = tmpNode.getNext();
				index++;
			}
			SLLNode nextNode = tmpNode.getNext();
			tmpNode.setNext(newNode);
			newNode.setNext(nextNode);
		}
		setSize(getSize() + 1);
	}

	private boolean existsSLL() {
		return head != null;
	}

	public void traverseSLL() {
		if (existsSLL()) {
			SLLNode tmpNode = head;
			for (int i = 0; i < getSize(); i++) {
				System.out.println(tmpNode.getValue());
				if (i != getSize() - 1) {
					System.out.println(" -> ");
				}
				tmpNode = tmpNode.getNext();
			}
		} else {
			System.out.println("Single linked list doesn't exists.");
		}
	}

	public boolean serachValue(int value) {
		if (existsSLL()) {
			SLLNode tmpNode = head;
			for (int i = 0; i < getSize(); i++) {
				if (tmpNode.getValue() == value) {
					System.out.print("Found the node at location: " + i + "\n");
					return Boolean.TRUE;
				}
				tmpNode = tmpNode.getNext();
			}
			return Boolean.FALSE;
		} else {
			return Boolean.FALSE;
		}
	}

	public void deleteNode(int location) {
		if (existsSLL()) {
			if (location == 0) {// delete first node
				head = head.getNext();
				setSize(getSize() - 1);
				if (getSize() == 0) {// if SLL has only one node
					tail = null;
				}
			} else if (location >= getSize()) {
				SLLNode tmpNode = head;
				for (int i = 0; i < getSize() - 1; i++) {
					tmpNode = tmpNode.getNext();
				}
				if (tmpNode == head) {// if list has only one node
					head = null;
					tail = null;
					setSize(getSize() - 1);
					return;
				}
				tmpNode.setNext(null);
				tail = tmpNode;
				setSize(getSize() - 1);
			} else {
				SLLNode tmpNode = head;
				for (int i = 0; i <= location - 1; i++) {
					tmpNode = tmpNode.getNext();
				}
				SLLNode nextNode = tmpNode.getNext();
				tmpNode.setNext(nextNode.getNext());
				setSize(getSize() - 1);
			}
		} else {
			System.out.println("Single Linked List is empty");
		}
	}

	void deleteLinkedList() {
		System.out.println("\n\nDeleting Linked List...");
		head = null;
		tail = null;
		System.out.println("Linked List deleted successfully !");
	}

}
