/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkginterface;

/**
 *
 * @author CAMARGO
 */
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                     Soma s = new Soma();
                     System.out.println(s.calcula(10, 10));
                     
                     OperaçãoMatematica d = new Subtração();
                     System.out.println(d.calcula(10, 5));
                     
                     multiplicação m = new multiplicação();
                     System.out.println(m.calcula(6, 7));
    
}
    
}
