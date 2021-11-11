package model;

public class Aluno {
    private String nome;
    private String curso;
    private int anoInicio;
    private String cpf;

    public Aluno(String nome, String curso, int anoInicio, String cpf) {
        this.nome = nome;
        this.curso = curso;
        this.anoInicio = anoInicio;
        this.cpf = cpf;
    }

    public Aluno(String nome, String curso, int anoInicio) {
        this.nome = nome;
        this.curso = curso;
        this.anoInicio = anoInicio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
