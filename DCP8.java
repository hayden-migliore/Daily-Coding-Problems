// Author: Hayden Migliore
// Date: August 8, 2019
// Problem: A unival tree (which stands for "universal 
// value" is a tree where all nodes under it have the 
// same value. Given the root to a binary tree, count 
// the number of unival sub trees. For example, the 
// following tree has five unival sub trees:
//
//        0
//       / \
//      1   0
//         / \
//        1   0
//       / \
//      1   1

package dcp8;

public class DCP8 {
    
    static int count = 0;

    public static void main(String[] args) {
        
        //Create binary tree
        Node root = new Node(0);
        root.left = new Node(1);
        root.right = new Node(0);
        root.right.left = new Node(1);
        root.right.right = new Node(0);
        root.right.left.left = new Node(1);
        root.right.left.right = new Node(1);
        
        //Find number of unival trees
        boolean test = countUni(root);
        
        //Ouptut answer
        System.out.printf("The binary tree has %d unival trees in it.\n", count);
    }
    
    static boolean countUni(Node node){
        
        if (node == null){
            return true;
        }
        
        //check if left and right nodes are unival trees
        boolean leftB = countUni(node.left);
        boolean rightB = countUni(node.right);
        
        //set up left and right nodes
        Node leftN = node.left;
        Node rightN = node.right;
        
        //if both left and right nodes are unival
        if (leftB && rightB){
            
            //check if leaf node
            if (leftN == null && rightN == null){
                count++;
                return true;
            }
            
            //check if left and right exist and match
            else if(leftN != null && rightN != null && 
                    leftN.value == node.value && rightN.value == node.value){
                count++;
                return true;
            }
            
            //check if just left exists and matches
            else if(leftN != null && rightN == null && leftN.value == node.value){
                count++;
                return true;
            }
        
            //check if just right exists and matches
            else if(rightN != null && leftN == null && rightN.value == node.value){
                count++;
                return true;
            }
        }
        return false;
    }
}

class Node{
    int value;
    Node left, right;
    
    public Node(int value){
        this.value = value;
        left = right = null;
    }
}
