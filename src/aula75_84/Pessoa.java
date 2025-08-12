package aula75_84;

public class Pessoa {

    // Atributes
    private int codigo;
    private String nome;
    private int idade;

    // Constructor
    public Pessoa(int codigo, String nome, int idade) {
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa() {
        super();
    }

    // Getters and Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    // toString()
    @Override
    public String toString() {
        return "----------------" +
                "\nPessoa:" +
                "\ncodigo = " + codigo +
                "\nnome = " + nome +
                "\nidade = " + idade;
    }
}
