/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
public class aluno {
   private int np1;
   private int np2;
   private String nome;
   
   public aluno(int np1, int np2, String nome){
    if (np1 < 0 ||np1 > 100){
        this.np1 = 0;
    }
    else{
        this.np1 = np1;
}
     if (np1 < 0 ||np1 > 100){
        this.np2 = 0;
    }
    else{
        this.np2 = np1;
}
     this.nome = nome;
}

    /**
     * @return the np1
     */
    public int getNp1() {
        return np1;
    }

    
    public void setNp1(int np1) {
        this.np1 = np1;
    }

    
    public int getNp2() {
        return np2;
    }

  
    public void setNp2(int np2) {
        this.np2 = np2;
    }

 
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }
   
}
