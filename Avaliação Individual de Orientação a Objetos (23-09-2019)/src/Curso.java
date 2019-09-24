package com.company;
import java.util.*;

public class Curso {
    private String nomeCurso;
   
    public String getNomeCurso() {
        return nomeCurso;
    }
    
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    
    @Override
    public String toString() {
        return "Curso: "+ nomeCurso + "\n}";
    }
}