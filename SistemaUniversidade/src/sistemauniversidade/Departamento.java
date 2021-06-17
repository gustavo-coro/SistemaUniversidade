
package sistemauniversidade;

import java.util.ArrayList;


public class Departamento {
    private String nome;
    private int codigo;
    private int sala;
    private String telefone;
    //Armazena todos os alunos que fazem parte do Departamento
    private ArrayList<Aluno> alunos = new ArrayList<Aluno> ();
    //Armazena todos os cursos que fazem parte do Departamento
    private ArrayList<Curso> cursos = new ArrayList<Curso> ();

    public Departamento(String nome, int codigo, int sala, String telefone) {
        this.nome = nome;
        this.codigo = codigo;
        this.sala = sala;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getSala() {
        return sala;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setAlunos(Aluno alunos) {
        this.alunos.add(alunos);
    }

    public void setCursos(Curso cursos) {
        this.cursos.add(cursos);
    }
    
    
    
}
