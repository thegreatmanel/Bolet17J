/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17j;


import javax.swing.JOptionPane;

/**
 *
 * @author propa
 */
public class Boletin17J {

   public static void Array(){
   
    int array []=new int [6];
      
   for(int x=0;x<6;x++){
       int z;
        z=(int) (Math.random() * 50 );
       array[x]=z;
       
      
   }
   for(int j=1;j<6;j++){
       JOptionPane.showMessageDialog(null,array[6-j]);
   }
   
   
   }
    public static void main(String[] args) {
        Array();
        
        }
    }
    

