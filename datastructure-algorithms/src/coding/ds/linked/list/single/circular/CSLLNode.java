package coding.ds.linked.list.single.circular;

public class CSLLNode {
	private int value;
	private CSLLNode next;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public CSLLNode getNext() {
		return next;
	}

	public void setNext(CSLLNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "CSLLNode [value=" + value + ", next=" + next + "]";
	}
}