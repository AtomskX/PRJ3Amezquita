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
public class BinaryTree<T extends Comparable> {
    
    private Node root;
    
    private String result;
    
    public BinaryTree(){
        
        root = null;
        
    }
    
    public void insert(T value){
                     
        root = recursiveInsert(root, value);
                
    }
    
    public Node recursiveInsert(Node root, T value){
        
        if (root == null){
            
            root = new Node(value);
            
            return root;
        }
        
        
        if (value.compareTo(root.getValue()) < 0){
            
            root.setLeft(recursiveInsert(root.getLeft(), value));
            
        }
        
        else if (value.compareTo(root.getValue()) > 0){
            
            root.setRight(recursiveInsert(root.getRight(), value));
            
        }
        
        return root;
        
    }
    
    public void printAscending(Node root){
        
        if (root == null){
           
            return;
            
        }        
        
        if (root.getLeft() != null){
            
            printAscending(root.getLeft());
                        
            
        }
        
        result += " " + root.getValue();
               
        if (root.getRight() != null){
            
            printAscending(root.getRight());
            
        }
        
                
    }
    
    
    public Node getRoot(){
        
        return this.root;
        
    }
    
    public void printResult(){
        
        System.out.println(this.result);
        
    }
    
}
