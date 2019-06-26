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
public class Fraction implements Comparable<Fraction> {

    private int numerator, denominator;
    
    private float value;
    
    public Fraction(String value){
        
        String[] numbers = value.split("/");
        
        this.numerator = Integer.parseInt(numbers[0]);
        
        this.denominator = Integer.parseInt(numbers[1]);
        
        this.value = numerator / denominator;        
        
    }
    
    public int compareTo(Fraction fraction) {
        
        if (this.value < fraction.value){
            
            return -1;
        }
        
        else if (this.value > fraction.value){
            
            return 1;
        }
        
        else{
            
            return 0;
            
        }
        
    }
    
    public float getValue(){
        
        return this.value;
        
    }
    
    
}
