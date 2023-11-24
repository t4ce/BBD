/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bdd;


public class LeafNode extends Node {
    boolean value;
    public LeafNode(boolean v){
        super(null,null);
        this.value = v;
    }

    @Override
    public String toString() {
        return "" + value;
    }
    
}
