package coding.ds.linked.list.single;

public class SLLNode {
	private int value;
	private SLLNode next;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public SLLNode getNext() {
		return next;
	}

	public void setNext(SLLNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "SLLNode [value=" + value + ", next=" + next + "]";
	}
}
