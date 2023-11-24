/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bdd;


public class InternalNode extends Node {
    String name;
     
    public InternalNode(String name, Node left, Node right) {
        super(left, right);
        this.name = name;
        
    }
    
    @Override
    public String toString() {
        return "(" + name + ": " + left.toString() + " ~ " + right.toString() + ")";
    }
}
