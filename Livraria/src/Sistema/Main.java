package Sistema;

import java.util.Scanner;

import Dados.Livro;
import Registro.Livraria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        Livraria livraria = new Livraria(10);  

        while (true) {
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Ordenar Livros");
            System.out.println("3. Pesquisar Livro");
            System.out.println("4. Listar todos os Livros");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            if (opcao == 1) {
                System.out.print("Título: ");
                String titulo = scanner.nextLine();
                System.out.print("Autor: ");
                String autor = scanner.nextLine();
                System.out.print("Ano de Publicação: ");
                int anoPublicacao = scanner.nextInt();
                scanner.nextLine(); 

                Livro livro = new Livro(titulo, autor, anoPublicacao);
                if (livraria.adicionarLivro(livro)) {
                    System.out.println("Livro cadastrado com sucesso!");
                }
            } else if (opcao == 2) {
                System.out.println("Ordenar livros por: 1. Título  2. Autor  3. Ano de Publicação");
                System.out.print("Escolha uma opção: ");
                int ordenacaoOpcao = scanner.nextInt();
                scanner.nextLine(); 

                if (ordenacaoOpcao == 1) {
                    livraria.ordenarPorTitulo();
                    System.out.println("Livros ordenados por título:");
                } else if (ordenacaoOpcao == 2) {
                    livraria.ordenarPorAutor();
                    System.out.println("Livros ordenados por autor:");
                } else if (ordenacaoOpcao == 3) {
                    livraria.ordenarPorAno();
                    System.out.println("Livros ordenados por ano de publicação:");
                } else {
                    System.out.println("Opção inválida!");
                }

                livraria.listarLivros();
            } else if (opcao == 3) {
                System.out.println("Pesquisar por: 1. Título  2. Autor  3. Ano de Publicação");
                System.out.print("Escolha uma opção: ");
              
                 
            } else if (opcao == 4) {
            	livraria.listarLivros();
               
            }else if (opcao == 5) {
            	break;
            	
            } else {
                System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
