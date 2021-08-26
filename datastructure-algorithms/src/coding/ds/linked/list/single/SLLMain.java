package coding.ds.linked.list.single;

public class SLLMain {
	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		list.createSLL(5);
		list.traverseSLL();

		list.insertIntoSLL(10, 1);
		list.traverseSLL();

		list.insertIntoSLL(20, 2);
		list.traverseSLL();
		list.insertIntoSLL(30, 3);
		list.traverseSLL();
		list.insertIntoSLL(15, 0);
		list.traverseSLL();

		list.traverseSLL();
		System.out.println();

		System.out.println("\nSearching the node having value 40...");
		list.serachValue(40);

		System.out.println("\nSearching the node having value 500...");
		list.serachValue(500);

		System.out.println("\n\nDeleting the node having location = 0: ");
		System.out.println("Before Deletion:");
		list.traverseSLL();
		list.deleteNode(0);
		System.out.println("After Deletion:");
		list.traverseSLL();
		System.out.println();

		System.out.println("\n\nDeleting the node having location = 2: ");
		System.out.println("Before Deletion:");
		list.traverseSLL();
		list.deleteNode(2);
		System.out.println("After Deletion:");
		list.traverseSLL();
		System.out.println();

		System.out.println("\n\nDeleting the node having location = 100: ");
		System.out.println("Before Deletion:");
		list.traverseSLL();
		list.deleteNode(100);
		System.out.println("After Deletion:");
		list.traverseSLL();
		System.out.println();

		list.deleteLinkedList();
		list.traverseSLL();
	}
}
