package com.company;
import java.util.*;

public class Disciplina {
    private String disciplina;
    
    public String getdisciplina() {
        return disciplina;
    }
    
    public void setdisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    @Override
    public String toString() {
        return "Disciplina: "+ disciplina + "\n }";
    }
}