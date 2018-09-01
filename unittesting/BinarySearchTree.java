package unittesting;

public class BinarySearchTree {

	public static void main (String[] args) throws Exception {
		EmptyBST<Integer> emptyTree = new EmptyBST<Integer>();
	/*	emptyTree.add(9);
		System.out.println("The integer tree is of type EmptyBST, therefore everthing inside it is null.");
		System.out.println("Is the integer tree empty : " + emptyTree.isEmpty());
		System.out.println("Size of integer tree : " + emptyTree.cardinality());
		System.out.println("Is 6 a member of the integer tree :" + emptyTree.member(6)); */

		NonEmptyBST<String> stringTree = new NonEmptyBST<String>("Hello");
	/*	System.out.println("String tree created.");
		System.out.println("Is the string tree empty : " + stringTree.isEmpty());
		System.out.println("Size of string tree : " + stringTree.cardinality());
		System.out.println("Is 'Hello' a member of the string tree : " + stringTree.member("Hello")); */


		//testing
		Testers.checkIsEmpty(emptyTree);
		Testers.checkIsEmpty(stringTree);
	}

}
