
package aluno;

public class Alunoo {
        private String nome;
    private double nota1;
    private double nota2;
    // Construtor
    public Alunoo(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

   
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

   
    @Override
    public String toString() {
        return "Aluno: " + nome + " | Média: " + calcularMedia();
    }
    


    
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + calcularMedia());
    }
    }

