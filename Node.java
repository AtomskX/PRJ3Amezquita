/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj3amezquitanew;

/**
 *
 * @author Roberto
 * @param <T>
 */
public class Node<T extends Comparable> {
    
    private Node leftChild, rightChild;
    
    private T value;    
    
    public Node(T value){
        
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
                
    }
    
    public Node getLeft(){
        
        return this.leftChild;
        
    }
    
    public Node getRight(){
        
        return this.rightChild;
        
    }
    
    public T getValue(){
        
        return this.value;
        
    }
    
    public void setLeft(Node node){
        
        this.leftChild = node;
        
    }
    
    public void setRight(Node node){
        
        this.rightChild = node;
        
    }
}


