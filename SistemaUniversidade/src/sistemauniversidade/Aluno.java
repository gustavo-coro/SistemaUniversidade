
package sistemauniversidade;

import java.util.ArrayList;


public class Aluno {
    
    private String nome;
    private int matricula;
    private String cpf;
    private String endereco;
    private String contato;
    private String nascimento;
    private String sexo;
    private String turma;
    private String programa;
    private Departamento departamento1;
    private Departamento departamento2;
    //Armazena as Disciplinas que o Aluno está matriculado junto de suas notas
    private ArrayList<Historico> historico = new ArrayList <Historico> ();

    public Aluno(String nome, int matricula, String cpf, String endereco, 
            String contato, String nascimento, String sexo, String turma,
            String programa, Departamento departamento1, Departamento departamento2) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.turma = turma;
        this.programa = programa;
        this.departamento1 = departamento1;
        if(departamento2 != null){
            this.departamento2 = departamento2;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getContato() {
        return contato;
    }

    public String getNascimento() {
        return nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTurma() {
        return turma;
    }

    public String getPrograma() {
        return programa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public Departamento getDepartamento1() {
        return departamento1;
    }

    public Departamento getDepartamento2() {
        return departamento2;
    }

    public void setDepartamento1(Departamento departamento1) {
        this.departamento1 = departamento1;
    }

    public void setDepartamento2(Departamento departamento2) {
        this.departamento2 = departamento2;
    }
    
     public ArrayList<Historico> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<Historico> historico) {
        this.historico = historico;
    }

    @Override
    public String toString() {
        return "Aluno:" + nome + ", matricula: " + matricula;
    }
    
    
    
}
