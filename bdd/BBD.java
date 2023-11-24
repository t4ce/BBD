/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bdd;

/**
 *
 * @author jonas
 */
public class BBD {
    public static void eleminateRedundancy(Node n){
        if (n.getClass() == InternalNode.class){
            if (n.left == n.right){
                //merge
                n.left = n.left.left;
                n.right = n.right.right;
            }
            
            eleminateRedundancy(n.left);
            eleminateRedundancy(n.right);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Node zeroTerminal = new LeafNode(false);
        Node oneTerminal = new LeafNode(true);
        
        Node internalNode = new InternalNode("x2", zeroTerminal, oneTerminal);
        Node root = new InternalNode("x1", internalNode, internalNode);
        
        System.out.println(root.toString()); 
        
        eleminateRedundancy(root);
        
        System.out.println(root.toString()); 
        
        Assingment a = new Assingment(true, false);
    }
}
