


import java.util.ArrayList;
import java.util.Scanner;


public class Lista_objeto {

   
   
        public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<aluno> alunolist = new ArrayList<>();

        int opcao;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Adicionar um número");
            System.out.println("2 - Remover um número pela posição");
            System.out.println("3 - Alterar um número");
            System.out.println("4 - Listar todos os números");
            System.out.println("5 – Ordenar Números");
            System.out.println("6 - Calcular a média");
            System.out.println("7 - Pesquisar um determinado número");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("insira a primeira nota:");
                    
                    
                    break;

                case 2:
                    // Remover um número pela posição
                    break;

                case 3:
                    // Alterar um número
                    break;

                case 4:
                    // Listar todos os números
                    break;

                case 5:
                    // Ordenar números
                    break;

                case 6:
                    // Calcular a média
                    break;

                case 7:
                    // Pesquisar se na lista tem um determinado número
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        entrada.close();
    }
}

    

