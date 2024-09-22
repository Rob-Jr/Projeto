package Projeto;

import java.util.Scanner;

import Projeto.Classes.Paciente;
import Projeto.Repositorios.RepPaciente;

public class App {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      RepPaciente rep = new RepPaciente(); // Cria um repositorio vazio
      boolean escolha = true;

      while (true) {

         System.out.println("O que deseja?");
         System.out.println("1 - Cadastrar");
         System.out.println("2 - Exibir pacientes");
         System.out.println("3 - Deletar");
         System.out.println("4 - Finalizar");
         int o = scan.nextInt();
         scan.nextLine();
         
         switch (o) {
            case 1:
            Paciente novo = new Paciente();
            rep.cadastrar(novo, scan);
               break;
            case 2:
            rep.imprimir();
               break;
            case 3:
            rep.deletar(scan);
               break;
            case 4:
               escolha = false;
               break;
            default:
            System.out.println("Opção incorreta! \n Tente novamente!");
            break;
         }
         if (escolha == false) {
            break;
         }
      }

      scan.close();

   }
}