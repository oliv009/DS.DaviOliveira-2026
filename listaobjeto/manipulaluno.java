


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author CAMARGO
 */
public class manipulaluno {
    List<aluno> Listalunos = new ArrayList();
    
    public void inserir(){
        Scanner sc = new Scanner (System.in);
        System.out.println("digite o nome:");
        String nome = sc.nextLine();
        System.out.println("digite a nota:");
        Double np1 = Double.parseDouble(sc.nextLine());
        System.out.println("digite mais uma nota:");
        Double np2 = Double.parseDouble(sc.nextLine());
        Listalunos.add(new aluno(nome,np1,np2));
        
    }
    
    public void percorrer(){
        if(Listalunos.isEmpty()){
            System.out.println("nothing");
        }
        else{
            for (aluno indice: Listalunos){
                System.out.println("nome:" + indice.getNome());
                System.out.println("nota:" + indice.getNp1());
                System.out.println("nota2:" + indice.getNp2());
        }
    }
        
                 
}
    public void removeraluno(){
           Scanner sc = new Scanner (System.in);
        System.out.println("fala o indice ai");
        int indice = Integer.parseInt(sc.nextLine());
        if (indice >=0 || indice < Listalunos.size()){
        Listalunos.remove(indice);
            
        }
        else{
                System.out.println("incorreto");
                }
       }
    
    public void media(){
    for (aluno media : Listalunos){
        double média = (media.getNp1() + media.getNp2())/2;
        System.out.println("nome:" + media.getNome());
        System.out.println("media:" + média);
        if(média <= 45){
            System.out.println("reprovado");
        }
        else{
            System.out.println("aprovado");
        }
        
}
    
}
    
    public void mediageral(){
        
    }
}