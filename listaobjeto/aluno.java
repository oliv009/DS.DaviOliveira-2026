
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
public class aluno {
   private double np1;
   private double np2;
   private String nome;
   
   public aluno(String nome, Double np1, Double np2){
    if (np1 < 0 ||np1 > 100){
        this.np1 = 0;
    }
    else{
        this.np1 = np1;
}
     if (np2 < 0 ||np2 > 100){
        this.np2 = 0;
    }
    else{
        this.np2 = np2;
}
     this.nome = nome;
}

    /**
     * @return the np1
     */
    public double getNp1() {
        return np1;
    }

    /**
     * @param np1 the np1 to set
     */
    public void setNp1(double np1) {
        this.np1 = np1;
    }

    /**
     * @return the np2
     */
    public double getNp2() {
        return np2;
    }

    /**
     * @param np2 the np2 to set
     */
    public void setNp2(double np2) {
        this.np2 = np2;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the np1
     */
}
