package D01;

public class PessoaEstudante {

    private String nome;
    private int idade;
    private double altura;
    private boolean estudante;

    public PessoaEstudante(String nome, int idade, double altura, boolean estudante) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.estudante = estudante;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public boolean isEstudante() {
        return estudante;
    }

    @Override
    public String toString() {
        return "PessoaEstudante{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                ", estudante=" + estudante +
                '}';
    }
}
