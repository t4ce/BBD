/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bdd;

/**
 *
 * @author jonas
 */
public abstract class Node {
    Node left;
    Node right;
    public Node(Node left, Node right) {
        this.left = left;
        this.right = right;
    }
}
