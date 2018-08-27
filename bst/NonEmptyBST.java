package bst;

import java.util.*;

public class NonEmptyBST<D extends Comparable<D>> implements Tree<D> {
	
	D data;
	Tree<D> left;
	Tree<D> right;

	//constructor
	public NonEmptyBST(D elt) {
		data = elt;
		left = new EmptyBST<D>();
		right = new EmptyBST<D>();
	}

	public NonEmptyBST(D elt, Tree<D> leftTree, Tree<D> rightTree) {
		data = elt;
		left = leftTree;
		right = rightTree;
	}

	//methods
	public boolean isEmpty() {
		return false;
	}

	public int cardinality() {
		return 1 + left.cardinality() + right.cardinality();
	}

	public boolean member(D elt) {
		if (data == elt) {
			return true;
		} else {
			if (elt.compareTo(data) < 0) {  //if our elt < data then it will be less than 0
				return left.member(elt);
			} else {
				return right.member(elt);
			}
		}
	}

	public NonEmptyBST<D> add(D elt) {
		if (data == elt) {
			return this;
		} else {
			if (elt.compareTo(data) < 0) {
				return new NonEmptyBST<D>(data, left.add(elt), right);
			} else {
				return new NonEmptyBST<D>(data, left, right.add(elt));
			}
		}
	}

}
