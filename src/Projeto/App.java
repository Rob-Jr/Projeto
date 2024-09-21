package Projeto;

import java.util.Scanner;

import Projeto.Classes.Paciente;
import Projeto.Repositorios.RepPaciente;

public class App {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      RepPaciente rep = new RepPaciente(); // Cria um repositorio vazio

      while (true) {

         System.out.println("O que deseja?");
         System.out.println("1 - Cadastrar");
         System.out.println("2 - Finalizar");
         int o = scan.nextInt();
         scan.nextLine();
         
         if (o == 1) {
            Paciente novo = new Paciente();
            rep.cadastrar(novo, scan);
         }
         else if (o == 2){
            break;
         }  else {
            System.out.println("Opção incorreta! \n Tente novamente!");
         }      
      }

      rep.imprimir();

      scan.close();

   }
}