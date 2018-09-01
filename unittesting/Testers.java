package unittesting;

public class Testers {
	public static void checkIsEmpty(Tree t) throws Exception {
		if (t instanceof EmptyBST) {
			if (t.isEmpty()) {
				System.out.println("All is good! The tree is an EmptyBST and it is empty.");
			} else {
				throw new Exception("Oh, no! The tree is an EmptyBST but it is not empty.");
			}
		} else  if (t instanceof NonEmptyBST) {
			if (!t.isEmpty()) { 
				System.out.println("All is good! The tree is a NonEmptyBST and it is not empty.");
			} else {
				throw new Exception("Oh, no! The tree is a NonEmptyBST but it is empty.");
			}
		}
	}
}
