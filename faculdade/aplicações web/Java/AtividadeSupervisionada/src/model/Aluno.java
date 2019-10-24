package model;

public class Aluno {

    private int mat;
    private String nome;
    private int idade;
    private String email;

    public Aluno() {
    }

    public Aluno(int mat, String nome, int idade, String email) {
        this.mat = mat;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
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

}
