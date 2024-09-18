package Projeto;
import java.util.Scanner;

public class Paciente {
    private String nome;
    private long cpf;
    private int idade;
    private int dataNas;
    private String email;
    private long telefone;
    private String rua;
    private String bairro;
    private String complemento;
    private int numCas;
    
    public Paciente(String nome, long cpf, int idade, int dataNas, String email, long telefone, String rua, int numCas, String complemento, String bairro){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.dataNas = dataNas;
        this.email = email;
        this.telefone = telefone;
        this.rua = rua;
        this.numCas = numCas;
        this.complemento = complemento;
        this.bairro = bairro;
   
    }
   
    public void cadastrar(){
    
        Scanner leitor = new Scanner(System.in); 
    
        System.out.println("Digite o nome: ");
        String nome = leitor.nextLine();
        this.setNome(nome);

        System.out.println("Digite o email: ");
        String email = leitor.nextLine();
        this.setEmail(email);
        
        System.out.println("Digite o rua: ");
        String rua = leitor.nextLine();
        this.setRua(rua);

        System.out.println("Digite o complemento: ");
        String complemento = leitor.nextLine();
        this.setComplemento(complemento);

        System.out.println("Digite o bairro: ");
        String bairro = leitor.nextLine();
        this.setBairro(bairro); 
        
        System.out.println("Digite o número da residencia: ");
        int numCas = leitor.nextInt();
        this.setNumCas(numCas);

        System.out.println("Digite o CPF: ");
        long cpf = leitor.nextLong();
        this.setCpf(cpf);

        System.out.println("Digite a idade: ");
        int idade = leitor.nextInt();
        this.setIdade(idade);

        System.out.println("Digite a data de nascimento (apenas números): ");
        int dataNas = leitor.nextInt();
        this.setDataNas(dataNas);

        System.out.println("Digite o telefone (apenas números): ");
        long telefone = leitor.nextLong();
        this.setTelefone(telefone);

        leitor.close();
    }
   

    public int getNumCas() {
        return numCas;
    }
    public void setNumCas(int numCas) {
        this.numCas = numCas;
    }
    public int getDataNas() {
        return dataNas;
    }
    public void setDataNas(int dataNas) {
        this.dataNas = dataNas;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getTelefone() {
        return telefone;
    }
    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
   
    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    
    @Override

    public String toString() {
		return  " Nome: " + this.getNome() +"\n CPF: " + this.getCpf() + "\n Data de Nascimento: " + this.getDataNas() + "\n Idade: " + this.getIdade()
         + "\n Email: " + this.getEmail() + "\n Telefone: " + this.getTelefone() + "\n Rua: " + this.getRua() + "\n Nº: " + this.getNumCas() + "\n Complemento: " + this.getComplemento() + "\n Bairro: " + this.getBairro();

	}


}
