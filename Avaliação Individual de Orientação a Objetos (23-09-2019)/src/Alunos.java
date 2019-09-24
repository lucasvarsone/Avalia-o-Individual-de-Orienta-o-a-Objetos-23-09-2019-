package com.company;
import java.util.*;

public class Alunos {
    private String nome;
    private String disciplina;
    private int serie;
    private String nomeCurso;
    Curso curso;
    
    public Alunos(Curso curso) {
        this.curso = curso;
    }   
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Curso getCurso() {
        return curso;
    }
    
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getdisciplina() {
        return disciplina;
    }
    
    public void setdisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getSerie() {
        return serie;
    }
    
    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }
    
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    
    @Override
    public String toString() {
        return "Aluno {\n" + 
                "Nome do aluno: " + nome + "\n"+ curso + "\n" + serie + "\n" + disciplina + "\n";

    
    }
}