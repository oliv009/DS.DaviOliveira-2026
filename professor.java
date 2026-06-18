/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe.abstrata;

/**
 *
 * @author CAMARGO
 */
public class professor extends pessoa {
    double salario;
    String disciplina;

    public professor(String nome, int idade, String matricula, double salario, String disciplina) {
        super(nome, idade, matricula);
        this.salario = salario;
        this.disciplina=disciplina;
        
    }

    @Override
    public double cacularBonus() {
        return (salario*0.15)+salario;
    }
    void exibirDados(){
        System.out.println("salario:"+salario + "disciplina:"+disciplina);
    }
    
    
}
