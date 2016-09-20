/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary_search;

/**
 *
 * @author afnan
 */
public class Binary_Search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Search s= new Search();
        s.displayElements();
        
        System.out.println("after passig bubblesoft");
        s.sortTheList();
        s.displayElements();
        
        System.out.println("binary search");
        s.binarySearch(12);
        
        
    }
    
}
