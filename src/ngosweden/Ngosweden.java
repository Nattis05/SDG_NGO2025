/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ngosweden;

import oru.inf.InfDB; 
import oru.inf.InfException; 
/**
 *
 * @author natha
 */

//
public class Ngosweden {
    
    private static InfDB idb;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        try{
            idb = new InfDB("ngosweden", "3306", "root", "Jonathan051023");
            
        } catch (Exception ex){
        System.out.println(ex.getMessage());
        }
}

    
}
