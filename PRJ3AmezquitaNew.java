/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj3amezquitanew;

/**
 *
 * @author Roberto
 */
public class PRJ3AmezquitaNew {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String input = "3/4 1/2 6/2";
        
        String[] fractions = input.split(" ");
        
        BinaryTree tree = new BinaryTree();
        
        for (String fraction : fractions){
            
            Fraction currentFraction = new Fraction(fraction);
            
            tree.insert(fraction);
            
            
        }
        
        tree.printAscending(tree.getRoot());
        
        tree.printResult();
        
    }
    
}
