package Projeto.Repositorios;

import java.util.ArrayList;
import java.util.Scanner;

import Projeto.Classes.Paciente;

public class RepPaciente {

  public ArrayList<Paciente> cambada;

  public RepPaciente() {
    this.cambada = new ArrayList<>();
  }

  public void cadastrar(Paciente novo, Scanner leitor) {

    boolean existe;

    while (true) {
      System.out.println("Digite o CPF: ");
      long cpf = leitor.nextLong();
      novo.setCpf(cpf);
      leitor.nextLine();
      existe = false;

      for (Paciente paciente : this.cambada) {
        if (paciente.getCpf() == novo.getCpf()) {
          existe = true;
        }
      }
      
      if (existe == true) {
        System.out.println("Esse paciente já existe!");
        System.out.println("Deseja cadastrar um novo paciente? \n 1 - Sim \n 2 - Não");
        int i = leitor.nextInt();
        leitor.nextLine();
        if (i == 1) {
          System.out.println("O cadastro começará novamente");
        } else if (i == 2) {
          break;
        }
      } else if ( existe == false) {
        System.out.println("Digite o nome: ");
        String nome = leitor.nextLine();
        novo.setNome(nome);

        System.out.println("Digite a idade: ");
        int idade = leitor.nextInt();
        novo.setIdade(idade);
        leitor.nextLine();

        System.out.println("Digite a data de nascimento (apenas números): ");
        int dataNas = leitor.nextInt();
        novo.setDataNas(dataNas);
        leitor.nextLine();

        System.out.println("Digite o email: ");
        String email = leitor.nextLine();
        novo.setEmail(email);

        System.out.println("Digite o telefone (apenas números): ");
        long telefone = leitor.nextLong();
        novo.setTelefone(telefone);
        leitor.nextLine();

        System.out.println("Digite a rua: ");
        String rua = leitor.nextLine();
        novo.setRua(rua);

        System.out.println("Digite o número da residencia: ");
        int numCas = leitor.nextInt();
        novo.setNumCas(numCas);
        leitor.nextLine();

        System.out.println("Digite o complemento: ");
        String complemento = leitor.nextLine();
        novo.setComplemento(complemento);

        System.out.println("Digite o bairro: ");
        String bairro = leitor.nextLine();
        novo.setBairro(bairro);

        // Sem os setts fica:
        // Paciente novo = new Paciente(nome, cpf, idade, dataNas, email, telefone, rua,
        // numCas, complemento, bairro);

        this.cambada.add(novo);
        System.out.println("Paciente cadastrado!");
        break;
      }
    }

  }

  public void deletar (Scanner leitor){
    System.out.println("Qual paciente deseja excluir?");
    cambada.forEach((n) -> {System.out.println(n.getNome());});
    int i = leitor.nextInt();
    leitor.nextLine();
    cambada.remove(i - 1);
    System.out.println("Paciente excluido!");

  }
  
  public void imprimir() {
    int i = 1;
    for (Paciente paciente : this.cambada) {
      System.out.println(i + " - " + paciente.getNome());
      i++;
      ;
    }
  }

}
