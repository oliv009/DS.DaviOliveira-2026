/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe.abstrata;

/**
 *
 * @author CAMARGO
 */
public class Aluno extends pessoa {
    double nota1;
    double nota2;

    public Aluno(String nome, int idade, String matricula, double nota1, double nota2) {
        super(nome, idade, matricula);
        this.nota1=nota1;
        this.nota2=nota2;
    }
    double calcularMedia(){
        return (nota1 + nota2)/2;
    
      
    }
    void verificasituação(){
        if(calcularMedia()>=6){
            System.out.println("aprovado");
        }
        if(calcularMedia()<=5.9){
            System.out.println("recuperação");
        }
        if(calcularMedia()<=4){
            System.out.println("reprovado");
    }
    }
      
            @Override
    public double cacularBonus() {
        
        return 0;
        
    }
}
