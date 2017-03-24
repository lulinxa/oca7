class Node {
	Object value;
	Node left, right;
}
class Tree {
	Tree() {}
	Node rootNode;
	void addElement(Object value){
		// code
	}
	void removeElement(Object value) {
		// code
	}
	void sortTree(boolean ascending) {
		new TreeSort(ascending).sort();
	}

	class TreeSort {
		boolean ascendingSortOrder = true;
		TreeSort(boolean order) {
			ascendingSortOrder = order;
		}
		void sort() {
			// outer class's rootNode and sort tree value
			// sorting code can be complex
		}
	}
}
