package com.jeffersonantunes.ave.model;

public class Professor {

    private int matricula;
    private String nome;
    private String disciplina;

    public Professor() {
    }

    public int getMatriculaProfessor() {
        return matricula;
    }

    public void setMatriculaProfessor(int matriculaProfessor) {
        this.matricula = matriculaProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
