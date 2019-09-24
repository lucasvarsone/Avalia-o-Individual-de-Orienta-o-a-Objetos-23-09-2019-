package com.company;
import java.util.*;

public class Serie {
    private int serie;

    public double getSerie() {
        return serie;
    }
    
    public void setSerie(int serie) {
        this.serie = serie;
    }  
    
    @Override
    public String toString() {
        return "Serie: "+ serie + "\n}";
    }
}

