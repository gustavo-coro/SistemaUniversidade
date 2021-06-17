
package sistemauniversidade;

import java.util.ArrayList;


public class Curso {
    
    private String nome;
    private String descricao;
    private int numero;
    private int horas;
    private String nivel;
    private Departamento departamento;
    //Armazena todas as disciplinas que fazem parte do curso
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina> ();

    public Curso(String nome, String descricao, int numero, int horas, String nivel, Departamento departamento) {
        this.nome = nome;
        this.descricao = descricao;
        this.numero = numero;
        this.horas = horas;
        this.nivel = nivel;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getNumero() {
        return numero;
    }

    public int getHoras() {
        return horas;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina disciplinas) {
        this.disciplinas.add(disciplinas);
    }
    
    
    
}
