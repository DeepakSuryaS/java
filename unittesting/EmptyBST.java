package unittesting;

import java.util.*;

public class EmptyBST<D extends Comparable<D>> implements Tree<D> {
	
	//constructor
	public EmptyBST() {

	}
	
	//methods
	public boolean isEmpty() {
		return true;
	}

	public int cardinality() {
		return 0;
	}

	public boolean member(D elt) {
		return false;
	}

	//creating a non-empty bst with the add method that takes an element of type D
	public NonEmptyBST<D> add(D elt) {
		return new NonEmptyBST<D>(elt);
	}

}
