/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pkginterface;

/**
 *
 * @author CAMARGO
 */
public interface OperaçãoMatematica {
    public int calcula(int a, int b);
    
    default void abc(int a){
        System.out.println(a+15);
    }
    static void imprimi(){
        System.out.println("abc");
    }
}
