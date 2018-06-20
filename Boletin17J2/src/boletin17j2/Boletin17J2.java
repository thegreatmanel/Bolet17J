/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17j2;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author propa
 */
public class Boletin17J2 {

    public static void notasAl() {
        int[] notas = {2, 4, 6, 7, 5};
        String[] alumnos = {"carlos", "alberto", "pepe", "amaia", "tristan"};
        int numsus = 0;
        int numaprob = 5 - numsus;
        int sumanot = 0;
        int notmed = sumanot / 5;
        int notant = 0;
        int notant2=0;
        ArrayList<String> aprobados= new ArrayList<String>();
        ArrayList<Integer> ordenadas= new ArrayList<Integer>();
        Iterator<String> lista =aprobados.iterator();
         Iterator<Integer> lista2 =ordenadas.iterator();
        for (int i = 0; i < 5; i++) {

            if (notas[i] < 5) {
                numsus++;
            }
            if (notas[i] > notant) {
                notant = notas[i];
            }
        }
        
        for (int i = 0; i < 5; i++) {
            if(notas[i]>5){
                aprobados.add(alumnos[i]);
            };
        }
        for (int i = 0; i < 5; i++) {
            if(notas[i]>5){
                aprobados.add(alumnos[i]);
            };}
         for (int z = 0; z < 5; z++) {
            for (int i = 0; i < 5; i++) {
            if(10-i==notas[i]){
                
                ordenadas.add(notas[i]);
              
              
            };}}
         
         JOptionPane.showMessageDialog(null,"aprobados: "+ numaprob+" suspensos: "+numsus+" nota media: "+notmed+" Nota máxima: " + notant);
        
         JOptionPane.showMessageDialog(null,"aprobados:");
         
         while(lista.hasNext()){
             String aproba=lista.next();
         JOptionPane.showMessageDialog(null, aproba);}
        
         JOptionPane.showMessageDialog(null,"Notas ordenadas:");
         
         while(lista2.hasNext()){
             int aproba2=lista2.next();
         JOptionPane.showMessageDialog(null, aproba2);}
         
         
         
         
         
         
         String alumno=JOptionPane.showInputDialog("Que alumno queres buscar?");
          for (int i = 0; i < 5; i++) {
            if(alumnos[i]==alumno){
                JOptionPane.showMessageDialog(null, "O alumno que busca ten un " + notas[i]);
                
            };}        

    
        };

    

    public static void main(String[] args) {
        notasAl();

    }

}
