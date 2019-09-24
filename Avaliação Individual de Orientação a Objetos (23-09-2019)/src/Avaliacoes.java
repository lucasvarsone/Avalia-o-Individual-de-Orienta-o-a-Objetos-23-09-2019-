package com.company;
import java.util.*;

public class Avaliacoes {
    private double avaliacao;
    
    public double getAvaliacao() {
        return avaliacao;
    }
    
    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }  
    
    @Override
    public String toString() {
        return "Avaliação: "+ avaliacao + "\n}";
    }
}