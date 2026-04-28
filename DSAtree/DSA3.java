/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa3;

/**
 *
 * @author Administrator
 */
public class DSA3 {

    
    public static void main(String[] args) {
        
        Node root=new Node(8);
        Node child1=new Node(4);
        Node child2=new Node(12);
        Node grandchild1=new Node(2);
        Node grandchild2=new Node(6);
        Node grandchild3=new Node(10);
        Node grandchild4=new Node(14);
        
//        conect
        root.left=child1;
        root.right=child2;
        
        child1.left=grandchild1;
        child1.right=grandchild2;
        
        child2.left=grandchild3;
        child2.right=grandchild4;
        
        System.out.println("tree created"); 
        
        System.out.println("preOrder");
        DSA3.preOrder(root);
        System.out.println("inOrder");
        DSA3.inOrder(root);
        System.out.println("postOrder");
        DSA3.postOrder(root);
        
    }
    
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    
    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
}
    

