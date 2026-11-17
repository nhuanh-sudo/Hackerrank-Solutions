

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static Node lca(Node root, int v1, int v2) {
      	// Write your code here.
        while (root != null) {
        if (v1 < root.data && v2 < root.data) {
            root = root.left;
        } else if (v1 > root.data && v2 > root.data) {
            root = root.right;
        } else {
            break;
        }
    }
    return root;
    }



