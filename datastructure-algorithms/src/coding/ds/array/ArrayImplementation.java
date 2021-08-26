package coding.ds.array;

public class ArrayImplementation {
	public static void main(String[] args) {

		System.out.println("Creating a blank array of size 10...");
		ArrayUtility arrayUtil = new ArrayUtility(10);

		System.out.println("Printing the Array...");
		arrayUtil.traverseArray();
		System.out.println();
		System.out.println();

		System.out.println("Inserting few values in the array...");
		arrayUtil.insert(0, 0);
		arrayUtil.insert(1, 10);
		arrayUtil.insert(2, 20);
		arrayUtil.insert(3, 30);
		arrayUtil.insert(4, 40);
		arrayUtil.insert(5, 50);
		arrayUtil.insert(6, 60);
		arrayUtil.insert(7, 70);
		arrayUtil.insert(8, 80);
		arrayUtil.insert(1, 100);
		arrayUtil.insert(12, 120);
		System.out.println();
		System.out.println();

		System.out.println("Printing the Array...");
		arrayUtil.traverseArray();
		System.out.println();
		System.out.println();

		System.out.println("Accessing cell number#1...");
		arrayUtil.accessingCell(1);
		System.out.println();
		System.out.println();

		System.out.println("Accessing cell number#5...");
		arrayUtil.accessingCell(5);
		System.out.println();
		System.out.println();

		System.out.println("Accessing cell number#15...");
		arrayUtil.accessingCell(15);
		System.out.println();
		System.out.println();

		System.out.println("Searching 30 in the array...");
		arrayUtil.searchInAnArray(30);
		System.out.println();
		System.out.println();

		System.out.println("Searching 400 in the array...");
		arrayUtil.searchInAnArray(400);
		System.out.println();
		System.out.println();

		System.out.println("Deleting value from Cell#3 of array...");
		System.out.println("Before Deleting: ");
		arrayUtil.traverseArray();
		arrayUtil.deleteValueFromArray(3);
		System.out.println();
		System.out.println("After Deleting: ");
		arrayUtil.traverseArray();
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("Deleting value from Cell#15 of array...");
		System.out.println("Before Deleting: ");
		arrayUtil.traverseArray();
		arrayUtil.deleteValueFromArray(15);
		System.out.println("After Deleting: ");
		arrayUtil.traverseArray();
		System.out.println();
		System.out.println();
		System.out.println();

		arrayUtil.deleteThisArray();
		System.out.println("After Deleting: ");
		arrayUtil.traverseArray();

	}// end of Main method

}
