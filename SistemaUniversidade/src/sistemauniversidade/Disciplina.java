
package sistemauniversidade;

import java.util.ArrayList;


public class Disciplina {
    
    private String nome;
    private String professor;
    private int semestre;
    private int ano;
    private int numero;
    private Curso curso;
    //Armazena os Alunos matriculados na Disciplina junto de suas notas
    private ArrayList<Historico> historico = new ArrayList <Historico> ();

    public Disciplina(String nome, String professor, int semestre, int ano, int numero) {
        this.nome = nome;
        this.professor = professor;
        this.ano = ano;
        this.numero = numero;
        if(semestre <= 6){
            this.semestre = 1;
        }else{
            this.semestre = 2;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getProfessor() {
        return professor;
    }

    public int getSemestre() {
        return semestre;
    }

    public int getAno() {
        return ano;
    }

    public int getNumero() {
        return numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    public ArrayList<Historico> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<Historico> historico) {
        this.historico = historico;
    }

    @Override
    public String toString() {
        return "Disciplina " + nome + ", número de identificação: " + numero;
    }
    
    
    
}
