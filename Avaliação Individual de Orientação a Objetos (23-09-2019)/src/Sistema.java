package com.company;

public class Sistema {
    public static void main(String[] args) {
    Curso curso = new Curso();

       Alunos aluno1 = new Aluno(curso,Disciplina,Serie);
       aluno1.setNome("Anderson");
       aluno1.setCurso(curso);
       aluno1.getCurso().setNomeCurso("ADS");
       aluno1.getAvaliacao().setAvaliacao(1.5);
       aluno1.getDisciplina().setdisciplina("LTP IV");
       aluno1.getSerie().setSerie(4);
       System.out.println(aluno1);
      
       System.out.println("-----------------------");
      
       Aluno aluno2 = new Aluno(curso,Disciplina,Serie);
       aluno2.setNome("Joao");
       aluno2.setCurso(curso);
       aluno2.getCurso().setNomeCurso("ADS");
       aluno2.getAvaliacao().setAvaliacao(9.8);
       aluno2.getDisciplina().setdisciplina("LTP IV");
       aluno2.getSerie().setSerie(4);
       System.out.println(aluno2);

       System.out.println("-----------------------");

       Aluno aluno3 = new Aluno(curso,Disciplina,Serie);
       aluno3.setNome("Joaquim");
       aluno3.setCurso(curso);
       aluno3.getCurso().setNomeCurso("ADS");
       aluno3.getAvaliacao().setAvaliacao(7.8);
       aluno3.getDisciplina().setdisciplina("SO");
       aluno3.getSerie().setSerie(2);
       System.out.println(aluno3);

       System.out.println("-----------------------");

       Aluno aluno4 = new Aluno(curso,Disciplina,Serie);
       aluno4.setNome("Maria");
       aluno4.setCurso(curso);
       aluno4.getCurso().setNomeCurso("ADS");
       aluno4.getAvaliacao().setAvaliacao(3.4);
       aluno4.getDisciplina().setdisciplina("SO");
       aluno4.getSerie().setSerie(2);
       System.out.println(aluno4);

       System.out.println("-----------------------");

       Aluno aluno5 = new Aluno(curso,Disciplina,Serie);
       aluno5.setNome("Anderson2");
       aluno5.setCurso(curso);
       aluno5.getCurso().setNomeCurso("ADS");
       aluno5.getAvaliacao().setAvaliacao(5.4);
       aluno5.getDisciplina().setdisciplina("SO");
       aluno5.getSerie().setSerie(4);
       System.out.println(aluno5);

       System.out.println("-----------------------");

       System.out.println("A média do curso de ADS é: " + (aluno1.getAvaliacao + aluno2.getAvaliacao + aluno3.getAvaliacao + 
       aluno4.getAvaliacao + aluno5.getAvaliacao) / 5);

       System.out.println("-----------------------");

       System.out.println("A média da série 4 é: " + (aluno1.setAvaliacao + aluno2.getAvaliacao + aluno5.getAvaliacao) / 3);

       System.out.println("-----------------------");

       System.out.println("A média do aluno Anderson é: " + (aluno1.setAvaliacao + aluno5.getAvaliacao) / 2);

       System.out.println("-----------------------");

       System.out.println("A média da disciplina SO é: " + (aluno3.getAvaliacao + aluno4.getAvaliacao + aluno5.getAvaliacao) / 3);
    }
}
    
    
    
    