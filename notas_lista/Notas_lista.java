/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notas_lista;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CAMARGO
 */
public class Notas_lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Double>lista= new ArrayList();
        lista.add(3.0);
        lista.add(8.0);
        lista.add(7.0);
        lista.add(10.0);
        System.out.println(lista);
        lista.remove(0);
        System.out.println(lista);
        double media = 0;
        for (int i = 0; i< lista.size(); i++ ){
           lista.get(i);
           media = media + lista.get(i);
            System.out.println(media);
           System.out.println(media/lista.size()); 
           
    }
       Collections.sort(lista);
        System.out.println(lista);
        
        
    }
}
