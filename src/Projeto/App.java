package Projeto;
import java.util.ArrayList;
import java.util.Scanner;
public class App { 
public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   ArrayList<Paciente> cambada = new ArrayList<Paciente>();

   System.out.println("O que deseja?");
   System.out.println("1 - Cadastrar");
   int o = scan.nextInt();

   if (o == 1){
      Paciente novo = new Paciente(null, o, o, o, null, o, null, o, null, null);
      novo.cadastrar();
      cambada.add(novo);
      System.out.println("Paciente cadastrado!");
   }
   
   scan.close();
   
   cambada.forEach((n) -> { System.out.println(n.toString()); } );
   } 
}
