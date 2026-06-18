/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classe.abstrata;

/**
 *
 * @author CAMARGO
 */
public class ClasseAbstrata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno a = new Aluno("Davi", 16, "16/06/2026", 10, 10);
        a.calcularMedia();
        a.verificasituação();
        a.cacularBonus();
        a.exibirdados();
        
        professor b = new professor("Henrique", 30, "30/09/2019",10000,"ds");
        b.cacularBonus();
        b.exibirdados();
        b.exibirDados();
    }
    
    
}
