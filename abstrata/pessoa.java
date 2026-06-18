/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe.abstrata;

/**
 *
 * @author CAMARGO
 */
public abstract class pessoa {
    String nome;
    int idade;
    String matricula;
    public pessoa(String nome, int idade, String matricula){
        this.nome=nome;
        this.idade=idade;
        this.matricula=matricula;
    }
    public abstract double cacularBonus();
    void exibirdados(){
        System.out.println("nome:"+ nome + "idade:" + idade + "matricula:" + matricula);
    }
    public String getnome(){
        return nome;
    }
    
    public int getidade(){
        return idade;
    }
    
    public String getmatricula(){
        return matricula;
        
    }
}
