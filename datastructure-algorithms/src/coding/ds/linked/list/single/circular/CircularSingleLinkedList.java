package coding.ds.linked.list.single.circular;

public class CircularSingleLinkedList {
	private CSLLNode head;
	private CSLLNode tail;
	private int size;

	public CSLLNode getHead() {
		return head;
	}

	public void setHead(CSLLNode head) {
		this.head = head;
	}

	public CSLLNode getTail() {
		return tail;
	}

	public void setTail(CSLLNode tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public CSLLNode createCsllNode(int value) {
		CSLLNode circularNode = new CSLLNode();
		circularNode.setValue(value);
		circularNode.setNext(circularNode);
		head = circularNode;
		tail = circularNode;
		size = 1;
		return circularNode;
	}

	public void insertCsllNode(int value, int location) {
		if (!isEmptyList())
			return;
		CSLLNode circularNode = new CSLLNode();
		circularNode.setValue(value);
		if (location == 0) {// insert at beginning of list
			circularNode.setNext(head);
			if (size == 1) {
				head.setNext(circularNode);
			}
			head = circularNode;
			tail.setNext(circularNode);
		}

	}

	public boolean isEmptyList() {
		return (head == null);
	}
}
