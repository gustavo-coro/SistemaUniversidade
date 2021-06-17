
package sistemauniversidade;


public class Historico {
    
    private float nota;
    private String conceito;
    private Disciplina disciplina;
    private Aluno aluno;
    private String status = "Sem status";

    public Historico() {
    }
    
    

    public Historico(float nota) {
        this.nota = nota;
        if(nota <= 10){
            this.conceito = "F";
        }else if(nota <= 20){
            this.conceito = "E";
        }else if(nota <= 40){
            this.conceito = "D";
        }else if(nota <= 60){
            this.conceito = "C";
        }else if(nota <= 80){
            this.conceito = "B";
        }else if(nota <= 100){
            this.conceito = "A";
        }
    }

    public float getNota() {
        return nota;
    }

    public String getConceito() {
        return conceito;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public void setConceito(float nota) {
        if(nota <= 10){
            this.conceito = "F";
        }else if(nota <= 20){
            this.conceito = "E";
        }else if(nota <= 40){
            this.conceito = "D";
        }else if(nota <= 60){
            this.conceito = "C";
        }else if(nota <= 80){
            this.conceito = "B";
        }else if(nota <= 100){
            this.conceito = "A";
        }
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public String toString() {
        return "Aluno: " + aluno.getNome() + " (" + aluno.getMatricula() 
                + " ) está matriculado na disciplina " + disciplina.getNome() +" (" + disciplina.getNumero() + " )";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(float nota) {
        if(nota < 60){
            this.status = "Reprovado";
        }else if(nota >= 60){
            this.status = "Aprovado";
        } 
    }

    
    public String emprimeAlunos(){
        return "Aluno: " + aluno.getNome() + " - Matrícula: Nº" + aluno.getMatricula() + " - Status: " + status;
    }
    
    
}
